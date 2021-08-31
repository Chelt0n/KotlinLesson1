package com.example.kotlinlesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var dataClass: DataClass
    lateinit var button: Button
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)

        button = findViewById(R.id.button)
        button.setOnClickListener(this)

        dataClass = DataClass("JustName", 5)
        val objTest = dataClass.copy(name = "anotherName", number = 10)
        textView.setOnClickListener {
            textView.text = "$objTest"
        }


        /** Вывод значения из разных циклов в консоль */
        val list = listOf("One", "two", "three", "four", "five")
        for (number in list) {
            Log.d("myLogs", number.toString())
        }

        list.forEach { Log.d("myLogs", "$it") }

        for (i in 1..5) {
            Log.d("myLogs", i.toString())  //Почему при удалении даной строчки то "Hello Kotlin" выводится только 2 раза?
            Log.d("myLogs", "Hello Kotlin")
        }


    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button -> {
                textView.text = "$dataClass"
            }
        }
    }
}