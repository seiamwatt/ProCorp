package com.example.procorpv1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.procorpv1.ui.theme.ProCorpV1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProCorpV1Theme {
                Surface( modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    ProCorpV1App()

                }

                }
            }
        }
    }

