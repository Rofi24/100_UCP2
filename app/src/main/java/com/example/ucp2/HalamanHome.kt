package com.example.ucp2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.ucp2.ui.theme.UCP2Theme

@Composable
fun HalamanHome(onNextButtonClicked: () -> Unit
){
    val image = painterResource(id = R.drawable.images)
    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Button(onClick = onNextButtonClicked
        ) {
            Text(stringResource(R.string.btn_next))
            
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHalamanHome() {
    UCP2Theme {
        HalamanHome(onNextButtonClicked = {})
    }
}