package com.example.aplicacindepreguntas.ui.theme.componentes

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.example.aplicacindepreguntas.ui.theme.ColoresImportantes

@Composable
fun ColoresImportantes(
    mensaje: String,
    acierto: Boolean,
    modifier: Modifier = Modifier
) {
    Text(
        text = mensaje,
        color = if (acierto) ColoresImportantes.Acierto else ColoresImportantes.Error,
        style = MaterialTheme.typography.titleMedium,
        textAlign = TextAlign.Center,
        modifier = modifier.fillMaxWidth()
    )
}