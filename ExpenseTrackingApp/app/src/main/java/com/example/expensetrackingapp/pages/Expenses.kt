package com.example.expensetrackingapp.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.expensetrackingapp.ui.theme.TopAppBackground

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Expenses(navController: NavController, name: String) {
    Scaffold (
        topBar = {
            MediumTopAppBar(title = { Text("Expenses")}, colors = TopAppBarDefaults.mediumTopAppBarColors(
                containerColor = TopAppBackground
            ))
        },
        content = {innerPadding ->
            Column (modifier = Modifier.padding(innerPadding)){
                Text(text = "Hello Expenses")
            }
        }
    )
}