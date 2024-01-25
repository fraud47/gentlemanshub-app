package zw.apkmechanic.gentleman.screens.home_page

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

import zw.apkmechanic.gentleman.screens.home_page.components.SearchBar
import zw.apkmechanic.gentleman.screens.home_page.components.TopBar
import androidx.hilt.navigation.compose.hiltViewModel
import zw.apkmechanic.gentleman.R
import zw.apkmechanic.gentleman.screens.home_page.components.BottomNavigationBar
import zw.apkmechanic.gentleman.screens.home_page.components.Cards
import zw.apkmechanic.gentleman.screens.home_page.components.Heading
import zw.apkmechanic.gentleman.screens.home_page.components.Labels

@Composable
fun HomeScreen(
    viewModel: HomeScreenViewModel=hiltViewModel()
) {

    val navIcons = listOf(
        R.drawable.ic_home,

        R.drawable.ic_favourite,
        R.drawable.ic_cart,
        R.drawable.ic_user,
    )
    val state by viewModel.state.collectAsState()

    Scaffold (
        contentColor = MaterialTheme.colorScheme.primary,
        bottomBar = {

       BottomNavigationBar()

        }

    ){
        Column (modifier = Modifier
            .padding(it)
            .fillMaxSize()
            .padding(top = 20.dp),
            ){
           TopBar()
            LazyColumn{
                item {
                    SearchBar(text =state.searchText , onValueChanged =viewModel::onSearchChanged )
                    Heading(title = "Categories")
                    Labels()
                    Heading(title = "Most Popular")
                    Cards()
                    Heading(title = "New Arrival")
                }
            }






        }
    }
}

@Composable
fun NavBar() {
    val navIcons = listOf(
        R.drawable.ic_home,

        R.drawable.ic_favourite,
        R.drawable.ic_cart,
        R.drawable.ic_user,
    )
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(30.dp)) {
        navIcons.forEach{
            i->
            Icon(painter = painterResource(id =navIcons[i]),
                contentDescription ="icon"+"${i}" )
        }
    }

}