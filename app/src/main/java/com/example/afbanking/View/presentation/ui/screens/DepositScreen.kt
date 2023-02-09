package com.example.afbanking.View.presentation.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.afbanking.View.presentation.ui.theme.TealPurp

@Composable
fun DepositScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                //.border(1.dp, Color.Red, RectangleShape)
                .fillMaxSize()
                .padding(bottom = 100.dp),
            verticalArrangement = Arrangement.Center
        ){

            Spacer(modifier = Modifier.height(25.dp))

            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .align(Alignment.End)
                    .padding(
                        start = 8.dp,
                        end = 8.dp,
                        bottom = 63.dp
                    ),
                elevation = 20.dp, backgroundColor = TealPurp,
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Text(text = "Deposit Screen")
                }

            }
        }
    }
}