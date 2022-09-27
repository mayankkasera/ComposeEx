package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                        /*MyText()*/
                    }
                }
            }
        }
    }
}


@Composable
fun MyText() {
    //Text
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = stringResource(R.string.my_text).repeat(5),
            //Top to bottom execution
            Modifier
                .padding(20.dp)
                .background(MaterialTheme.colors.error)
                .width(300.dp),
            color = MaterialTheme.colors.primaryVariant,
            fontSize = 40.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Composable
fun AnnotatedText() {
    //Text
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(


            text = buildAnnotatedString {
               withStyle(style = ParagraphStyle(textAlign = TextAlign.Center)){
                   withStyle(style = SpanStyle(
                       color = Color.Red,
                       fontSize = 60.sp,
                       fontStyle = FontStyle.Italic,
                   )){
                       append("A")
                   }
                   append("n")
                   append("d")
                   append("r")
                   append("o")
                   append("i")
                   append("d")
               }
            },
            color = Color.Black,
            fontSize = 40.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.width(300.dp)

        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        /*MyText()*/
        AnnotatedText()
    }
}

