package ru.marslab.memorizer.common.base

import androidx.compose.runtime.Stable
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

@Stable
abstract class BaseWidgetModel<D> {

    protected open val widgets: List<BaseWidgetModel<*>> = emptyList()

    protected open val logCoroutineName = "WidgetCoroutine ${this::class.simpleName.orEmpty()}"
    private val coroutineName: String
        get() = logCoroutineName

    protected val coroutineScope =
        CoroutineScope(
            CoroutineName(coroutineName) + Dispatchers.Default + SupervisorJob()
        )
    private val initState: D
        get() = createInitState()

    private var viewModelActionReceiver: ((action: Action) -> Unit)? = null

    private val _state = MutableStateFlow(initState)
    val state: StateFlow<D> = _state.asStateFlow()

    private val _action = MutableSharedFlow<Action>()
    val action: SharedFlow<Action>
        get() = _action.asSharedFlow()

    fun registrationActionReceiver(receiver: (Action) -> Unit) {
        viewModelActionReceiver = receiver
    }

    infix fun sendAction(action: Action) {
        viewModelActionReceiver?.let { it(action) }
            ?: coroutineScope.launch {
                _action.emit(action)
            }
    }

    protected abstract fun createInitState(): D

    protected fun setState(state: () -> D) {
        _state.value = state()
    }

    fun onDestroy() {
        coroutineScope.cancel()
    }
}
