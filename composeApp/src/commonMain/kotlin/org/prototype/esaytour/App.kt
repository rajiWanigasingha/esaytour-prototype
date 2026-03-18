package org.prototype.esaytour

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.prototype.esaytour.component.contentBar.ContentBarComposable
import org.prototype.esaytour.component.titleBar.TitleBarComposable
import org.prototype.esaytour.theme.Colors.PrimaryColorGradiantFour
import org.prototype.esaytour.theme.Colors.PrimaryColorGradiantOne
import org.prototype.esaytour.theme.Colors.PrimaryColorGradiantThree
import org.prototype.esaytour.theme.Colors.PrimaryColorGradiantTwo
import org.prototype.esaytour.theme.Colors.SecondaryColorGradiantOne
import org.prototype.esaytour.theme.Colors.SecondaryColorGradiantThree
import org.prototype.esaytour.theme.Colors.SecondaryColorGradiantTwo

@Composable
@Preview
fun App() {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.radialGradient(
                        colorStops = arrayOf(
                            0.00f * 2 to PrimaryColorGradiantOne,
                            0.31f * 2 to PrimaryColorGradiantTwo,
                            0.73f * 2 to PrimaryColorGradiantThree,
                            1.00f * 2 to PrimaryColorGradiantFour,
                        ),
                        center = Offset(100f, 200f),
                        radius = 1000f
                    )
                )
                .safeContentPadding()
        ) {
            TitleBarComposable {  }
            ContentBarComposable {  }
        }
    }

}