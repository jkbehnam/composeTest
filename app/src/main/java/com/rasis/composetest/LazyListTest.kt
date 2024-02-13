package com.rasis.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rasis.composetest.ui.theme.ComposeTestTheme

class LazyListTest : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting5("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting5(name: String, modifier: Modifier = Modifier) {
    val lang = listOf(
        "behnam",
        "behzad",
        "ali",
        "amir",
        "hassan",
        "hamed",
        "karim",
        "behzad",
        "ali",
        "amir",
        "hassan",
        "hamed",
        "karim",
        "behzad",
        "ali",
        "amir",
        "hassan",
        "hamed",
        "karim",
        "behzad",
        "ali",
        "amir",
        "hassan",
        "hamed",
        "karim"
    )
    Column(modifier = Modifier.fillMaxSize()) {
        LazyRow() {
            items(items = lang) { item ->
                RowItem(modifier, name = item.toString())
            }
        }
        LazyColumn() {
            items(items = lang) { item ->
                ColumnItem(modifier, name = item.toString())
            }
        }

    }

}

@Composable
fun ColumnItem(modifier: Modifier, name: String) {
    Card(
        modifier = modifier
            .padding(10.dp)
            .wrapContentSize()

            .aspectRatio(2.5f), elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Box(

            modifier = modifier
                .padding(10.dp)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {

            Row(modifier=Modifier.fillMaxSize()) {

                Image(painter = painterResource(id =  R.drawable.tower_bridge), contentDescription =null )
                Text(text = name, fontSize = 23.sp, fontWeight = FontWeight.Bold)
            }



        }
    }
}

@Composable
fun RowItem(modifier: Modifier, name: String) {

    Card(
        modifier = modifier
            .padding(10.dp)
            .fillMaxWidth()
            .height(100.dp)

            .aspectRatio(1.6f), elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Box(
            modifier = modifier
                .padding(10.dp)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) { Text(text = name, fontSize = 23.sp, fontWeight = FontWeight.Bold) }

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview5() {
    ComposeTestTheme {
        Greeting5("Android")
    }
}