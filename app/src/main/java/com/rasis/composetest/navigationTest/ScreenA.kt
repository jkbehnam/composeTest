package com.rasis.composetest.navigationTest

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
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
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.rasis.composetest.navigationTest.ui.theme.ComposeTestTheme

@Composable
fun ScreenA(navController: NavHostController) {
    var name by remember {
        mutableStateOf("")
    }
    var age by remember {
        mutableStateOf("15")
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "screenA", fontSize = 64.sp)
        Spacer(modifier = Modifier.height(45.dp))
        TextField(value = name, onValueChange = {name=it}, placeholder = {
            Text(text = "enter your name")
        })
        TextField(modifier=Modifier.padding(top=15.dp),value = age, onValueChange = {age=it}, label = {
            Text(text = "enter your age")
        })
        Button(onClick = { navController.navigate("B") }) {
            Text(text = "go to screen B", fontSize = 45.sp)
        }
    }

}
@Preview(showBackground = true)
@Composable
fun GreetingPreview10() {
    ComposeTestTheme {
        Greeting10("Android")
    }
}