package com.example.questtugaslayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questtugaslayout.ui.theme.Mahasiswa
import com.example.questtugaslayout.ui.theme.UserCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    val mahasiswaList = listOf(
        // Card 1: Beda font antara Nama (Cursive) dan Alamat (SansSerif)
        Mahasiswa(
            nameRes = R.string.name_ridho,
            phoneRes = null,
            addressRes = R.string.address_ridho,
            cardBgColorRes = R.color.bg_card_blue_1,
            phoneColorRes = R.color.text_phone_blue_1,
            addressColorRes = R.color.text_address_blue_1,
            nameFontFamily = FontFamily.Cursive,    // Font Nama di Box 1
            addressFontFamily = FontFamily.SansSerif // Font Alamat di Box 1
        ),
        // Card 2
        Mahasiswa(
            nameRes = R.string.name_john,
            phoneRes = R.string.phone_default,
            addressRes = R.string.address_john,
            cardBgColorRes = R.color.bg_card_blue_2,
            phoneColorRes = R.color.text_phone_blue_2,
            addressColorRes = R.color.text_address_blue_2,
            nameFontFamily = FontFamily.SansSerif,
            addressFontFamily = FontFamily.SansSerif
        ),
        // Card 3
        Mahasiswa(
            nameRes = R.string.name_thomas,
            phoneRes = R.string.phone_default,
            addressRes = R.string.address_thomas,
            cardBgColorRes = R.color.bg_card_blue_3,
            phoneColorRes = R.color.text_phone_blue_3,
            addressColorRes = R.color.text_address_blue_3,
            nameFontFamily = FontFamily.Serif,
            addressFontFamily = FontFamily.Serif
        ),
        // Card 4
        Mahasiswa(
            nameRes = R.string.name_paul,
            phoneRes = R.string.phone_default,
            addressRes = R.string.address_paul,
            cardBgColorRes = R.color.bg_card_blue_4,
            phoneColorRes = R.color.text_phone_blue_4,
            addressColorRes = R.color.text_address_blue_4,
            nameFontFamily = FontFamily.Monospace,
            addressFontFamily = FontFamily.Monospace
        )
    )

    // Tampilan UI Utama
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = colorResource(id = R.color.bg_screen)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Header Title
            Text(
                text = stringResource(id = R.string.header_title),
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.text_header_title),
                modifier = Modifier.padding(top = 16.dp)
            )

            // Header Subtitle
            Text(
                text = stringResource(id = R.string.header_subtitle),
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = colorResource(id = R.color.text_header_subtitle),
                modifier = Modifier.padding(bottom = 24.dp)
            )
            // List Card (LazyColumn)
            LazyColumn(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(mahasiswaList) { item ->
                    UserCard(mahasiswa = item)
                }
            }

            // Footer
            Text(
                text = stringResource(id = R.string.footer_copyright),
                fontSize = 12.sp,
                color = colorResource(id = R.color.text_header_subtitle),
                modifier = Modifier.padding(vertical = 8.dp)
            )
        }
    }
}