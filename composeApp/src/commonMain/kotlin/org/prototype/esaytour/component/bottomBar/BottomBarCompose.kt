package org.prototype.esaytour.component.bottomBar

import androidx.compose.animation.*
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import esaytour.composeapp.generated.resources.*
import org.jetbrains.compose.resources.painterResource
import org.prototype.esaytour.theme.Colors.BottomBarContainerColor
import org.prototype.esaytour.theme.Colors.PrimaryColorGradiantFour
import org.prototype.esaytour.theme.Colors.PrimaryTextColor

@Composable
fun BottomBarComposable() {
    var selectedNav by remember { mutableStateOf(0) }

    val navItems = listOf(
        Triple(Res.drawable.home, "Home", 0),
        Triple(Res.drawable.airplane, "Activity", 1),
        Triple(Res.drawable.dollar, "Expenses", 2),
        Triple(Res.drawable.scan, "Scan", 3),
    )

    Box(
        modifier = Modifier
            .padding(horizontal = 48.dp, vertical = 56.dp)
            .fillMaxWidth()
            .height(56.dp)
            .clip(RoundedCornerShape(28.dp))
            .background(color = PrimaryColorGradiantFour)
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 8.dp)
                .fillMaxHeight()
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            navItems.forEach { (icon, label, index) ->
                val isSelected = selectedNav == index

                val weight by animateFloatAsState(
                    targetValue = if (isSelected) 2.5f else 1f,
                    animationSpec = tween(durationMillis = 400, easing = FastOutSlowInEasing),
                    label = "weight_$index"
                )

                val bgColor by animateColorAsState(
                    targetValue = if (isSelected) BottomBarContainerColor else Color.Transparent,
                    animationSpec = tween(durationMillis = 400),
                    label = "color_$index"
                )

                val interactionSource = remember { MutableInteractionSource() }
                val isPressed by interactionSource.collectIsPressedAsState()
                val scale by animateFloatAsState(
                    targetValue = if (isPressed) 0.95f else 1f,
                    animationSpec = spring(dampingRatio = Spring.DampingRatioMediumBouncy),
                    label = "scale_$index"
                )

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .weight(weight)
                        .fillMaxHeight()
                        .padding(vertical = 6.dp, horizontal = 4.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(bgColor)
                        .scale(scale)
                        .clickable(
                            interactionSource = interactionSource,
                            indication = null
                        ) { selectedNav = index }
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                    ) {
                        Icon(
                            painter = painterResource(icon),
                            contentDescription = label,
                            tint = PrimaryTextColor,
                            modifier = Modifier.size(20.dp)
                        )

                        AnimatedVisibility(
                            visible = isSelected,
                            enter = fadeIn(tween(200)) + expandHorizontally(tween(300)),
                            exit = fadeOut(tween(150)) + shrinkHorizontally(tween(300)),
                        ) {
                            Row {
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = label,
                                    color = PrimaryTextColor,
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.W600,
                                    maxLines = 1,
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}