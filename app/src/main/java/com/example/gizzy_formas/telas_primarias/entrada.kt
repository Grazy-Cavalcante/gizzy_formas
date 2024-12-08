package com.example.gizzy_formas.telas_primarias

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gizzy_formas.R
import com.example.gizzy_formas.ui.theme.Gizzy_formasTheme
import com.example.gizzy_formas.ui.theme.lilita

@Composable
fun entrada(name: String, modifier: Modifier = Modifier) {
    val imagem = painterResource(id = R.drawable.inicio)
    val retangulo = painterResource(id = R.drawable.retangulo)

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        // Imagem de fundo
        Image(
            painter = imagem,
            contentDescription = "Fundo da tela principal",
            modifier = Modifier.fillMaxSize(),
            contentScale = androidx.compose.ui.layout.ContentScale.Crop
        )

        // Imagem do retângulo ajustada
        Image(
            painter = retangulo,
            contentDescription = "Imagem sobreposta",
            modifier = Modifier
                .fillMaxWidth()
                .height(550.dp)  // Diminuindo a altura da imagem
                .align(Alignment.BottomCenter)
                .offset(y = 40.dp)  // Movendo um pouco para baixo
        )
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo formas",
            modifier = Modifier
                .size(250.dp)
                .align(Alignment.Center)
            .offset(y = -250.dp)
        )


        Text(
            text = "Gizzy.",
            style = TextStyle(
                color = Color(0xFF123145),
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = lilita,
                textAlign = TextAlign.Center
            ),
            modifier = Modifier
                .align(Alignment.Center)
                .offset(y = (-145).dp)
        )
        Text(
            text = "Seja bem vindo\n ao Gizzy!",
            style = TextStyle(
                color = Color(0xFF123145),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = lilita,
                textAlign = TextAlign.Center
            ),
            modifier = Modifier
                .align(Alignment.Center)
                .offset(y = (-10).dp)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun entradaPreview() {
    Gizzy_formasTheme {
        entrada("Android")
    }
}
