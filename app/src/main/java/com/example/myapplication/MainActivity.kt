package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
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
                        MyTextField()
                    }
                }
            }
        }
    }
}


@Composable
fun MyTextField() {
    //Text
    Column(modifier = Modifier.fillMaxSize()) {

        var text by remember { mutableStateOf("Hello") }

        TextField(
            value = text,
            enabled = true,
            readOnly = false,
            singleLine = true,
            maxLines = 2,
            label = {
                Text(text = "hello")
            },
            leadingIcon = {
                IconButton(onClick = {  }) {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = ""
                    )
                }
            },
            trailingIcon = {
                IconButton(onClick = {  }) {
                    Icon(
                        imageVector = Icons.Filled.Check,
                        contentDescription = ""
                    )
                }
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Done
            ),
            onValueChange = {
                text = it
            },

        )
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        /*MyText()*/
        MyTextField()
    }
}

