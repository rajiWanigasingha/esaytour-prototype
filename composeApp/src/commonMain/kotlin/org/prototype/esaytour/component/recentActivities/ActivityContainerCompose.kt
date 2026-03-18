package org.prototype.esaytour.component.recentActivities

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
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
import esaytour.composeapp.generated.resources.Res
import esaytour.composeapp.generated.resources.car
import org.jetbrains.compose.resources.painterResource
import org.prototype.esaytour.theme.Colors.ActiveBarIconColor
import org.prototype.esaytour.theme.Colors.CardContainerColor
import org.prototype.esaytour.theme.Colors.OnCardContainerColor


data class ActivitySchema(
    val title: String,
    val description: String,
    val confirmed: Boolean?,
)

@Composable
fun ActivityContainerComposable() {
    val activities = listOf(
        ActivitySchema(
            title = "City Historical Tour",
            description = "Visit ancient monuments and museums",
            confirmed = true
        ),
        ActivitySchema(
            title = "Beach Excursion",
            description = "Relax and enjoy water activities",
            confirmed = true
        ),
        ActivitySchema(
            title = "Mountain Hiking",
            description = "Explore scenic trails and viewpoints",
            confirmed = false
        ),
        ActivitySchema(
            title = "Food Tour",
            description = "Taste local cuisine and delicacies",
            confirmed = null
        )
    )
    
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
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
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .background(
                            color = ActiveBarIconColor,
                            shape = RoundedCornerShape(50)
                        )
                ) {
                    Column(
                        modifier = Modifier.padding(8.dp),
                    ) {
                        Image(
                            modifier = Modifier
                                .width(24.dp)
                                .height(24.dp),
                            painter = painterResource(Res.drawable.car),
                            contentDescription = "Activity Image",
                        )
                    }
                }
                Spacer(modifier = Modifier.width(12.dp))
                Text(
                    text = "RMS 163",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            activities.forEach { activity ->
                TourActivitiesCardComposable(
                    title = activity.title,
                    description = activity.description,
                    confirmed = activity.confirmed
                )
                Spacer(modifier = Modifier.height(12.dp))
            }
        }
    }
}