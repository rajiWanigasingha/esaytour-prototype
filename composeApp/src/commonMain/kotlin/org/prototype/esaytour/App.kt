package org.prototype.esaytour

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Preview
import org.prototype.esaytour.theme.Colors.PrimaryColorGradiantFour
import org.prototype.esaytour.theme.Colors.PrimaryColorGradiantOne
import org.prototype.esaytour.theme.Colors.PrimaryColorGradiantThree
import org.prototype.esaytour.theme.Colors.PrimaryColorGradiantTwo

@Composable
@Preview
fun App() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(
            brush = Brush.radialGradient(
                colorStops = arrayOf(
                    0.00f * 2  to PrimaryColorGradiantOne,
                    0.31f * 2  to PrimaryColorGradiantTwo,
                    0.73f * 2  to PrimaryColorGradiantThree,
                    1.00f * 2  to PrimaryColorGradiantFour,
                ),
                center = Offset(100f, 200f),
                radius = 1000f
            )
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .safeContentPadding()
        ) {
        }
    }
}