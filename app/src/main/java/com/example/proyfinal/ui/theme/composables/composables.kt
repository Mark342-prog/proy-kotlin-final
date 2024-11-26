package com.example.proyfinal.ui.theme.composables

import androidx.annotation.DrawableRes
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.size.Size
import com.example.proyfinal.R
import com.example.proyfinal.data.archivements
import com.example.proyfinal.data.trophy



@Composable
fun trophy_Screen(navController: NavHostController){
    Box(modifier = Modifier.fillMaxSize()) {
        UserInputCard()


        Box(modifier = Modifier.fillMaxWidth(fraction = 0.7f)){
            Image(painter = painterResource(id = R.drawable.background),
                contentDescription = "Demono brackground",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.matchParentSize())
        }

    }

}
@Composable
fun game_screen3(navController: NavHostController){
    val list = listOf(R.drawable.gif_gacha, R.drawable.gif_gacha, R.drawable.gif_gacha, R.drawable.gif_gacha,  R.drawable.gif_gacha,  R.drawable.gif_gacha )
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

        RandomImageGrid3()
    }
}
@Composable
fun game_screen2(navController: NavHostController){
    val list = listOf(R.drawable.gif_gacha, R.drawable.gif_gacha, R.drawable.gif_gacha, R.drawable.gif_gacha)
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

        RandomImageGrid2()
    }
}
@Composable
fun game_screen(navController: NavHostController){
    val list = listOf(R.drawable.gif_gacha, R.drawable.gif_gacha, R.drawable.gif_gacha)
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

        RandomImageGrid1()
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
                Text(text = stringResource(R.string.game1),
                    style = MaterialTheme.typography.displayMedium,
                )
            }
            OutlinedButton(onClick = { navController.navigate(Screen.Third.route) }) {
                Text(text = stringResource(R.string.game2),
                    style = MaterialTheme.typography.displayMedium,
                )
            }
            OutlinedButton(onClick = {navController.navigate(Screen.Fourth.route)}) {
                Text(text = stringResource(R.string.game3),
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
            text = stringResource(R.string.NumOfArch),
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

