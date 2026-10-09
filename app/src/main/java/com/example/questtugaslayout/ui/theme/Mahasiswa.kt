package com.example.questtugaslayout.ui.theme

import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import androidx.compose.ui.text.font.FontFamily
import com.example.questtugaslayout.R

data class Mahasiswa(
    @StringRes val nameRes: Int,
    @StringRes val phoneRes: Int?,
    @StringRes val addressRes: Int,
    @ColorRes val cardBgColorRes: Int,
    @ColorRes val phoneColorRes: Int = R.color.white,
    @ColorRes val addressColorRes: Int = R.color.white,
    val nameFontFamily: FontFamily = FontFamily.Default,    // Font khusus Nama
    val addressFontFamily: FontFamily = FontFamily.Default // Font khusus Alamat/HP
)