package ru.marslab.memorizer.common.base

interface Action

sealed class AppAction : Action {
    object BackPressure : AppAction()
    object FreeScreenTap : AppAction()
}

data class SnackBarAction(
    val text: String,
    val action: Action
)
