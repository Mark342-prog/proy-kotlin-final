package com.example.proyfinal.ui.theme.composables

import android.content.Context
import android.graphics.ImageDecoder
import android.graphics.drawable.AnimatedImageDrawable
import android.net.Uri
import android.os.Build
import android.os.Build.VERSION.SDK_INT
import androidx.annotation.DrawableRes
import androidx.annotation.RequiresApi
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.ImageLoader
import coil.compose.AsyncImage
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import coil.request.ImageRequest
import coil.size.Size
import com.example.proyfinal.R
import com.example.proyfinal.data.archivements
import com.example.proyfinal.data.trophy



@Composable
fun trophy_Screen(navController: NavHostController){
    Box(modifier = Modifier.fillMaxSize()) {
        Card(Modifier.align(Alignment.TopStart)
            .padding(top = 30.dp)
            .padding(30.dp)
            .fillMaxWidth(fraction = 0.7f)
            .fillMaxHeight()) {
            Text(text = "Name", style = MaterialTheme.typography.displayMedium, textAlign = TextAlign.Center)
        }
        Box(modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(fraction = 0.3f)
            .padding(10.dp)
            .align(Alignment.TopEnd)
            .padding(top = 50.dp)){
            Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "foto del jugador" )
        }

        Box(modifier = Modifier.fillMaxWidth(fraction = 0.7f)){
            Image(painter = painterResource(id = R.drawable.background),
                contentDescription = "Demono brackground",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.matchParentSize())
        }
        Scaffold(modifier = Modifier
            .fillMaxHeight(fraction = 0.8f)
            .padding(20.dp)
            .align(Alignment.BottomCenter)) {
                it ->
            LazyColumn(contentPadding = it) {
                items(archivements){
                    trophyes(tr = it,
                        modifier = Modifier.padding(dimensionResource(R.dimen.padding_small)))

                }
            }
        }
    }

}
@Composable
fun game_screen3(navController: NavHostController){
    val list = listOf(R.drawable.gif_gacha)
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "Demono background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )

        FilledIconButton(
            onClick = { navController.navigate(Screen.First.route) },
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 50.dp),
        ) {
            Icon(Icons.Outlined.ArrowBack, contentDescription = "Localized description")
        }

        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            verticalArrangement = Arrangement.Center,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.align(alignment = Alignment.Center),
            content = {
                items(list.size) { index ->
                    Card(
                        modifier = Modifier
                            .padding(4.dp)
                            .fillMaxWidth()
                            .height(200.dp),
                    ) {
                        // Aquí se carga el GIF utilizando Coil
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data(list[index])
                                .size(Size.ORIGINAL) // Asegúrate de usar el tamaño original para mantener la animación
                                .build(),
                            contentDescription = "GIF Image $index",
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                }
            }
        )
    }
}
@Composable
fun game_screen2(navController: NavHostController){
    val list = (1..4).map { it.toString() }
    Box(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.background),
            contentDescription = "Demono brackground",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize())
        FilledIconButton(onClick = { navController.navigate(Screen.First.route) },
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 50.dp),
        ){ Icon(Icons.Outlined.ArrowBack, contentDescription = "Localized description") }
        LazyVerticalGrid(
            columns = GridCells.Fixed(4),
            verticalArrangement = Arrangement.Center,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .align(alignment = Alignment.Center),

            content = {
                items(list.size) { index ->
                    Card(
                        modifier = Modifier
                            .padding(4.dp)
                            .fillMaxWidth()
                            .height(200.dp),

                        ) {
                        Text(
                            text = list[index],
                            fontWeight = FontWeight.Bold,
                            fontSize = 30.sp,
                            color = Color(0xFFFFFFFF),
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(16.dp)

                        )
                    }
                }
            }
        )
    }
}
@Composable
fun game_screen(navController: NavHostController){
    val list = (1..3).map { it.toString() }
    Box(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.background),
            contentDescription = "Demono brackground",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize())
        FilledIconButton(onClick = { navController.navigate(Screen.First.route)},
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 50.dp),
        ){ Icon(Icons.Outlined.ArrowBack, contentDescription = "Localized description") }
        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            verticalArrangement = Arrangement.Center,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .align(alignment = Alignment.Center),

            content = {
                items(list.size) { index ->
                    Card(
                        modifier = Modifier
                            .padding(4.dp)
                            .fillMaxWidth()
                            .height(200.dp),

                        ) {
                        Text(
                            text = list[index],
                            fontWeight = FontWeight.Bold,
                            fontSize = 30.sp,
                            color = Color(0xFFFFFFFF),
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(16.dp)

                        )
                    }
                }
            }
        )
    }
}
@Composable
fun menu_screen(navController: NavHostController){
    Box(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.background),
            contentDescription = "Demono brackground",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize())
        FilledIconButton(onClick = { navController.navigate(Screen.Fifth.route) },
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 50.dp),
        ) {
            Icon(Icons.Outlined.Menu, contentDescription = "Localized description")
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "EL JUEGO",
                style = MaterialTheme.typography.displayLarge,
                modifier = Modifier.padding(16.dp))
            OutlinedButton(onClick = { navController.navigate(Screen.Second.route) }) {
                Text(text = "J u e g o  1",
                    style = MaterialTheme.typography.displayMedium,
                )
            }
            OutlinedButton(onClick = { navController.navigate(Screen.Third.route) }) {
                Text(text = "J u e g o  2",
                    style = MaterialTheme.typography.displayMedium,
                )
            }
            OutlinedButton(onClick = {navController.navigate(Screen.Fourth.route)}) {
                Text(text = "J u e g o  3",
                    style = MaterialTheme.typography.displayMedium,
                )
            }
        }
    }
}
@Composable
fun Info(
    @StringRes archname: Int,
    dogAge: Int,
    modifier: Modifier = Modifier
) {

    Column(modifier = modifier) {
        Text(
            text = stringResource(archname),
            style = MaterialTheme.typography.displayMedium,
            modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_small))
        )
        Text(
            text = stringResource(R.string.NumOfArch, dogAge),
        )
    }
}
@Composable
fun IconArch(
    @DrawableRes IconArch: Int,
    modifier: Modifier = Modifier
) {
    Image(
        modifier = modifier
            .size(dimensionResource(R.dimen.image_size))
            .padding(dimensionResource(R.dimen.padding_small))
            .clip(MaterialTheme.shapes.small),
        contentScale = ContentScale.Crop,
        painter = painterResource(IconArch),

        // Content Description is not needed here - image is decorative, and setting a null content
        // description allows accessibility services to skip this element during navigation.

        contentDescription = null
    )
}

@Composable
fun trophyes(
    tr: trophy,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(dimensionResource(id = R.dimen.padding_small))

        ) {
            IconArch(tr.imageResourceId)
            Info(tr.name, tr.num)
        }
    }
}

