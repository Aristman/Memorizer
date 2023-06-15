package ru.marslab.memorizer.common.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.ViewModelProvider
import ru.marslab.memorizer.common.theme.MemTheme
import javax.inject.Inject

abstract class BaseFragment<VM : BaseViewModel<*>> :
    Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    abstract val viewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.init()
        arguments?.let { viewModel.handleFragmentArguments(it) }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return container?.apply {
            addView(
                ComposeView(requireContext()).apply {
                    layoutParams = LayoutParams(
                        LayoutParams.MATCH_PARENT,
                        LayoutParams.MATCH_PARENT
                    )
                }
            )
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (viewModel as? LifecycleEventObserver)?.let { lifecycle.addObserver(it) }
        (view.rootView as ComposeView)
            .apply {
                setViewCompositionStrategy(
                    ViewCompositionStrategy.DisposeOnLifecycleDestroyed(
                        lifecycle = this@BaseFragment.lifecycle
                    )
                )
            }
            .setContent {
                MemTheme {
                    Dialogs(viewModel = viewModel)
                    Content(viewModel = viewModel)
                }
            }
    }

    protected open fun VM.init() {
    }

    @Composable
    open fun Dialogs(viewModel: VM) {
    }

    @Composable
    abstract fun Content(viewModel: VM)
}
