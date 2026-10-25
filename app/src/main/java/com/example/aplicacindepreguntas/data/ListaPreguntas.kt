package com.example.aplicacindepreguntas.data

import com.example.aplicacindepreguntas.R
import com.example.aplicacindepreguntas.model.Pregunta

object ListaPreguntas {

    val preguntas: List<Pregunta> = listOf(
        Pregunta(R.string.pregunta_1, R.drawable.delorean, respuestaCorrecta = true),
        Pregunta(R.string.pregunta_2, R.drawable.anillounico, respuestaCorrecta = false),
        Pregunta(R.string.pregunta_3, R.drawable.silenciodeloscorderos, respuestaCorrecta = false),
        Pregunta(R.string.pregunta_4, R.drawable.matrix, respuestaCorrecta = false),
        Pregunta(R.string.pregunta_5, R.drawable.proyecthailmary, respuestaCorrecta = true),
    )
}