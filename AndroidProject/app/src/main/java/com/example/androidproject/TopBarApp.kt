package com.example.androidproject

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidproject.ui.theme.AndroidProjectTheme
//import kotlin.coroutines.jvm.internal.CompletedContinuation.context



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(){

    val context = LocalContext.current.applicationContext
//    TopAppBar - A function created for developers to create the top bar in an application
    TopAppBar(title = { Text(text = "JOY")},
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Face, contentDescription ="logo" )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Magenta,
            titleContentColor = Color.Black,
            navigationIconContentColor = Color.Green
        ),
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Home, contentDescription = "Home",tint = Color.Black)
            }
            IconButton(onClick = { Toast.makeText(context,"Search button",Toast.LENGTH_SHORT).show()}) {
                Icon(imageVector = Icons.Filled.Search, contentDescription = "Search button",tint = Color.Black)
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu",tint = Color.Black)
            }
            IconButton(onClick = {Toast.makeText(context,"Which platforms would you like to donate to",Toast.LENGTH_SHORT).show()}) {
                Icon(imageVector = Icons.Filled.Share, contentDescription = "Share too others",tint = Color.Black)
            }
        }
        )
}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TopBarPreview(){
    TopBar()
}