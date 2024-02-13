package com.rasis.composetest.navigationTest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rasis.composetest.navigationTest.ui.theme.ComposeTestTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting10("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting10(name: String, modifier: Modifier = Modifier) {
    var name by remember {
        mutableStateOf("")
    }
    var age by remember {
        mutableStateOf("15")
    }
    Column(modifier = modifier.fillMaxSize().padding(top = 10.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        TextField(value = name, onValueChange = {name=it}, placeholder = {
            Text(text = "enter your name")
        })
        TextField(modifier=modifier.padding(top=15.dp),value = age, onValueChange = {age=it}, label = {
            Text(text = "enter your age")
        })
        Button(modifier=modifier.padding(top=15.dp),onClick = { /*TODO*/ }) {
            Text(text = "submit")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview105() {
    ComposeTestTheme {
        Greeting10("Android")
    }
}