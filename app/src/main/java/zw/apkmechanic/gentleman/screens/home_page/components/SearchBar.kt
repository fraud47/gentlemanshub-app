package zw.apkmechanic.gentleman.screens.home_page.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import zw.apkmechanic.gentleman.R
import zw.apkmechanic.gentleman.ui.theme.MainColor
import zw.apkmechanic.gentleman.ui.theme.Segoe


@Composable
fun SearchBar(
    text: String,
    onValueChanged: (String) -> Unit,
) {


Row (verticalAlignment = Alignment.CenterVertically,
    modifier = Modifier.padding(horizontal = 15.dp, vertical = 15.dp)) {
    TextField(
        value = text,
        onValueChange = onValueChanged,
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = Color.Transparent,
            focusedContainerColor = Color.Transparent,
            focusedIndicatorColor = Color.Gray.copy(.5f),
            unfocusedIndicatorColor = Color.Gray.copy(.5f)

        ),
        modifier = Modifier.fillMaxWidth(.80f),

        placeholder = {
            Text(text = "Search product...",
                fontFamily = Segoe,

                color = Color.Gray,

                fontSize = 16.sp
            )
        },
        leadingIcon ={
            Icon(painter = painterResource(id = R.drawable.ic_search),
                contentDescription = null,
                )},
        keyboardActions = KeyboardActions(onDone = {

        }),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        singleLine = true,
    )
Spacer(modifier = Modifier.weight(1f))

    Box(modifier = Modifier
        .clip(RoundedCornerShape(12.dp)
            ).background(MainColor)
        .padding(14.dp)){
        Icon(painter = painterResource(id = R.drawable.ic_filter),
            contentDescription = null,
            tint = Color.White,

            modifier = Modifier.size(24.dp))
    }


}

}






