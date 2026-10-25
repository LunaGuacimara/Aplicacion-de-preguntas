package com.example.aplicacindepreguntas.ui.theme.componentes

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
fun QuestionImage(
    @DrawableRes imagenRes: Int,
    contentDescription: String?,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(imagenRes),
        contentDescription = contentDescription,
        contentScale = ContentScale.Fit,
        modifier = modifier.fillMaxWidth()
    )
}