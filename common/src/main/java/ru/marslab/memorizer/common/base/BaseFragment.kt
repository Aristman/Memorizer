package ru.marslab.memorizer.common.base

import android.os.Bundle
import android.view.View
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.ViewModelProvider
import ru.marslab.memorizer.common.R
import ru.marslab.memorizer.common.theme.MemTheme
import javax.inject.Inject

abstract class BaseFragment<VM : BaseViewModel<*>> :
    Fragment(R.layout.fragment_compose_view) {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    abstract val viewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.init()
        arguments?.let { viewModel.handleFragmentArguments(it) }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (viewModel as? LifecycleEventObserver)?.let { lifecycle.addObserver(it) }
        view.findViewById<ComposeView>(R.id.main_view).setContent {
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
