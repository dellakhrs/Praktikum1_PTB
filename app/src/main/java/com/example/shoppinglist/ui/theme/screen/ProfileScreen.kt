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
fun ProfileDetailRow(
    label: String,
    value: String,
    modifier: Modifier = Modifier,
    labelWidth: Modifier = Modifier.width(120.dp)
) {
    Row(modifier = modifier.fillMaxWidth()) {
        Text(
            label,
            fontWeight = FontWeight.Bold,
            modifier = labelWidth
        )
        Text(": $value")
    }
}

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
                ProfileDetailRow(label = "Nama", value = "Della Khairunnisa")
                ProfileDetailRow(label = "NIM", value = "2311523032")
                ProfileDetailRow(label = "TTL", value = "Padang, 07 Desember 2004")
                ProfileDetailRow(label = "Hobi", value = "Desain dan Fotografi")
                ProfileDetailRow(label = "Peminatan", value = "UI/UX Designer")
            }
        }
    }
}