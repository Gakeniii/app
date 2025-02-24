package com.example.expensetrackingapp.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.expensetrackingapp.components.TableRow
import com.example.expensetrackingapp.ui.theme.BackgroundElevated
import com.example.expensetrackingapp.ui.theme.DividerColor
import com.example.expensetrackingapp.ui.theme.Shapes
import com.example.expensetrackingapp.ui.theme.TopAppBackground

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Settings (navController: NavController){
    Scaffold (
        topBar = {
            MediumTopAppBar(
                title = { Text("Settings") }, colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = TopAppBackground
                )
            )
        },
        content = { innerPadding ->
            Column(modifier = Modifier.padding(innerPadding)) {
                Column (modifier = Modifier
                    .padding(16.dp)
                    .clip(Shapes.large)
                    .background(BackgroundElevated)
                    .fillMaxWidth()){
                    TableRow("Categories", hasArrow = true, modifier = Modifier.clickable{
                        navController.navigate("settings/categories")
                    })
                    Divider(modifier = Modifier
                        .padding(start = 16.dp), thickness = 1.dp, color = DividerColor)
                    TableRow("Erase all data", isDestructive = true )

                }
            }
        }
    )
}

fun TableRow(label: String, isDestructive: Boolean) {


}
