package com.example.questtugaslayout.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questtugaslayout.R

@Composable
fun UserCard(mahasiswa: Mahasiswa) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(110.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = mahasiswa.cardBgColorRes)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier.size(60.dp)
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 12.dp),
                verticalArrangement = Arrangement.Center
            ) {
                // Nama menggunakan nameFontFamily
                Text(
                    text = stringResource(id = mahasiswa.nameRes),
                    color = colorResource(id = R.color.white),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = mahasiswa.nameFontFamily
                )

                if (mahasiswa.phoneRes != null) {
                    Text(
                        text = stringResource(id = mahasiswa.phoneRes),
                        color = colorResource(id = mahasiswa.phoneColorRes),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = mahasiswa.addressFontFamily,
                        modifier = Modifier.padding(vertical = 2.dp)
                    )
                }

                // Alamat menggunakan addressFontFamily
                Text(
                    text = stringResource(id = mahasiswa.addressRes),
                    color = colorResource(id = mahasiswa.addressColorRes),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = mahasiswa.addressFontFamily
                )
            }

            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier.size(60.dp)
            )
        }
    }
}