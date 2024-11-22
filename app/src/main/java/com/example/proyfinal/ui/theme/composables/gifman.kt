package com.example.proyfinal.ui.theme.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter
import com.example.proyfinal.R

@Composable
fun GifImage(
    resourceId: Int,
    modifier: Modifier = Modifier
) {
    Image(
        painter = rememberAsyncImagePainter(model = resourceId),
        contentDescription = null,
        modifier = modifier
    )
}


@Preview
@Composable
fun PreviewGifImage() {
    GifImage(
        resourceId = R.drawable.gif_gacha, // El nombre del GIF en `res/drawable`
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
    )
}
