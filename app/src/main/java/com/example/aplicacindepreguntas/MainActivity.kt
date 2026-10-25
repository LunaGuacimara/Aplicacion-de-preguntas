package com.example.aplicacindepreguntas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.aplicacindepreguntas.ui.theme.AplicaciónDePreguntasTheme
import com.example.aplicacindepreguntas.ui.theme.pantallas.QuizScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AplicaciónDePreguntasTheme {
                QuizScreen()
                }
            }
        }
    }


