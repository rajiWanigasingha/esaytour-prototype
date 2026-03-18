package org.prototype.esaytour.component.contentBar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import org.prototype.esaytour.theme.Colors.SecondaryColorGradiantOne
import org.prototype.esaytour.theme.Colors.SecondaryColorGradiantThree
import org.prototype.esaytour.theme.Colors.SecondaryColorGradiantTwo

@Composable
fun ContentBarComposable(
    composableContent: @Composable () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(
                brush = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.00f to SecondaryColorGradiantOne,
                        0.48f to SecondaryColorGradiantTwo,
                        1.00f to SecondaryColorGradiantThree,
                    ),
                ),
                shape = RoundedCornerShape(
                    topStart = 36.dp,
                    topEnd = 36.dp,
                    bottomStart = 0.dp,
                    bottomEnd = 0.dp
                )
            )
            .padding(
                horizontal = 16.dp,
                vertical = 36.dp
            )
    ) {
        composableContent()
    }
}