package com.rasis.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.Done
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rasis.composetest.ui.theme.ComposeTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(25.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "simple button")
        }
        OutlinedButton(onClick = { /*TODO*/ }) {
            Text(text = "Outline Button")
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Filled.ShoppingCart, contentDescription = null)
        }
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "سلام")
            Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
            Icon(
                modifier = Modifier.size(ButtonDefaults.IconSize),
                imageVector = Icons.Outlined.Done,
                contentDescription = null,
                tint = Color.Red
            )
        }
        IconButton(modifier=modifier.size(65.dp),onClick = { /*TODO*/ }) {
            BadgedBox(badge ={ Badge() {
            }
            } ) {
                Icon(
                    imageVector = Icons.Outlined.ShoppingCart,
                    contentDescription = "menu icon"
                )
            }

        }
        Button(
            onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                containerColor = Color(0x0FC94242)
            )
        ) {

            Icon(
                modifier = Modifier.size(ButtonDefaults.IconSize),
                imageVector = Icons.Outlined.Favorite,
                contentDescription = null,
                tint = Color.Red
            )
            Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
            Text(text = "سلام")
        }

        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(topStart = 10.dp, bottomEnd = 10.dp)
        ) {
            Icon(
                modifier = Modifier.size(ButtonDefaults.IconSize),
                imageVector = Icons.Outlined.Favorite,
                contentDescription = null,
                tint = Color.Red
            )
            Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
            Text(text = "سلام")
        }
        Button(
            onClick = { /*TODO*/ },
            border = BorderStroke(1.dp, Color(0xFF007DEC)),
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0x0FC94242)
            )


        ) {
            Icon(
                modifier = Modifier.size(60.dp),
                imageVector = Icons.Outlined.Favorite,
                contentDescription = null,
                tint = Color.Red
            )
        }
        Button(
            onClick = { },
            border = BorderStroke(1.dp, Color.Red),
            shape = RoundedCornerShape(50), // = 50% percent
            // or shape = CircleShape
            colors = ButtonDefaults.buttonColors(contentColor = Color.Red)
        ){
            Text( text = "Save" )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeTestTheme {
        Greeting("Android")
    }
}