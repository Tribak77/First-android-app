package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.text.style.TextAlign

class BirthdayCard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            MyApplicationTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    BirthdayGreeting(
//                        name = "Ayoub tribak",
//                        form = "From Emma",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BirthdayGreeting(
                        name = "Happy Birthday Ayoub!",
                        from = "From Emma",
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun BirthdayGreeting(name: String, from: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Cyan, modifier = Modifier.fillMaxSize()) {
    }
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    )
    {
        Text(
            text = "happy birthday $name!",
            modifier = modifier.padding(20.dp),
            fontSize = 80.sp,
            lineHeight = 100.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 30.sp,
            modifier = modifier.padding(4.dp).align(Alignment.End)
        )
    }

}

@Preview(showBackground = true, name = "My preview", showSystemUi= true)
@Composable
fun BirthdayGreetingPreview() {
    MyApplicationTheme {
        BirthdayGreeting(name = "Ayoub", from = "From Emma")
    }
}