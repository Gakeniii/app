package com.example.expensetrackingapp

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.expensetrackingapp.pages.Add
import com.example.expensetrackingapp.pages.Expenses
import com.example.expensetrackingapp.pages.Settings
import com.example.expensetrackingapp.ui.theme.ExpenseTrackingAppTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExpenseTrackingAppTheme {
                val navContoller = rememberNavController()
                val backStackEntry = navContoller.currentBackStackEntryAsState()
                // A surface container using the 'background' color from the theme
               Scaffold (
                   bottomBar = {
                       NavigationBar {
                           NavigationBarItem(
                               selected = backStackEntry.value?.destination?.route == "expenses",
                               onClick = { navContoller.navigate("expenses") },
                               label = {
                                   Text(text = "Expenses")
                               },
                               icon = {
                                   Icon(painter = painterResource(id = R.drawable.upload), contentDescription ="Upload" )
                               }
                           )
                           NavigationBarItem(
                               selected = backStackEntry.value?.destination?.route == "reports",
                               onClick = { navContoller.navigate("reports") },
                               label = {
                                   Text(text = "Reports")
                               },
                               icon = {
                                   Icon(painter = painterResource(id = R.drawable.bar2), contentDescription ="Report" )
                               }
                           )

                           NavigationBarItem(
                               selected = backStackEntry.value?.destination?.route == "add",
                               onClick = { navContoller.navigate("add") },
                               label = {
                                   Text(text = "Add")
                               },
                               icon = {
                                   Icon(painter = painterResource(id = R.drawable.add), contentDescription ="Report" )
                               }
                           )

                           NavigationBarItem(
                               selected = backStackEntry.value?.destination?.route?.startsWith("settings") ?: false,
                               onClick = { navContoller.navigate("settings") },
                               label = {
                                   Text(text = "Settings")
                               },
                               icon = {
                                   Icon(painter = painterResource(id = R.drawable.settings), contentDescription ="Report" )
                               }
                           )
                       }
                   },
                   content = { innerPadding ->
                       NavHost(navController = navContoller, startDestination = "expenses"){
                           composable("expenses"){
                               Surface (
                                   modifier = Modifier
                                       .fillMaxSize()
                                       .padding(innerPadding)
                               ){
                                   Expenses(navContoller, name = "Expenses")
                               }
                           }
                           composable("reports"){
                               Surface (
                                   modifier = Modifier
                                       .fillMaxSize()
                                       .padding(innerPadding)
                               ){
                                   Greeting(name = "Reports")
                               }
                           }
                           composable("add"){
                               Surface (
                                   modifier = Modifier
                                       .fillMaxSize()
                                       .padding(innerPadding)
                               ){
                                   Add(navContoller)
                               }
                           }
                           composable("settings"){
                               Surface (
                                   modifier = Modifier
                                       .fillMaxSize()
                                       .padding(innerPadding)
                               ){
                                   Settings(navContoller)
                               }
                           }
                           composable("settings/categories"){
                               Surface (
                                   modifier = Modifier
                                       .fillMaxSize()
                                       .padding(innerPadding)
                               ){
                                   Greeting(name = "Categories")
                               }
                           }
                       }
                   }
               )
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

//@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
//@Composable
//fun GreetingPreview() {
//    ExpenseTrackingAppTheme()
//}