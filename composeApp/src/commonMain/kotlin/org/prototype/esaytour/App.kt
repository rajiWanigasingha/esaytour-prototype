package org.prototype.esaytour

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.prototype.esaytour.component.analytics.AnalyticsComposable
import org.prototype.esaytour.component.contentBar.ContentBarComposable
import org.prototype.esaytour.component.recentActivities.RecentActivitiesComposable
import org.prototype.esaytour.component.titleBar.TitleBarComposable
import org.prototype.esaytour.component.topBar.TopBarComposable
import org.prototype.esaytour.theme.Colors.PrimaryColorGradiantFour
import org.prototype.esaytour.theme.Colors.PrimaryColorGradiantOne
import org.prototype.esaytour.theme.Colors.PrimaryColorGradiantThree
import org.prototype.esaytour.theme.Colors.PrimaryColorGradiantTwo

@Composable
@Preview
fun App() {
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
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
            TitleBarComposable {
                TopBarComposable()
            }
            ContentBarComposable {
                Column(
                    verticalArrangement = Arrangement.spacedBy(24.dp),
                ) {
                    AnalyticsComposable()
                    RecentActivitiesComposable()
                }
            }
        }
    }

}