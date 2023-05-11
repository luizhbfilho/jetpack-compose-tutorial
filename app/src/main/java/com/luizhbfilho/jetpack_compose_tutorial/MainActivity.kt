package com.luizhbfilho.jetpack_compose_tutorial


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.luizhbfilho.jetpack_compose_tutorial.data.Message
import com.luizhbfilho.jetpack_compose_tutorial.ui.theme.JetpackcomposetutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackcomposetutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MessageCard(Message("Android", "Hello World"))
                }
            }
        }
    }
}

@Composable
fun MessageCard(message: Message) {
    Column {
        Text(text = message.author)
        Text(text = message.body)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackcomposetutorialTheme {
        MessageCard(Message("Android", "Hello World"))
    }
}