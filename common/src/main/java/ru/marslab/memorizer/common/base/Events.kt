package ru.marslab.memorizer.common.base

interface Event

class ShowToast(val text: String) : Event
class ShowSnackBar(
    val text: String,
    val positiveAction: SnackBarAction? = null,
    val negativeButton: SnackBarAction? = null
) : Event
