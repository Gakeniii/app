package com.example.newproject.ui.theme.screens.logins

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.newproject.data.AuthViewModel
import com.example.newproject.navigation.ROUTE_ABOUT
import com.example.newproject.navigation.ROUTE_HOME
import com.example.newproject.navigation.ROUTE_LOGIN
import com.example.newproject.navigation.ROUTE_REGISTER



@Composable
fun LoginScreen(navController: NavController) {
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    var context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Login here", fontSize = 25.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(50.dp))

        OutlinedTextField(
            value = email, onValueChange = { email = it },
            label = { Text(text = "Enter Email") },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = email, onValueChange = { password = it },
            label = { Text(text = "Enter Password") },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )

        Button(onClick = {
            val mylogin= AuthViewModel(navController, context)
            mylogin.login(email.text.trim(),password.text.trim())
        },colors = ButtonDefaults.buttonColors(containerColor = Color(
            red = 48,
            green = 79,
            blue = 254,
            alpha = 255
        )
        ), modifier = Modifier.fillMaxWidth()) {
            Text(text = "Log In")
        }
        Spacer(modifier = Modifier.height(20.dp))


        Button(onClick = {
            navController.navigate(ROUTE_REGISTER) },
            colors = ButtonDefaults.buttonColors(containerColor = Color(red = 255, green = 255, blue = 0, alpha = 255)),
            modifier = Modifier.fillMaxWidth()){
            Text(text = "Don't have account? Click to Register")
        }

    }
}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(rememberNavController())
}
