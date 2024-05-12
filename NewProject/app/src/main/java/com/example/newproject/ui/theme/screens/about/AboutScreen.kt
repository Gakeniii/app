package com.example.newproject.ui.theme.screens.about

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.newproject.navigation.ROUTE_HOME
import com.example.newproject.navigation.ROUTE_LOGIN
import com.example.newproject.navigation.ROUTE_REGISTER

@Composable
fun AboutScreen(navController: NavController){
    Column (horizontalAlignment = Alignment.CenterHorizontally,verticalArrangement = Arrangement.Center){

        Box (
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth()
        ){
            Text(text = "WELCOME TO OUR ABOUT US SCREEN", fontWeight = FontWeight.Bold, fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.height(40.dp))
        Button(onClick = { navController.navigate(ROUTE_HOME)},
            colors = ButtonDefaults.buttonColors(containerColor = Color(
                red = 255,
                green = 102,
                blue = 0,
                alpha = 255
            )
            )) {
            Text(text = "BACK TO HOME SCREEN", color = Color.Black)
        }
        Spacer(modifier = Modifier.height(40.dp))
        Button(onClick = { navController.navigate(ROUTE_LOGIN)},
            colors = ButtonDefaults.buttonColors(containerColor = Color(
                red = 0,
                green = 150,
                blue = 136,
                alpha = 255
            )
            )) {
            Text(text = "GO TO LOGIN PAGE", color = Color.Black)
        }
        Spacer(modifier = Modifier.height(40.dp))
        Button(onClick = { navController.navigate(ROUTE_REGISTER)},
            colors = ButtonDefaults.buttonColors(containerColor = Color(
                red = 4,
                green = 134,
                blue = 11,
                alpha = 255
            )
            )) {
            Text(text = "REGISTER HERE", color = Color.Black, fontWeight = FontWeight.Bold)
        }
    }
}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Preview(){
//    AboutScreen()
}