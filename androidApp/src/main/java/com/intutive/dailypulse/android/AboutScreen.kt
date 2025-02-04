package com.intutive.dailypulse.android

import android.widget.Toolbar
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.intutive.dailypulse.Platform

@Composable
fun AboutScreen() {
    Column {
        Toolbar()
        ContentView()
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun Toolbar() {
    TopAppBar(
        title = { Text("About") }
    )
}

@Composable
private fun ContentView() {
    val items = makeItems()
    LazyColumn (
        modifier = Modifier.fillMaxSize()
    ){
        items(items.size) {
            RowView(
                Text(items[it].first).toString(),
                Text(items[it].second).toString()
            )


        }

    }
}

@Composable
fun RowView(title:String,subtitle:String) {
    Column(modifier = Modifier.fillMaxSize()) {
        Column (Modifier.padding(8.dp)){
            Text(title)
            Text(subtitle)
        }

    }

}

private fun makeItems(): List<Pair<String, String>> {
    val platform = Platform()
    platform.logSystemInfo()

    return listOf(
        Pair("Operating System", platform.osName),
        Pair("Device", platform.deviceName),
        Pair("Density", platform.density.toString())
    )
}
