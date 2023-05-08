package com.example.task2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.task2.ui.theme.Task2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Task2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PreviewItem()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewItem() {
    LazyColumn(content = {
        items(getFruitsList()){
                item->DisplayList(item)
        }
    })
}

@Composable
fun DisplayList(item: String) {

            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp))
            {
                ItemDescriptor(item)
            }

}

@Composable
fun ItemDescriptor(item: String)
{
    Column{
        Text(
            text = item
        )
    }
}

fun getFruitsList(): MutableList<String>
{
    val list = mutableListOf<String>()
    list.add("Name: Orange")
    list.add("Name: APPLE")
    list.add("Name: STRAWBERRY")
    list.add("Name: MANGO")
    list.add("Name: Orange1")
    list.add("Name: APPLE1")
    list.add("Name: STRAWBERRY1")
    list.add("Name: MANGO1")
    list.add("Name: Orange2")
    list.add("Name: APPLE2")
    list.add("Name: STRAWBERRY2")
    list.add("Name: MANGO2")
    list.add("Name: Orange3")
    list.add("Name: APPLE3")
    list.add("Name: STRAWBERRY3")
    list.add("Name: MANGO3")
    list.add("Name: Orange4")
    list.add("Name: APPLE4")
    list.add("Name: STRAWBERRY4")
    list.add("Name: MANGO4")
    list.add("Name: Orange5")
    list.add("Name: APPLE5")
    list.add("Name: STRAWBERRY5")
    list.add("Name: MANGO5")
    list.add("Name: Orange6")
    list.add("Name: APPLE6")
    list.add("Name: STRAWBERRY6")
    list.add("Name: MANGO6")
    list.add("Name: Orange7")
    list.add("Name: APPLE7")
    list.add("Name: STRAWBERRY7")
    list.add("Name: MANGO7")
    list.add("Name: Orange8")
    list.add("Name: APPLE8")
    list.add("Name: STRAWBERRY8")
    list.add("Name: MANGO8")
    list.add("Name: Orange9")
    list.add("Name: APPLE9")
    list.add("Name: STRAWBERRY9")
    list.add("Name: MANGO9")

    return list
}