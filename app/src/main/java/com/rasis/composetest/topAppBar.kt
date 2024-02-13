package com.rasis.composetest

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rasis.composetest.ui.theme.ComposeTestTheme

class topAppBar : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting9("Android")
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting9(name: String, modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Box(modifier = modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                    Text("TopAppBar")
                }
            },
                modifier = modifier
                    .padding(10.dp)
                    .clip(RoundedCornerShape(10.dp)), navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Outlined.Menu, contentDescription = "menu icon")
                    }
                }, actions = {
                    IconButton(onClick = { /*TODO*/ }) {

                        Icon(
                            imageVector = Icons.Outlined.FavoriteBorder,
                            contentDescription = "menu icon"
                        )
                    }
                    IconButton(modifier=modifier.size(50.dp),onClick = { /*TODO*/ }) {
                        BadgedBox(badge ={ Badge(Modifier.size(7.dp)) {
                        }} ) {
                            Icon(
                                imageVector = Icons.Outlined.ShoppingCart,
                                contentDescription = "menu icon"
                            )
                        }

                    }
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(

                    containerColor = Color.Red.copy(alpha = 0.2f)
                )
            )
        }


    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview9() {
    ComposeTestTheme {
        Greeting9("Android")
    }
}