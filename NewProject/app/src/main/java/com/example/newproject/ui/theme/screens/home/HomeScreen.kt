package com.example.newproject.ui.theme.screens.home

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.newproject.R
import com.example.newproject.navigation.ROUTE_ABOUT
import com.example.newproject.navigation.ROUTE_ADD_PRODUCT
import com.example.newproject.navigation.ROUTE_LOGIN
import com.example.newproject.navigation.ROUTE_REGISTER
import com.example.newproject.navigation.ROUTE_VIEW_PRODUCT
import com.example.newproject.ui.theme.NewProjectTheme

class TopBarApp : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.background(Color.Black),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}


@Composable
fun HomeScreen(navController: NavController){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        var context = LocalContext.current
//        var productdata = productviewmodel(navController,context)
        Text(text = "HOME SCREEN",fontSize = 22.sp, fontWeight = FontWeight.Bold,color = Color.White)
        Spacer(modifier = Modifier.height(30.dp))

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = { navController.navigate(ROUTE_ADD_PRODUCT)},
            colors = ButtonDefaults.buttonColors(containerColor = Color(
                red = 9,
                green = 202,
                blue = 196,
                alpha = 255
            )
            )) {
            Text(text = "ADD PRODUCT", color = Color.Black)
        }
        Spacer(modifier = Modifier.height(40.dp))
        Button(onClick = { navController.navigate(ROUTE_VIEW_PRODUCT)},
            colors = ButtonDefaults.buttonColors(containerColor = Color(
                red = 179,
                green = 255,
                blue = 3,
                alpha = 255
            )
            )) {
            Text(text = "VIEW PRODUCT", color = Color.Black)
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}
