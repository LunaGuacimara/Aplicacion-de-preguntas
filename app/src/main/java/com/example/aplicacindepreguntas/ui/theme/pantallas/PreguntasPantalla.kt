package com.example.aplicacindepreguntas.ui.theme.pantallas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import com.example.aplicacindepreguntas.R
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.aplicacindepreguntas.data.ListaPreguntas
import com.example.aplicacindepreguntas.model.Pregunta
import com.example.aplicacindepreguntas.ui.theme.Pantalla
import com.example.aplicacindepreguntas.ui.theme.componentes.QuestionImage
import com.example.aplicacindepreguntas.ui.theme.componentes.QuestionText
import com.example.aplicacindepreguntas.ui.theme.ColoresImportantes
import com.example.aplicacindepreguntas.ui.theme.componentes.AnswerButtons
import com.example.aplicacindepreguntas.ui.theme.componentes.ColoresImportantes
import com.example.aplicacindepreguntas.ui.theme.componentes.NextButton

@Composable
fun QuizScreen(preguntas: List<Pregunta> = ListaPreguntas.preguntas) {
    var indice by rememberSaveable { mutableStateOf(0) }
    var respuestaUsuario by rememberSaveable { mutableStateOf<Boolean?>(null) }

    QuizContent(
        pregunta = preguntas[indice],
        respuestaUsuario = respuestaUsuario,
        onAnswer = { respuestaUsuario = it },
        onNext = {
            indice = (indice + 1) % preguntas.size
            respuestaUsuario = null
        }
    )
}

@Composable
fun QuizContent(
    pregunta: Pregunta,
    respuestaUsuario: Boolean?,
    onAnswer: (Boolean) -> Unit,
    onNext: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(modifier = modifier.fillMaxSize()) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(Pantalla.EspacioMedio),
            modifier = Modifier
                .fillMaxSize()
                .safeDrawingPadding()
                .padding(Pantalla.PaddingPantalla)
        ) {
            QuestionText(texto = stringResource(pregunta.textoRes))

            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.weight(1f)
            ) {
                QuestionImage(
                    imagenRes = pregunta.imagenRes,
                    contentDescription = stringResource(pregunta.textoRes)
                )
            }

            if (respuestaUsuario != null) {
                val acierto = respuestaUsuario == pregunta.respuestaCorrecta
                ColoresImportantes(
                    acierto = acierto,
                    mensaje = if (acierto) {
                        stringResource(R.string.msg_acierto, pregunta.respuestaCorrecta.toString())
                    } else {
                        stringResource(
                            R.string.msg_fallo,
                            respuestaUsuario.toString(),
                            pregunta.respuestaCorrecta.toString()
                        )
                    }
                )
            }

            AnswerButtons(
                respuestaCorrecta = pregunta.respuestaCorrecta,
                respuestaUsuario = respuestaUsuario,
                onAnswer = onAnswer
            )

            NextButton(onClick = onNext)
        }
    }
}