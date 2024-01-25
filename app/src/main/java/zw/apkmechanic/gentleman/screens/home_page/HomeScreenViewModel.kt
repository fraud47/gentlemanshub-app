package zw.apkmechanic.gentleman.screens.home_page

import androidx.lifecycle.ViewModel
import zw.apkmechanic.gentleman.screens.home_page.components.HomePageState
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel

import androidx.lifecycle.SavedStateHandle
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle
): ViewModel() {

    private val searchText = savedStateHandle.getStateFlow("searchText", "")
    private val isSearchFocused = savedStateHandle.getStateFlow("isSearchFocused", false)



    val state = combine(
        searchText,
        isSearchFocused,


        ) { searchText, isSearchFocused->
        HomePageState(
            searchText = searchText,
            isSearchHintVisible = searchText.isEmpty() && !isSearchFocused,


            )
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), HomePageState())




    init {



    }

    fun onSearchChanged(text: String) {
        savedStateHandle["searchText"] = text
    }


    fun onSearchFocusChanged(isFocused: Boolean) {
        savedStateHandle["isSearchFocused"] = isFocused
    }




}