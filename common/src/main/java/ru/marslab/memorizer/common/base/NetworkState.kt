package ru.marslab.memorizer.common.base

sealed class NetworkState {
    object Available : NetworkState()
    object Unavailable : NetworkState()
}
