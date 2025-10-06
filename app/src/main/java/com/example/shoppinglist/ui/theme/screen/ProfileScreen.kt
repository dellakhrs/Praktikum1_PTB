package com.example.shoppinglist.ui.theme.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.shoppinglist.R
import androidx.compose.ui.text.font.FontWeight

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.foto_diri),
            contentDescription = "Foto Diri",
            modifier = Modifier.size(150.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Card(
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                // Nama
                Row {
                    Text(
                        "Nama",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.width(120.dp) // lebar tetap agar titik dua sejajar
                    )
                    Text(": Della Khairunnisa")
                }

                // NIM
                Row {
                    Text(
                        "NIM",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.width(120.dp)
                    )
                    Text(": 2311523032")
                }

                // Hobi
                Row {
                    Text(
                        "Hobi",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.width(120.dp)
                    )
                    Text(": Desain dan Fotografi")
                }

                // TTL
                Row {
                    Text(
                        "TTL",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.width(120.dp)
                    )
                    Text(": Padang, 07 Desember 2004")
                }

                // Peminatan
                Row {
                    Text(
                        "Peminatan",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.width(120.dp)
                    )
                    Text(": System Development")
                }
            }}
    }
}