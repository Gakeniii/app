package com.example.androidproject

import android.content.Intent
import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.DeviceFontFamilyName
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import com.example.androidproject.ui.theme.AndroidProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .background(color = Color.Yellow)
                        .fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {

                    Column(
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(30.dp))
                            .border(width = 1.dp, color = Color.DarkGray)
                    ) {

//                        HelloClient("Gakeni")
//                        SecondLine()
//                        ThirdLine()


                        Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.Magenta)
                                .padding(18.dp)
                                .wrapContentHeight(align = Alignment.Top),
                            text = "Please register below",
                            fontSize = 18.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Black,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        TextFieldComponent("Enter your name")
                        Spacer(modifier = Modifier.height(20.dp))
                        TextFieldComponent("Username")
                        Spacer(modifier = Modifier.height(20.dp))
                        TextFieldComponent("Email address")
                        Spacer(modifier = Modifier.height(20.dp))
                        TextFieldComponent("DOB (DD/MM/YY)")


                        Spacer(modifier = Modifier.height(10.dp))
                        CheckBoxComponent(value = "I have read and agree with the terms and conditions")

//        CREATING A BUTTON
                        Button(
                            onClick = { /*TODO*/ },
                            Modifier.fillMaxWidth()
                        ) {
                            Text(
                                modifier = Modifier.padding(15.dp),
                                text = "REGISTER NOW"
                            )
                        }
//                        BUTTON FOR THE LOGIN PAGE
                        Spacer(modifier = Modifier.height(15.dp))
                        Button(
                            onClick = {
                                val intent = Intent(this@MainActivity, LoginActivity::class.java)
                                startActivity(intent)
                            },
                            Modifier.fillMaxWidth()
                        ) {
                            Text(
                                modifier = Modifier.padding(15.dp),
                                text = "LOGIN"
                            )
                        }
//                      BUTTON FROM THE IMAGE PAGE
                        Spacer(modifier = Modifier.height(15.dp))
                        Button(
                            onClick = {
                                val intent = Intent(this@MainActivity, ScrollActivity::class.java)
                                startActivity(intent)
                            },
                            Modifier.fillMaxWidth()
                        ) {
                            Text(
                                modifier = Modifier.padding(15.dp),
                                text = "IMAGE"
                            )
                        }
//                        BUTTON FOR CARD PAGE
                        Spacer(modifier = Modifier.height(15.dp))
                        Button(
                            onClick = {
                                val intent = Intent(this@MainActivity, CardActivity::class.java)
                                startActivity(intent)
                            },
                            Modifier.fillMaxWidth(),
                            colors = ButtonDefaults.buttonColors(Color.Yellow)
                        ) {
                            Text(
                                modifier = Modifier.padding(15.dp),
                                text = "CARD BUTTON"
                            )
                        }

//                        BUTTON FOR TOPBAR ACTIVITY


                    }
                }
                }
            }
        }
    }


//@Composable
//fun HelloClient(name: String){
////    Text(text = "Good afternoon $name")
//    TextComponent("Good Afternoon $name",45.sp, Color.Yellow, FontFamily.Cursive, FontWeight.Bold,TextAlign.Center)
//}


//PREVIEW IS A TRY-OUT
//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun HelloClientPreview() {
//    Column(
//        modifier = Modifier
//            .clip(shape = RoundedCornerShape(30.dp))
//            .border(width = 1.dp, color = Color.DarkGray)
//    ) {
////        HelloClient("Gakeni")
////        SecondLine()
////        Message()
//    TextComponent(
//        "Hey there",
//        25.sp,
//        Color.Black,
//        FontFamily.Serif,
//        FontWeight.Bold,
//        TextAlign.Center
//    )
//    TextComponent(
//        "PLEASE REGISTER...",
//        18.sp,
//        Color.Black,
//        FontFamily.Serif,
//        FontWeight.Bold,
//        TextAlign.Center
//    )
//    Spacer(modifier = Modifier.height(20.dp))
//    TextFieldComponent("Enter your name")
//    Spacer(modifier = Modifier.height(20.dp))
//    TextFieldComponent("Email address")
//    Spacer(modifier = Modifier.height(20.dp))
//    TextFieldComponent("Location")
//    Spacer(modifier = Modifier.height(20.dp))
//    TextFieldComponent("Password")
//
//    CheckBoxComponent(value = "I have read and agree with the terms and conditions")
//
//
////        CREATING A BUTTON
//    Spacer(modifier = Modifier.height(50.dp))
//    Button(
//        onClick = { /*TODO*/ },
//        Modifier.fillMaxWidth()
//    ) {
//        Text(
//            modifier = Modifier.padding(15.dp),
//            text = "REGISTER NOW"
//        )
//    }
//    Spacer(modifier = Modifier.height(40.dp))
//
//    Button(
//        onClick = { /*TODO*/ },
//        Modifier.fillMaxWidth()
//    ) {
//        Text(
//            modifier = Modifier.padding(15.dp),
//            text = "LOGIN"
//        )
//    }
//}

//END OF PREVIEW
//Column = Vertically
//Row = Horizontally

    //REAL APPLICATION
@Composable
fun SecondLine() {
    Text(text = "HELLO THERE,")
}

@Composable
fun ThirdLine() {
    Text(text = "Welcome back")
}

    //TEXT COMPONENT
@Composable
fun TextComponent(value: String,
                  size: TextUnit,
                  colorValue: Color,
                  fontFamilyValue: FontFamily,
                  fontWeightValue: FontWeight,
                  textAlign: TextAlign) {
    Text(modifier = Modifier
        .background(Color.Magenta)
        .padding(10.dp)
        .fillMaxWidth()
        .wrapContentHeight(align = Alignment.Top),
        text = value,
        fontSize = size,
        color = colorValue,
        fontFamily = fontFamilyValue,
        fontWeight = fontWeightValue,
        textAlign = textAlign)

}

@Composable
fun TextFieldComponent(myLabel: String) {
    var text by remember { mutableStateOf(value = "") }
    TextField(modifier = Modifier.fillMaxWidth(),
        value = text, onValueChange = {
            newText-> text = newText},
        label = { TextFieldLabels(value = myLabel)})

}


@Composable
fun TextFieldLabels(value: String) {
    Text(text = value)
}

    //CREATING A CHECKBOX
@Composable
fun CheckBoxComponent(value: String) {
    Row(
        Modifier
            .fillMaxWidth()
            .heightIn(56.dp)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        val checkedState = remember {
            mutableStateOf(value = false)
        }
        Checkbox(checked = checkedState.value, onCheckedChange = {

        })
        TextFieldLabels(value = value)
    }
}



