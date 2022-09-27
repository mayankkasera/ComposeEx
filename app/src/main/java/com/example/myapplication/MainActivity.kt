package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column {
                        Greeting("Android")
                        CustomText("Codeinger")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun CustomText(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {



        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {

            //Column = orientation vertical
            //Alignment, Arrangement
            /*understandAlignmentAndArrangement()*/

            //Weight
            /*understandWeight()*/

        }

        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Top
        ) {
            Surface(modifier = Modifier
                .width(100.dp)
                .height(50.dp),
                color = MaterialTheme.colors.primary) {}
            Surface(modifier = Modifier
                .width(100.dp)
                .height(50.dp),
                color = MaterialTheme.colors.primary) {}

        }


    }
}

@Composable
fun understandAlignmentAndArrangement(){
    Surface(modifier = Modifier
        .width(200.dp)
        .height(50.dp),
        color = MaterialTheme.colors.primary) {}

    Surface(modifier = Modifier
        .width(200.dp)
        .height(50.dp),
        color = MaterialTheme.colors.primary) {}

    Surface(modifier = Modifier
        .width(200.dp)
        .height(50.dp),
        color = MaterialTheme.colors.primary) {}
    Greeting("Android")
    CustomText("Codeinger")
}

@Composable
fun ColumnScope.understandWeight(){

    Surface(modifier = Modifier
        .width(200.dp)
        .weight(3f),
        color = MaterialTheme.colors.primary) {}

    Surface(modifier = Modifier
        .width(200.dp)
        .height(50.dp)
        .weight(1f),
        color = MaterialTheme.colors.secondary) {}
}