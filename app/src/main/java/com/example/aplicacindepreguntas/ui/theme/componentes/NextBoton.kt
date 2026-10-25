package com.example.aplicacindepreguntas.ui.theme.componentes

import com.example.aplicacindepreguntas.R
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.aplicacindepreguntas.ui.theme.Pantalla
import androidx.compose.material3.Icon
import androidx.compose.ui.res.painterResource

@Composable
fun NextButton(onClick: () -> Unit, modifier: Modifier = Modifier) {
    Button(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .height(Pantalla.AlturaBoton)
    ) {
        Icon(
            painter = painterResource(R.drawable.flecha),
            contentDescription = null,
            modifier = Modifier.size(Pantalla.TamanoIcono)
        )
        Spacer(Modifier.width(Pantalla.EspacioPequeno))
        Text(stringResource(R.string.btn_next))
    }
}