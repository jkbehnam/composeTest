package com.rasis.composetest

import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rasis.composetest.ui.theme.ComposeTestTheme

class StringStyle : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting3("Android")
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting3(name: String, modifier: Modifier = Modifier) {

    var textnewValue by remember {
        mutableStateOf("")
    }
    val myFont = FontFamily(Font(R.font.alfa_slab_one))
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            modifier = Modifier.background(Color.Gray),
            text = stringResource(R.string.foundername).repeat(10),
            color = Color.Blue,
            fontSize = 24.sp,
            fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
            fontWeight = FontWeight.Light,
            fontFamily = myFont,
            textAlign = TextAlign.Center
        )
        TextField(value = textnewValue, onValueChange = { textnewValue = it })

        TextField(value = textnewValue, onValueChange = {textnewValue=it},
            modifier=Modifier.padding(top=20.dp).clip(RoundedCornerShape(5.dp)),
            label = {
                Text(text = "type your name")
            },
            trailingIcon = {
                Icon(imageVector = Icons.Outlined.Favorite, contentDescription = null)
            },
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Email, contentDescription = null)
            },
            colors = TextFieldDefaults.textFieldColors(
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent
                , cursorColor = Color.Green,
                unfocusedLeadingIconColor = Color.Red,
                containerColor = Color.Red.copy(alpha = 0.2f)
            ),
            )

        Image(painter = painterResource(id = R.drawable.tower_bridge), contentDescription = null,modifier=Modifier.size(250.dp).shadow(
            elevation = 10.dp,
            spotColor = Color.Red,
            shape = CircleShape).clip(
            CircleShape
        ), contentScale = ContentScale.Crop)

    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    ComposeTestTheme {
        Greeting3("Android")
    }
}