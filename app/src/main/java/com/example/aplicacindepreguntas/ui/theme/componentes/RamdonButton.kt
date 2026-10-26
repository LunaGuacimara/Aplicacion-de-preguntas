package com.example.aplicacindepreguntas.ui.theme.componentes

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.aplicacindepreguntas.R
import androidx.compose.ui.res.stringResource
import com.example.aplicacindepreguntas.ui.theme.Pantalla

@Composable
fun RamdonButton(onClick: () -> Unit, modifier: Modifier = Modifier) {
    Button(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .height(Pantalla.AlturaBoton)
    ) {
        Spacer(Modifier.width(Pantalla.EspacioPequeno))
        Text(stringResource(R.string.btn_ramdon))
    }
}
