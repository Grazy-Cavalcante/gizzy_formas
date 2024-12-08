package com.example.gizzy_formas.telas_primarias

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gizzy_formas.R
import com.example.gizzy_formas.ui.theme.Gizzy_formasTheme
import com.example.gizzy_formas.ui.theme.lilita

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Gizzy_formasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                  entrada(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun carregamento (name: String, modifier: Modifier = Modifier) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFD4A890))
                .then(modifier),
            contentAlignment = Alignment.Center
        ) {

            androidx.compose.foundation.layout.Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Logo formas",
                    modifier = Modifier
                        .size(300.dp)
                )


                Spacer(modifier = Modifier.height(16.dp))


                Text(
                    text = "Gizzy.",
                    style = TextStyle(
                        color = Color(0xFF123145),
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = lilita,
                        textAlign = TextAlign.Center
                    ),
                    modifier = Modifier.offset(y = (-60).dp)
                )
            }
        }
    }


    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        Gizzy_formasTheme {
            carregamento("Android")
        }
    }
