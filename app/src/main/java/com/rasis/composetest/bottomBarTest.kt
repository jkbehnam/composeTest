package com.rasis.composetest

import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.rasis.composetest.ui.theme.ComposeTestTheme

class bottomBarTest : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting8("Android")
                }
            }
        }
    }
}

data class NavItemState(

    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val hasBadge: Boolean,
    val badgeNumber: Int
)

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting8(name: String, modifier: Modifier = Modifier) {
    val items = listOf(
        NavItemState(
            title = "Home",
            selectedIcon = Icons.Filled.Home,
            unselectedIcon = Icons.Outlined.Home,
            hasBadge = true,
            badgeNumber = 0
        ),
        NavItemState(
            title = "Index",
            selectedIcon = Icons.Filled.Email,
            unselectedIcon = Icons.Outlined.Email,
            hasBadge = true,
            badgeNumber = 15
        ),
        NavItemState(
            title = "Account",
            selectedIcon = Icons.Filled.Face,
            unselectedIcon = Icons.Outlined.Face,
            hasBadge = true,
            badgeNumber = 20
        )

    )
    var bottomNavState by rememberSaveable {
        mutableIntStateOf(0)
    }
    Scaffold(
        bottomBar = {
            NavigationBar {
                items.forEachIndexed { index, item ->

                    NavigationBarItem(
                        selected = bottomNavState == index,
                        onClick = { bottomNavState = index },
                        icon = {
                            androidx.compose.material3.Icon(
                                imageVector = if (bottomNavState == index) item.selectedIcon else item.unselectedIcon,
                                contentDescription = item.title
                            )
                            BadgedBox(badge = { if (!item.hasBadge) null
                                if (item.badgeNumber!=0) Badge {
                                    Text(text = "hhjh")
                                }}) {

                            }

                        },
                        label = { Text(text = item.title)}

                    )
                }
            }

        }) {

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview8() {
    ComposeTestTheme {
        Greeting8("Android")
    }
}