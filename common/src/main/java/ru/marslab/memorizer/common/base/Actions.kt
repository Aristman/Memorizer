package ru.marslab.memorizer.common.base

interface Action

sealed class AppAction : Action {
    object BackPressure : AppAction()
    object FreeScreenTap : AppAction()
}
