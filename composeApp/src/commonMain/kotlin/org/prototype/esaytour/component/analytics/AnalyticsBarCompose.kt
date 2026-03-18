package org.prototype.esaytour.component.analytics

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.prototype.esaytour.theme.Colors.ActiveBarOneColor
import org.prototype.esaytour.theme.Colors.ActiveBarThreeColor
import org.prototype.esaytour.theme.Colors.ActiveBarTwoColor

@Composable
fun AnalyticsBarComposable(
    today: Float,
    upcoming: Float,
    completed: Float
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            Card(
                modifier = Modifier
                    .width((300 * today / 100).dp)
                    .height(8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = ActiveBarOneColor
                ),
            ) {}
            Card(
                modifier = Modifier
                    .width((300 * upcoming / 100).dp)
                    .height(8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = ActiveBarTwoColor
                ),
            ) {}
            Card(
                modifier = Modifier
                    .width((300 * completed / 100).dp)
                    .height(8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = ActiveBarThreeColor
                ),
            ) {}
        }
    }
}