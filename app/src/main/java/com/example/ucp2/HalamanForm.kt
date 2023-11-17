package com.example.ucp2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanForm(   onSubmitButtonClick: (MutableList<String>) -> Unit)
{
    var namaTxt by rememberSaveable { mutableStateOf("")
    }
    var nimTxt by rememberSaveable { mutableStateOf("")
    }
    var konsentrasiTxt by rememberSaveable { mutableStateOf("")
    }
    var listDataTxt : MutableList<String> = mutableListOf(namaTxt, nimTxt, konsentrasiTxt)
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ){
        Text(
            text = "Formulir Pendaftaran Skripsi",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        OutlinedTextField(value = namaTxt, onValueChange = {
            namaTxt = it
        }, label = {
            Text(text = "Nama Mahasiswa")
        },
            placeholder = { Text(text = "Masukkan Nama Mahasiswa") }
        )
        Spacer(modifier = Modifier.padding(16.dp))

        OutlinedTextField(value = nimTxt, onValueChange = {
            nimTxt = it
        }, label = {
            Text(text = "NIM Mahasiswa")
        },
            placeholder = { Text(text = "Masukkan NIM Mahasiswa") }
        )
        Spacer(modifier = Modifier.padding(16.dp))

        OutlinedTextField(value = konsentrasiTxt, onValueChange = {
            konsentrasiTxt = it
        }, label = {
            Text(text = "Konsentrasi")
        },
            placeholder = { Text(text = "Masukkan Konsentrasi ") }
        )
        Spacer(modifier = Modifier.padding(16.dp))

        Button(onClick =  { onSubmitButtonClick(listDataTxt) }) {
            Text(text = stringResource(R.string.btn_submit))
        }
    }
}