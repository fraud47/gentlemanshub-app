package zw.apkmechanic.gentleman.screens.home_page.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import zw.apkmechanic.gentleman.R

@Preview
@Composable
fun UserGreeting() {
    Row (){
        Box(
            modifier = Modifier
                .clip(CircleShape)
                .size(60.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile_pic),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop

            )
        }
        Spacer(modifier =Modifier.size(10.dp))
        Column {
            Text(text = "Daniel Stones,",
                style = MaterialTheme.typography.headlineSmall)
            Text(text = "What shoes do you want to buy?",
                style = MaterialTheme.typography.labelSmall)
        }



    }
}