package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.util.Log
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_quiz.*
import java.util.Random



class QuizActivity : AppCompatActivity() {

    val word_array=arrayOf("a","b","c","d","e")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        var i=0
        var correct=0
        val random = Random()
        var num = random.nextInt(5)
        var word_random=word_array.get(num)
        textView2.setText(word_random)
        while(i <5) {

            textView2.setText(word_random)
                num = random.nextInt(5)
                word_random = word_array.get(num)
                button4.setText(word_random)

                num = random.nextInt(5)
                word_random = word_array.get(num)
                button5.setText(word_random)

                num = random.nextInt(5)
                word_random = word_array.get(num)
                button6.setText(word_random)

                button4.setOnClickListener {
                    if (word_random == button4.text) {
                        //num = random.nextInt(5)
                        //word_random=word_array.get(num)
                        textView2.setText(word_random)
                        correct++
                        //val intent = Intent(this, QuizActivity::class.java)
                        //startActivity(intent)
                    } else {
                        button4.setBackgroundColor(Color.GRAY)
                    }
                    i++
                }

                button5.setOnClickListener {
                    if (word_random == button5.text) {
                        num = random.nextInt(5)
                        word_random = word_array.get(num)
                        textView2.setText(word_random)
                        correct++
                    } else {
                        button5.setBackgroundColor(Color.GRAY)
                    }
                    i++
                }

                button6.setOnClickListener {
                    if (word_random == button6.text) {
                        num = random.nextInt(5)
                        word_random = word_array.get(num)
                        textView2.setText(word_random)
                        correct++
                    } else {
                        button6.setBackgroundColor(Color.GRAY)
                    }
                    i++
                }

            if(i==5) {
                val intent = Intent(this, ResultActivity::class.java)
                startActivity(intent)
            }
        }

        button_home.setOnClickListener{
            val intent=Intent(this,MainActivity::class.java)
            intent.putExtra("correct",correct)
            startActivity(intent)
        }

    }
}
