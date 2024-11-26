package com.example.proyfinal.ui.theme.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.example.proyfinal.R
import com.example.proyfinal.data.saveUserData
import com.google.firebase.firestore.FirebaseFirestore

@Composable
fun UserInputCard() {

    var name by remember { mutableStateOf(TextFieldValue("")) }
    var username by remember { mutableStateOf(TextFieldValue("")) }
    var statusMessage by remember { mutableStateOf("") }


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
            Text(text = stringResource(R.string.ask_data))

            Spacer(modifier = Modifier.height(8.dp))


            TextField(
                value = name,
                onValueChange = { name = it },
                label = { Text(stringResource(R.string.nombre)) },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))


            TextField(
                value = username,
                onValueChange = { username = it },
                label = { Text(stringResource(R.string.userName)) },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))


            Button(
                onClick = {
                    if (name.text.isNotEmpty() && username.text.isNotEmpty()) {
                        saveUserData(name.text, username.text)
                    } else {
                        statusMessage = "Error"
                    }
                },
                modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Black,)
            ) {
                Text(text = stringResource(R.string.save))
            }

            Spacer(modifier = Modifier.height(8.dp))

            if (statusMessage.isNotEmpty()) {
                Text(
                    text = statusMessage,

                )
            }
        }
    }
}
