package org.prototype.esaytour.component.topBar

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import esaytour.composeapp.generated.resources.Res
import esaytour.composeapp.generated.resources.airplane
import esaytour.composeapp.generated.resources.dollar
import esaytour.composeapp.generated.resources.profilePic
import esaytour.composeapp.generated.resources.scan
import esaytour.composeapp.generated.resources.settings
import esaytour.composeapp.generated.resources.today
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import org.prototype.esaytour.theme.Colors.PrimaryTextColor
import org.prototype.esaytour.theme.Colors.PrimaryTextGradiantColor
import org.prototype.esaytour.theme.Colors.PrimaryTextVariantColor

data class MenuListSchema(
    val title: String,
    val icon: DrawableResource,
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarComposable() {

    val menuList = listOf(
        MenuListSchema(
            title = "Today",
            icon = Res.drawable.today,
        ),
        MenuListSchema(
            title = "Expenses",
            icon = Res.drawable.dollar,
        ),
        MenuListSchema(
            title = "Activities",
            icon = Res.drawable.airplane,
        ),
        MenuListSchema(
            title = "Scan",
            icon = Res.drawable.scan,
        ),
    )

    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "This Month",
                    fontSize = 12.sp,
                    color = PrimaryTextGradiantColor,
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "$ 23.45",
                    fontSize = 36.sp,
                    color = PrimaryTextColor,
                )
                Spacer(modifier = Modifier.height(4.dp))
                Row {
                    Text(
                        text = "LKR 8000",
                        fontSize = 12.sp,
                        color = PrimaryTextVariantColor,
                        fontWeight = FontWeight.SemiBold
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Text(
                        text = "EURO 20",
                        fontSize = 12.sp,
                        color = PrimaryTextVariantColor,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
            Column {
                Row {
                    IconButton(
                        onClick = {  }
                    ) {
                        Icon(
                            painter = painterResource(Res.drawable.settings),
                            contentDescription = "Settings",
                            tint = PrimaryTextColor,
                            modifier = Modifier
                                .width(24.dp)
                                .height(24.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(4.dp))
                    Box(
                        modifier = Modifier
                            .width(48.dp)
                            .height(48.dp)
                            .clip(RoundedCornerShape(24))
                    ) {
                        Image(
                            painter = painterResource(Res.drawable.profilePic),
                            contentDescription = "Profile Picture",
                            contentScale = ContentScale.Crop,
                        )
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(32.dp))
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ){
            menuList.forEach { menu ->
                TopBarActionButtonComposable(
                    resource = menu.icon,
                    text = menu.title
                )
            }
        }
    }
}