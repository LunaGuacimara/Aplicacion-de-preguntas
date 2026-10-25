package com.example.aplicacindepreguntas.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Pregunta(
    @StringRes val textoRes: Int,
    @DrawableRes val imagenRes: Int,
    val respuestaCorrecta: Boolean
)