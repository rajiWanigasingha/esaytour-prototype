package org.prototype.esaytour.component.recentActivities

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
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import esaytour.composeapp.generated.resources.Res
import esaytour.composeapp.generated.resources.goto
import org.jetbrains.compose.resources.painterResource
import org.prototype.esaytour.theme.Colors.ActiveTourBarColor
import org.prototype.esaytour.theme.Colors.ActiveTourBarConfirmColor
import org.prototype.esaytour.theme.Colors.ActiveTourBarConfirmTextColor
import org.prototype.esaytour.theme.Colors.ActiveTourBarPendingColor
import org.prototype.esaytour.theme.Colors.ActiveTourBarPendingTextColor
import org.prototype.esaytour.theme.Colors.ActiveTourBarRejectColor
import org.prototype.esaytour.theme.Colors.ActiveTourBarTextColor
import org.prototype.esaytour.theme.Colors.ActiveTourBarRejectTextColor

@Composable
fun TourActivitiesCardComposable(
    title: String,
    description: String,
    confirmed: Boolean?,
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(64.dp)
            .background(
                color = ActiveTourBarColor,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column {
                Text(
                    text = title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W600,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.fillMaxWidth(0.4f)
                )
                Text(
                    text = description,
                    fontSize = 12.sp,
                    color = ActiveTourBarTextColor,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.fillMaxWidth(0.5f)
                )
            }
            Column {
                Row {
                    if (confirmed != null) {
                        if (confirmed) {
                            FilterChip(
                                colors = FilterChipDefaults.filterChipColors(
                                    selectedContainerColor = ActiveTourBarConfirmColor,
                                    selectedLabelColor = ActiveTourBarConfirmTextColor
                                ),
                                onClick = {},
                                label = { Text("Confirmed") },
                                selected = true,
                            )
                        } else {
                            FilterChip(
                                colors = FilterChipDefaults.filterChipColors(
                                    selectedContainerColor = ActiveTourBarRejectColor,
                                    selectedLabelColor = ActiveTourBarRejectTextColor
                                ),
                                onClick = {},
                                label = { Text("Rejected") },
                                selected = true,
                            )
                        }
                    } else {
                        FilterChip(
                            colors = FilterChipDefaults.filterChipColors(
                                selectedContainerColor = ActiveTourBarPendingColor,
                                selectedLabelColor = ActiveTourBarPendingTextColor
                            ),
                            onClick = {},
                            label = { Text("Pending") },
                            selected = true,
                        )
                    }
                    IconButton(
                        onClick = {  }
                    ) {
                        Icon(
                            painter = painterResource(Res.drawable.goto),
                            contentDescription = "Go To",
                            modifier = Modifier.width(16.dp).height(16.dp)
                        )
                    }
                }
            }
        }
    }
}