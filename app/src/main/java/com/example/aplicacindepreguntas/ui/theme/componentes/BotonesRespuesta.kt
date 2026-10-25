package com.example.aplicacindepreguntas.ui.theme.componentes

import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Arrangement
import com.example.aplicacindepreguntas.R
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.aplicacindepreguntas.ui.theme.ColoresImportantes
import com.example.aplicacindepreguntas.ui.theme.Pantalla

@Composable
fun AnswerButton(
    texto: String,
    color: Color?,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        colors = if (color != null) {
            ButtonDefaults.buttonColors(
                containerColor = color,
                contentColor = ColoresImportantes.TextoBoton
            )
        } else {
            ButtonDefaults.buttonColors()
        },
        modifier = modifier
            .width(Pantalla.AnchoBotonRespuesta)
            .height(Pantalla.AlturaBoton)
    ) {
        Text(texto, style = MaterialTheme.typography.titleMedium)
    }
}

@Composable
fun AnswerButtons(
    respuestaCorrecta: Boolean,
    respuestaUsuario: Boolean?,
    onAnswer: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    fun color(valor: Boolean): Color? = when {
        respuestaUsuario == null -> null
        valor == respuestaCorrecta -> ColoresImportantes.Acierto
        else -> ColoresImportantes.Error
    }

    Row(
        horizontalArrangement = Arrangement.spacedBy(
            Pantalla.EspacioPequeno, Alignment.CenterHorizontally
        ),
        modifier = modifier.fillMaxWidth()
    ) {
        AnswerButton(
            texto = stringResource(R.string.btn_true),
            color = color(true),
            onClick = { onAnswer(true) }
        )
        AnswerButton(
            texto = stringResource(R.string.btn_false),
            color = color(false),
            onClick = { onAnswer(false) }
        )
    }
}