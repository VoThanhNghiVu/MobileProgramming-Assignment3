package com.example.exercise5_loginform
import OutlineLoginform
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exercise5_loginform.ui.theme.Exercise5_LoginformTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Exercise5_LoginformTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Loginform(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Loginform(modifier: Modifier) {
    Column(
        modifier = modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top
    )
    {
        Text(
            text = "Login",
            fontSize = 32.sp,
            //fontWeight = FontWeight.Bold,
            color = Color.Blue,
            modifier = modifier.align(Alignment.CenterHorizontally)
        )
        OutlineLoginform(
            label = "User",
            icon = Icons.Filled.Person,
            contentDescription = "Person icon"
        )
        OutlineLoginform(
            label = "User Password",
            icon = Icons.Filled.Lock,
            contentDescription = "Lock icon",
        )
        Button(
            onClick = {},
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth()
        ) {
            Text(text = "Submit")
        }
    }
}

