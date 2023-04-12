package ru.marslab.memorizer.common.base

interface Event

class ShowToast(val text: String) : Event

sealed class PermissionEvent : Event {
    override fun equals(other: Any?) = false
    override fun hashCode() = System.identityHashCode(this)

    class Storage : PermissionEvent()
    class RecordAudio : PermissionEvent()
    class Camera : PermissionEvent()
    class FineLocation : PermissionEvent()
}
