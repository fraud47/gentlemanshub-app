package zw.apkmechanic.gentleman.screens.home_page.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.unit.dp
import zw.apkmechanic.gentleman.R

@Composable
fun Labels() {
val labels = listOf(
    R.drawable.giovanni,

    R.drawable.carvela,
    R.drawable.nike,
    R.drawable.safari,
)
    LazyRow ( modifier = Modifier
        .padding(horizontal = 15.dp)
        .fillMaxWidth(),

    ){
    items(labels){
        label->
        Box(modifier = Modifier
        .padding(end = 10.dp).
        clip(RoundedCornerShape(10.dp))
            .background(Color.White)
            .width(100.dp)
            .height(50.dp)
            .padding(10.dp)




        ){
            Image(painter = painterResource(id = label),
                contentDescription = "giovanni",
                contentScale = ContentScale.Crop
            )
        }
    }


    }

}