package org.prototype.esaytour.component.analytics

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.prototype.esaytour.theme.Colors.ActiveBarOneColor
import org.prototype.esaytour.theme.Colors.ActiveBarTextColor
import org.prototype.esaytour.theme.Colors.ActiveBarThreeColor
import org.prototype.esaytour.theme.Colors.ActiveBarTwoColor
import org.prototype.esaytour.theme.Colors.CardContainerColor
import org.prototype.esaytour.theme.Colors.OnCardContainerColor

@Composable
fun AnalyticsComposable() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(152.dp)
            .clip(RoundedCornerShape(20.dp)),
        colors = CardDefaults.cardColors(
            containerColor = CardContainerColor,
            contentColor = OnCardContainerColor
        ),
    ) {
        Column(
            modifier = Modifier
                .padding(
                    vertical = 16.dp,
                    horizontal = 20.dp
                ),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Text(
                text = "Analytics Today",
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
            )
            Row {
                AnalyticsBarComposable(
                    today = ((21f / 51f) * 100f),
                    upcoming = ((20f / 51f) * 100f),
                    completed = ((19f / 51f) * 100f)
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .width(12.dp)
                                .height(12.dp)
                                .background(
                                    color = ActiveBarOneColor,
                                    shape = RoundedCornerShape(50)
                                )
                        ) {}
                        Spacer(Modifier.width(12.dp))
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Today Activity",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.SemiBold,
                            )
                            Spacer(Modifier.width(24.dp))
                            Text(
                                text = "21",
                                fontSize = 16.sp,
                                color = ActiveBarTextColor
                            )
                        }
                    }
                }
                Column {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .width(12.dp)
                                .height(12.dp)
                                .background(
                                    color = ActiveBarTwoColor,
                                    shape = RoundedCornerShape(50)
                                )
                        ) {}
                        Spacer(Modifier.width(12.dp))
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Upcoming",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.SemiBold,
                            )
                            Spacer(Modifier.width(24.dp))
                            Text(
                                text = "20",
                                fontSize = 16.sp,
                                color = ActiveBarTextColor
                            )
                        }
                    }
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
            ) {
                Column {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .width(12.dp)
                                .height(12.dp)
                                .background(
                                    color = ActiveBarThreeColor,
                                    shape = RoundedCornerShape(50)
                                )
                        ) {}
                        Spacer(Modifier.width(12.dp))
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Completed",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.SemiBold,
                            )
                            Spacer(Modifier.width(40.dp))
                            Text(
                                text = "19",
                                fontSize = 16.sp,
                                color = ActiveBarTextColor
                            )
                        }
                    }
                }
            }
        }
    }
}