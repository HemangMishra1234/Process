package presentation.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import data.listOfOptions

@Composable
fun ListScreen() {
    LazyColumn(
        modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        items(listOfOptions.size) { index ->
            val lst = listOfOptions[index]
            var sum = 0
            lst.collection.forEach { sum += it.estimatedTimeInMin }
            SingleOption(
                lst.name,
                sum
            ) {

            }
            Spacer(Modifier.height(16.dp))
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SingleOption(name: String, estimatedTime: Int, onClick: () -> Unit) {
    Card(
        onClick = {

        }
    ) {
        Column {
            Text(
                text = name, style = MaterialTheme.typography.subtitle2
            )
            Text(text = "Estimated time: $estimatedTime min")
        }
    }
}