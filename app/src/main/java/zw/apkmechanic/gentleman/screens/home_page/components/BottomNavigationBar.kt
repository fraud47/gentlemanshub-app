package zw.apkmechanic.gentleman.screens.home_page.components
import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import zw.apkmechanic.gentleman.Data.BottomNavigation
import zw.apkmechanic.gentleman.R
import zw.apkmechanic.gentleman.ui.theme.MainColor

val items = listOf(
    BottomNavigation(
        title = "Home",
        icon = R.drawable.ic_home
    ),

    BottomNavigation(
        title = "Favourites",
        icon = R.drawable.ic_favourite
    ),

    BottomNavigation(
        title = "Cart",
        icon = R.drawable.ic_cart
    ),

    BottomNavigation(
        title = "Account",
        icon = R.drawable.ic_user
    )
)

@Preview
@Composable
fun BottomNavigationBar() {
    NavigationBar {
        Row(
            modifier = Modifier.background(Color.White)
        ) {

            items.forEachIndexed { index, item ->
                NavigationBarItem(
                    selected = index == 0,
                    onClick = {},
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = MainColor,
                        unselectedIconColor = Color.Gray.copy(0.7f),
                        selectedTextColor = MainColor,
                        unselectedTextColor = Color.Gray.copy(0.7f),
                        indicatorColor = Color.White

                    ),
                    icon = {
                        Icon(
                            painter = painterResource(id = item.icon),
                            contentDescription = item.title,
                            modifier = Modifier.size(30.dp)
                        )
                    },
                    label = {
                        Text(
                            text = item.title,
                        )
                    }
                )
            }

        }
    }
}