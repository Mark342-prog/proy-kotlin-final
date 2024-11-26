package com.example.proyfinal.ui.theme.composables

import androidx.compose.runtime.Composable
import com.example.proyfinal.R
import kotlin.random.Random
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp




@Composable
fun RandomImageGrid3() {

    var selectedImages by remember { mutableStateOf(emptyList<Int>()) }


    val selective = listOf(
        R.drawable.cherry,
        R.drawable.bar,
        R.drawable.club,
        R.drawable.crown,
        R.drawable.diamond,
        R.drawable.dice,
        R.drawable.hat,
        R.drawable.heart,
        R.drawable.luck,
        R.drawable.luck_2,
        R.drawable.luck_3,
        R.drawable.money,
        R.drawable.money_bag,
        R.drawable.seven,
        R.drawable.spade,
        R.drawable.token,
        R.drawable.wild
    )


    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Button(
                onClick = {

                    val randomValues = List(6) { Random.nextInt(0, selective.size) }
                    selectedImages = randomValues.map { index -> selective[index] }
                },
                modifier = Modifier
                    .padding(bottom = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black)
            ) {
                Text(text = stringResource(id = R.string.button_select), fontSize = 30.sp)
            }


            if (selectedImages.isNotEmpty()) {
                LazyVerticalGrid(
                    columns = GridCells.Fixed(3),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(300.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {

                    items(selectedImages) { imageResId ->
                        RandomImageCard(imageResId)
                    }
                }
            }
        }
    }
}

@Composable
fun RandomImageGrid2() {

    var selectedImages by remember { mutableStateOf(emptyList<Int>()) }


    val selective = listOf(
        R.drawable.cherry,
        R.drawable.bar,
        R.drawable.club,
        R.drawable.crown,
        R.drawable.diamond,
        R.drawable.dice,
        R.drawable.hat,
        R.drawable.heart,
        R.drawable.luck,
        R.drawable.luck_2,
        R.drawable.luck_3,
        R.drawable.money,
        R.drawable.money_bag,
        R.drawable.seven,
        R.drawable.spade,
        R.drawable.token,
        R.drawable.wild
    )


    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Button(
                onClick = {

                    val randomValues = List(4) { Random.nextInt(0, selective.size) }
                    selectedImages = randomValues.map { index -> selective[index] }
                },
                modifier = Modifier
                    .padding(bottom = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black)
            ) {
                Text(text = stringResource(id = R.string.button_select), fontSize = 30.sp)
            }


            if (selectedImages.isNotEmpty()) {
                LazyVerticalGrid(
                    columns = GridCells.Fixed(4),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(300.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {

                    items(selectedImages) { imageResId ->
                        RandomImageCard(imageResId)
                    }
                }
            }
        }
    }
}

@Composable
fun RandomImageGrid1() {
    // Estado para almacenar las imágenes seleccionadas
    var selectedImages by remember { mutableStateOf(emptyList<Int>()) }

    // Lista completa de imágenes
    val selective = listOf(
        R.drawable.cherry,
        R.drawable.bar,
        R.drawable.club,
        R.drawable.crown,
        R.drawable.diamond,
        R.drawable.dice,
        R.drawable.hat,
        R.drawable.heart,
        R.drawable.luck,
        R.drawable.luck_2,
        R.drawable.luck_3,
        R.drawable.money,
        R.drawable.money_bag,
        R.drawable.seven,
        R.drawable.spade,
        R.drawable.token,
        R.drawable.wild
    )


    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Button(
                onClick = {

                    val randomValues = List(3) { Random.nextInt(0, selective.size) }
                    selectedImages = randomValues.map { index -> selective[index] }
                },
                modifier = Modifier
                    .padding(bottom = 16.dp)
            ) {
                Text(text = stringResource(id = R.string.button_select), fontSize = 30.sp)
            }


            if (selectedImages.isNotEmpty()) {
                LazyVerticalGrid(
                    columns = GridCells.Fixed(3),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(300.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {

                    items(selectedImages) { imageResId ->
                        RandomImageCard(imageResId)
                    }
                }
            }
        }
    }
}
@Composable
fun RandomImageCard(imageResId: Int) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(1f)
            .clickable {  },

    ) {
        Image(
            painter = painterResource(id = imageResId),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
}