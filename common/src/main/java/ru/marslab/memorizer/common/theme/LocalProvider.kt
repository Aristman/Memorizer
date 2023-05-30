package ru.marslab.memorizer.common.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.platform.LocalContext
import ru.marslab.memorizer.common.base.NetworkState
import ru.marslab.memorizer.common.base.networkStateAsFlow

@Composable
internal fun LocalContentProvider(
    content: @Composable () -> Unit,
) {
    val networkState =
        LocalContext.current.networkStateAsFlow()
            .collectAsState(initial = NetworkState.Unavailable).value
    CompositionLocalProvider(
        LocalBrash provides memBrash,
        LocalColors provides memColors,
        LocalShapes provides memShapes,
        LocalDimens provides memDimens,
        LocalNetworkState provides networkState
    ) {
        content()
    }
}

internal val LocalBrash = compositionLocalOf { memBrash }

internal val LocalColors = compositionLocalOf { memColors }

internal val LocalShapes = compositionLocalOf { memShapes }

internal val LocalDimens = compositionLocalOf { memDimens }

internal val LocalTypes = compositionLocalOf { memTypes }

internal val LocalNetworkState = compositionLocalOf<NetworkState> { NetworkState.Unavailable }

@Composable
fun GetLocalProperties(
    content: @Composable (
        dimens: MemDimens,
        brash: MemBrash,
        colors: MemColors,
        shapes: MemShapes,
        types: MemTypes,
    ) -> Unit,
) {
    content(
        LocalDimens.current,
        LocalBrash.current,
        LocalColors.current,
        LocalShapes.current,
        LocalTypes.current
    )
}
