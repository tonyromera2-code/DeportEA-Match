package com.example.deporteamatchfrontend

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.deporteamatchfrontend.ui.theme.DeportEAMatchFrontendTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DeportEAMatchFrontendTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
Column(modifier.fillMaxSize() ,horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
    Text ("Bienvenidos a DeportEA")
    Text ("La Mejor Red Social para hacer deporte")
}
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DeportEAMatchFrontendTheme {
        Greeting()
    }
}