package com.example.newsprojectpractice.ui.screens.signIn

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.newsprojectpractice.data.AuthViewModel
import com.example.newsprojectpractice.navigation.ROUTE_HOME
import com.example.newsprojectpractice.navigation.ROUTE_LOGIN


@SuppressLint("SuspiciousIndentation")
@Composable
fun SignUpScreen(navController: NavController) {
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var pass by remember { mutableStateOf(TextFieldValue("")) }
    var confirmpass by remember { mutableStateOf(TextFieldValue("")) }
    val context = LocalContext.current
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
    ) {

        Text(text = "WELCOME TO THE REGISTER PAGE", fontWeight = FontWeight.Bold, fontSize = 20.sp)
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "REGISTER now!!!",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            textDecoration = TextDecoration.Underline
        )

        OutlinedTextField(
            value = email, onValueChange = { email = it },
            label = { Text(text = "Enter Email") },

            keyboardOptions = KeyboardOptions . Default . copy (imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),

            )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(value =pass , onValueChange = {pass=it},
            label = { Text(text = "Enter password") },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value =confirmpass , onValueChange = {
            confirmpass=it},
            label = { Text(text = "Enter Confirm Password") },

            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))


        Button(onClick = {
            val myregister = AuthViewModel(navController, context)
            myregister.signup(email.text.trim(),pass.text.trim(),confirmpass.text.trim())
            navController.navigate(ROUTE_HOME)
        },
            colors = ButtonDefaults.buttonColors(containerColor = Color(
                red = 92,
                green = 200,
                blue = 83,
                alpha = 255
            )
            ),
            modifier = Modifier.fillMaxWidth()) {
            Text(text = "Sign up", color = Color.Black)
        }
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.navigate(ROUTE_LOGIN)
        }, colors = ButtonDefaults.buttonColors(containerColor = Color(
            red = 255,
            green = 109,
            blue = 0,
            alpha = 255
        )
        ),modifier = Modifier.fillMaxWidth()) {
            Text(text = "Have an Account? Click to Login", color = Color.Black)
        }

    }
}


