package com.example.shoppinglist.ui.theme.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SettingScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Ini Halaman Pengaturan",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 24.dp)
        )
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = MaterialTheme.shapes.medium,
            elevation = CardDefaults.cardElevation(2.dp)
        ) {
            Column(modifier = Modifier.padding(vertical = 8.dp)) {
                var notificationsEnabled by remember { mutableStateOf(true) }
                ListItem(
                    headlineContent = { Text("Kelola Pemberitahuan") },
                    supportingContent = { Text("Aktifkan notifikasi untuk pengingat belanja.") },
                    leadingContent = {
                        Icon(Icons.Default.Settings, contentDescription = "Pemberitahuan")
                    },
                    trailingContent = {
                        Switch(
                            checked = notificationsEnabled,
                            onCheckedChange = { notificationsEnabled = it }
                        )
                    }
                )

                HorizontalDivider()
                ListItem(
                    headlineContent = { Text("Tentang Aplikasi") },
                    supportingContent = { Text("Versi 1.0. Dibuat untuk Tugas Praktikum PTB.") },
                    leadingContent = {
                        Icon(Icons.Default.Info, contentDescription = "Informasi")
                    },
                    trailingContent = {
                        Icon(Icons.AutoMirrored.Filled.KeyboardArrowRight, contentDescription = "Detail")
                    }
                )
            }
        }
    }
}