package com.example.modifiers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.modifiers.ui.theme.ModifiersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ModifiersTheme {
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    color = MaterialTheme.colorScheme.background
                ){
                    MyApp()
                }
            }
        }
    }
}

@Composable
fun MyApp(){
    val reusableModifier = Modifier
        .padding(8.dp)
        .fillMaxWidth()
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement =  Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
       Text(
           text = "My Title",
           style = MaterialTheme.typography.headlineSmall,
           modifier = reusableModifier
       )

        OutlinedTextField(
            value = "",
            onValueChange = { },
            modifier = reusableModifier
        )

        Button(
            onClick = {},
            modifier = reusableModifier
        ){
            Text(text = "Submit")
        }

    }
}

@Composable
fun MyText(content: String, modifier: Modifier = Modifier){
    Text(
        text = content,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ModifiersTheme {

    }
}