package com.example.androidproject

import android.content.Intent
import android.hardware.biometrics.BiometricManager.Strings
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidproject.ui.theme.AndroidProjectTheme

class ScrollActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val employees = listOf("petr","Mary","Annie","Angel","Jolly","hue","few","yew","fef","trench7","Kudu")
//                    ListScreen(modifier = Modifier,employees)
                    val career = listOf("1.Software Engineer","2.Data Analyst","3.Software developer","4.Data Scientist","5.AI Engineer")
                    ListScreen(modifier = Modifier,employees,career)


                }
            }
        }
    }
}

@Composable
fun ListScreen(modifier: Modifier=Modifier,employees:List<String>,career:List<String>){
    Box (Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.background),
            contentDescription = "Background Image",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )
    }
//    CREATING A COLUMN
    Column(modifier = Modifier.fillMaxSize()) {
        LazyRow (contentPadding = PaddingValues(10.dp)){
            items(items = employees){
                item->
                RowCard(modifier = modifier, name = item)
            }
        }
        LazyColumn (contentPadding = PaddingValues(10.dp)){
            items(items = career){
                    item->
                ColumnCard(modifier = modifier, name = item)
            }
        }

    }
}

//@Preview
//@Composable
//fun ListScreenPreview() {
//    ListScreen(modifier = Modifier,employees)
//}

@Composable
fun RowCard(modifier: Modifier,name: String){
    Card (
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .height(90.dp)
            .clip(shape = RoundedCornerShape(30.dp))
            .aspectRatio(1.2f), colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
        elevation = CardDefaults.cardElevation(10.dp)
    ){
        Box (
            modifier = Modifier
                .padding(10.dp)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Text(text = name, fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.Black)
        }
    }
}
@Composable
fun ColumnCard(modifier: Modifier,name: String){
    Card (
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(shape = RoundedCornerShape(40.dp))
            .aspectRatio(1.5f), colors = CardDefaults.cardColors(
            containerColor = Color.LightGray
        ),
        elevation = CardDefaults.cardElevation(1.dp)
    ){
        Box (
            modifier = Modifier
                .padding(10.dp)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Text(text = name, fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.Black)
        }

    }
}
