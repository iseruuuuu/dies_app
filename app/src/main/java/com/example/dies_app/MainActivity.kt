package com.example.dies_app

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dies_app.ui.theme.Dies_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Dies_appTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    //範囲を設定する(型としては IntRangeという型)
    val diceRange = 1..6;
    //ランダムで値を取得する。
    val randomNumber = diceRange.random();

    val myFirstDice = Dice(6)
    val diceRoll = myFirstDice.roll()

    Column {
        Text(text = "Hello $randomNumber!")
        Button(onClick = {

        }) {
            Text("Roll")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Dies_appTheme {
        Greeting("Android")
    }
}

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}