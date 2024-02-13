package com.rasis.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rasis.composetest.ui.theme.ComposeTestTheme

class stateitem : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting2("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {

    var count = remember {
        mutableIntStateOf(0)
    }
    Column(modifier = Modifier.fillMaxSize(),Arrangement.Center,Alignment.CenterHorizontally) {
        Button(onClick = { count.value++ }) {
            Text(text = "count =${count.intValue}")
        }
        Spacer(modifier = Modifier.size(25.dp))
        Text(text = "count= ${count.intValue}")

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    ComposeTestTheme {
        Greeting2("Android")
    }
}