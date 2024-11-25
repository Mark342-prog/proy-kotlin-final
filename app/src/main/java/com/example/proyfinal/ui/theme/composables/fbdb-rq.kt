package com.example.proyfinal.ui.theme.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.example.proyfinal.data.saveUserData
import com.google.firebase.firestore.FirebaseFirestore

@Composable
fun UserInputCard() {
    // Estados para almacenar los datos ingresados
    var name by remember { mutableStateOf(TextFieldValue("")) }
    var username by remember { mutableStateOf(TextFieldValue("")) }
    var statusMessage by remember { mutableStateOf("") }

    // Firebase Firestore instancia

    // Diseño de la Card
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(text = "Ingresa tus datos")

            Spacer(modifier = Modifier.height(8.dp))

            // Campo de texto para el nombre
            TextField(
                value = name,
                onValueChange = { name = it },
                label = { Text("Nombre") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Campo de texto para el nombre de usuario
            TextField(
                value = username,
                onValueChange = { username = it },
                label = { Text("Nombre de Usuario") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Botón para guardar los datos
            Button(
                onClick = {
                    if (name.text.isNotEmpty() && username.text.isNotEmpty()) {
                        saveUserData(name.text, username.text)
                    } else {
                        statusMessage = "Por favor llena todos los campos"
                    }
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Guardar")
            }

            Spacer(modifier = Modifier.height(8.dp))
            // Mensaje de estado
            if (statusMessage.isNotEmpty()) {
                Text(
                    text = statusMessage,

                )
            }
        }
    }
}
