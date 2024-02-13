package com.rasis.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rasis.composetest.ui.theme.ComposeTestTheme

class cardTest : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting4("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting4(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier
                .height(270.dp)
                //  .shadow(elevation = 10.dp,spotColor = Color.Red, shape = CircleShape)
                .width(200.dp),
            elevation = CardDefaults.cardElevation(10.dp),

            colors = CardDefaults.cardColors(
                Color.White
            ),
            shape = RoundedCornerShape(15.dp)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Image(
                    painter = painterResource(id = R.drawable.tower_bridge),
                    contentDescription = null
                )
                Text(text = "London", modifier=Modifier.padding(10.dp),  fontWeight = FontWeight.Bold)
                Text(modifier=Modifier.padding(10.dp), color = Color.Gray,text = "lourm ipsonskj fjdkjfs jfjdf jsdjfk slkdfjs sdfkjs dfkjsdfkj lskdjfk jsdf")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview4() {
    ComposeTestTheme {
        Greeting4("Android")
    }
}