package com.example.proyfinal.data

import com.google.firebase.database.FirebaseDatabase

import com.google.firebase.firestore.FirebaseFirestore

fun saveUserData(name: String, username: String) {
    // Inicializa la base de datos
    val database = FirebaseDatabase.getInstance("https://proyecto-final-47e19-default-rtdb.firebaseio.com/")
    val ref = database.getReference("users")

    // Crear un nodo único para cada usuario
    val userId = ref.push().key ?: return

    // Datos a enviar
    val userData = mapOf(
        "name" to name,
        "username" to username
    )

    // Guardar en Realtime Database
    ref.child(userId).setValue(userData)
        .addOnSuccessListener {
            println("Datos guardados correctamente")
        }
        .addOnFailureListener { e ->
            println("Error al guardar los datos: ${e.message}")
        }
}


