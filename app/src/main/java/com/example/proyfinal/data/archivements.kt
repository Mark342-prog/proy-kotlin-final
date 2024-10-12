
package com.example.proyfinal.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.proyfinal.R


data class trophy(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val num: Int,
    @StringRes val Descript: Int
)
val archivements = listOf(
    trophy(R.drawable.goldmedal, R.string.Fist_Archive, 1,R.string.FirstDes ),
    trophy(R.drawable.goldmedal, R.string.Second_Archive, 2,R.string.SecondDes )
)

