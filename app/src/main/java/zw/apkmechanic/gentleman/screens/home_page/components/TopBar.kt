package zw.apkmechanic.gentleman.screens.home_page.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import zw.apkmechanic.gentleman.R



@Composable
fun TopBar() {
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 15.dp, vertical = 15.dp)
        , verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    , ){

      UserGreeting()



        Box(
            modifier = Modifier
                .clip(CircleShape)
                .size(60.dp)
                .background(Color.White),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_notifications),

                modifier = Modifier.size(40.dp),
                contentDescription = "icon"
            )
        }





    }
}

data class HomePageState(
    val isLoading: Boolean = false,
    val searchText: String = "",
    val isSearchHintVisible: Boolean = false,


    )