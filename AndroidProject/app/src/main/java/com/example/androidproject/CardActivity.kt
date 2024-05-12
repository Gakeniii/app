package com.example.androidproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androidproject.ui.theme.AndroidProjectTheme

class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                 Box (modifier = Modifier
                     .fillMaxWidth()
                     .padding(20.dp)){

                 ImageCard(painter = painterResource(id = R.drawable.birdie), contentDescription = "Image", title = "Humming bird enjoying the sunset", modifier = Modifier)
//                 ImageCard1(painter = painterResource(id = R.drawable.background), contentDescription = "Image", title ="Wall Flowers" )
//                 ImageCard3(painter = painterResource(id = R.drawable.emerald), contentDescription = "Image", title ="Bouquet of flowers" )
//                 ImageCard4(painter = painterResource(id = R.drawable.orange), contentDescription = "Image", title ="Digital 3D art" )

                 }
                }
            }
        }
    }
}
@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
){
    Card (shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(10.dp)
    ){
        Box (modifier = Modifier.height(100.dp)
        ){
        Image(painter = painter, contentDescription = contentDescription)
        Box (modifier = Modifier
            .matchParentSize()
            .padding(10.dp),
            contentAlignment = Alignment.BottomStart
            ){
            Text(text = title)
        }
        }
    }
}
@Composable
fun ImageCard1(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
){
    Card (shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(10.dp)
    ){
        Box (modifier = Modifier.height(200.dp)
        ){
            Image(painter = painter, contentDescription = contentDescription)
            Box (modifier = Modifier
                .matchParentSize()
                .padding(10.dp),
                contentAlignment = Alignment.BottomStart
            ){
                Text(text = title)
            }
        }
    }
}
@Composable
fun ImageCard2(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
){
    Card (shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(10.dp)
    ){
        Box (modifier = Modifier.height(200.dp)
        ){
            Image(painter = painter, contentDescription = contentDescription)
            Box (modifier = Modifier
                .matchParentSize()
                .padding(10.dp),
                contentAlignment = Alignment.BottomStart
            ){
                Text(text = title)
            }
        }
    }
}
@Composable
fun ImageCard3(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
){
    Card (shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(10.dp)
    ){
        Box (modifier = Modifier.height(200.dp)
        ){
            Image(painter = painter, contentDescription = contentDescription)
            Box (modifier = Modifier
                .matchParentSize()
                .padding(10.dp),
                contentAlignment = Alignment.BottomStart
            ){
                Text(text = title)
            }
        }
    }
}
@Composable
fun ImageCard4(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
){
    Card (shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(10.dp)
    ){
        Box (modifier = Modifier.height(200.dp)
        ){
            Image(painter = painter, contentDescription = contentDescription)
            Box (modifier = Modifier
                .matchParentSize()
                .padding(10.dp),
                contentAlignment = Alignment.BottomStart
            ){
                Text(text = title)
            }
        }
    }
}
