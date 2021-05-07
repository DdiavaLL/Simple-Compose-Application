package com.example.composetry

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetry.data.listOfMemories
import com.example.composetry.data.loadMemoryCard
import com.example.composetry.ui.theme.ComposeTryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTryTheme {
                loadUI()
            }
        }
    }
}

@Preview
@Composable
fun loadUI() {
    Column(modifier = Modifier
        .padding(5.dp)
        .verticalScroll(rememberScrollState())) {
        listOfMemories().forEach { memoryData ->
            loadMemoryCard(memoryData = memoryData)
        }
    }
}

