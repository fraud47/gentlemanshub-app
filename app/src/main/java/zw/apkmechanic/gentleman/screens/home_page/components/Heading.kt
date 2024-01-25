package zw.apkmechanic.gentleman.screens.home_page.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import zw.apkmechanic.gentleman.ui.theme.Segoe
import zw.apkmechanic.gentleman.ui.theme.TextRed

@Composable
fun Heading(title: String) {

    Row (modifier = Modifier.padding(start = 15.dp, top = 20.dp, bottom = 20.dp,
        end = 15.dp), verticalAlignment = Alignment.CenterVertically){
        Text(
            text = title,
            style = MaterialTheme.typography.headlineLarge




        )
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "View All",
            fontFamily = Segoe,
            fontWeight = FontWeight.Bold,
            color = TextRed,
            fontSize = 14.sp,



        )
    }

}