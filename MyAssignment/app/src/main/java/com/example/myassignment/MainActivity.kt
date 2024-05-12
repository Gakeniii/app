package com.example.myassignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myassignment.ui.theme.MyAssignmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAssignmentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen(){
    Box(modifier = Modifier.fillMaxSize()) {
        Image(modifier = Modifier.matchParentSize(),
            contentScale = ContentScale.FillBounds,
            painter = painterResource(id = R.drawable.statue),
            contentDescription ="background" )
        Row (modifier = Modifier.horizontalScroll(ScrollState(2), true, null, false)) {
            Image(painter = painterResource(id = R.drawable.airport_8772948), contentDescription = "logo")
            Text(text = "TRAVELZY",modifier = Modifier.padding(horizontal = 8.dp),color = Color.White)
        }


            Box (
                modifier = Modifier.height(90.dp)
            ){
                Box (modifier = Modifier
                    .matchParentSize()
                    .padding(10.dp),
                    contentAlignment = Alignment.BottomStart
                ){
                    Text(text = "Explore the world here", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(text = "The best travel app in te world in 2021," +
                            "Answer for travelers to find their journey")

                    Button(
                        onClick = { /*TODO*/ }) {
                        Text(text = "Creating an account", color = Color.Black)
                    }
                    Text(text = "Already have an account", textDecoration = TextDecoration.Underline,color = Color.White)
                }
            }
        }
        }



@Preview
@Composable
fun Preview(){
    MainScreen()
}