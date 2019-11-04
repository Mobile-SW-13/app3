package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_find.*
import kotlinx.android.synthetic.main.activity_quiz.button_home

class FindActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find)

        var edittext = findViewById(R.id.write) as EditText

        button_add.setOnClickListener {
            var text: String = edittext.text.toString()
            result.setText("버튼 클릭 후" + text + "로 변경!")
        }

        button_home.setOnClickListener{
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}
