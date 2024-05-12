package com.example.newproject.ui.theme.screens.success

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
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
import com.example.newproject.navigation.ROUTE_ABOUT
import com.example.newproject.navigation.ROUTE_HOME
import com.example.newproject.navigation.ROUTE_LOGIN

@Composable
fun SuccessRegistration(navController: NavController) {
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Text(text = "YOU HAVE BEEN SUCCESSFULLY REGISTERED!!",fontWeight = FontWeight.Bold, fontSize = 20.sp)
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "YOU HAVE BEEN SUCCESSFULLY LOGGED IN!!",fontWeight = FontWeight.Bold, fontSize = 20.sp)


        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = { navController.navigate(ROUTE_HOME)},
            colors = ButtonDefaults.buttonColors(containerColor = Color(
                red = 255,
                green = 102,
                blue = 0,
                alpha = 255
            )
            )) {
            Text(text = "GO TO HOME SCREEN", color = Color.Black)
        }
        Button(onClick = { navController.navigate(ROUTE_ABOUT) },
            colors = ButtonDefaults.buttonColors(containerColor = Color(
                red = 233,
                green = 5,
                blue = 112,
                alpha = 255
            )
            )) {
            Text(text = "ABOUT US",color = Color.Black)
        }

    }
    }


@Preview
@Composable
fun Preview(){
//    SuccessRegistration()
}