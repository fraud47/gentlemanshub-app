package zw.apkmechanic.gentleman.screens.home_page.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size

import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.BrushPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import zw.apkmechanic.gentleman.Data.Product
import zw.apkmechanic.gentleman.R
import zw.apkmechanic.gentleman.ui.theme.LightBlue
import zw.apkmechanic.gentleman.ui.theme.TextRed
import zw.apkmechanic.gentleman.ui.theme.kYellow

@Composable
fun ShoeCard(card:Product) {
Card(modifier = Modifier
    .padding(end = 20.dp)
    .shadow(
        10.dp, ambientColor = Color.Gray,
        spotColor = Color.Transparent
    )
    .clip(RoundedCornerShape(13.dp))
    .border(width = 2.dp, color = Color.Gray.copy(0.1f), shape = RoundedCornerShape(13.dp))
    .background(Color.White)
    .width(200.dp)
    .height(240.dp)



){

    Column {

        Box( modifier = Modifier
            .background(LightBlue)
            .fillMaxWidth()
            .height(150.dp),

        ){
            Image(painter = painterResource(id = card.img), contentDescription =null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.align(Alignment.Center)


            )
            Icon(imageVector = Icons.Default.Favorite,
                tint = TextRed,
                contentDescription ="favourite",
                modifier = Modifier
                    .size(22.dp) // Adjust the size of the icon
                    .offset(x = 150.dp, y = 15.dp))
        }
        Box(modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
            .padding(12.dp)){
            Column {
                Text(text = card.name, style = MaterialTheme.typography.labelLarge)
                Row ( modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    Text(text = "$"+card.price.toString(),
                        style = MaterialTheme.typography.bodySmall
                    )
                    Row (verticalAlignment = Alignment.CenterVertically){
                        Icon(painter = painterResource(id = R.drawable.ic_star),
                            tint = kYellow,
                            contentDescription ="star" )
                        Text(text = "4.8",
                            fontWeight = FontWeight.Bold)
                    }
                }

            }
            
        }

    }
}

}

