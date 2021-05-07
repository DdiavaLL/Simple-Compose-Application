package com.example.composetry.data

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun loadMemoryCard(memoryData: MemoryData) {
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .padding(all = 16.dp)
            .fillMaxWidth()
            .shadow(375.dp)
    ) {
        Column{
            Image(painter = painterResource(id = memoryData.aImageRes), contentDescription = null,
                contentScale = ContentScale.FillWidth)
            Row(
                modifier = Modifier.padding(all = 8.dp).fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = memoryData.aName,
                    style = MaterialTheme.typography.subtitle2
                )
                Text(
                    text = memoryData.aYear,
                    style = MaterialTheme.typography.subtitle2
                )
            }
            Text(
                text = memoryData.aData,
                modifier = Modifier.padding(5.dp),
                color = Color.Black,
                fontSize = 30.sp
            )
        }
    }
}