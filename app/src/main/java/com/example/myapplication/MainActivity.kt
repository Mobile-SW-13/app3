package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.support.v4.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_quiz.setOnClickListener{
            val intent=Intent(this,QuizActivity::class.java)
            startActivity(intent)
        }

        button_find.setOnClickListener{
            val intent=Intent(this,FindActivity::class.java)
            startActivity(intent)
        }

        button_word.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment, Fragment_word())
                .commit()
        }

        button_both.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment, Fragment_both())
                .commit()
        }

        button_mean.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment, Fragment_mean())
                .commit()
        }
    }

}
