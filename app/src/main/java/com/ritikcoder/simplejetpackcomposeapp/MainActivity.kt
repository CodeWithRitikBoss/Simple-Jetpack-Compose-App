package com.ritikcoder.simplejetpackcomposeapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ritikcoder.simplejetpackcomposeapp.ui.theme.SimpleJetpackComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column (modifier = Modifier.fillMaxSize().padding(0.dp, 50.dp, 0.dp, 0.dp),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Hello World.")
                Text(text = "Hello Android.")
                Button(onClick = {
                    //onClick
                    Toast.makeText(applicationContext, "Button is working", Toast.LENGTH_SHORT).show()
                }) {
                    Text(text = "Click me")
                }
            }
        }
    }
}


// TextView, EditText, Button, ImageView.
// Text, TextField, Button, Image.