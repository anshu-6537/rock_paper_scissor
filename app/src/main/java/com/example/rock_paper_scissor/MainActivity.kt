package com.example.rock_paper_scissor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rock.setOnClickListener()
        {
            check("Rock")

            you_chosed.setText("Rock")
        }
        paper.setOnClickListener() {
            check("Paper")
            you_chosed.setText("Paper")
        }
        scissor.setOnClickListener() {
            check("Scissor")
            you_chosed.setText("Scissor")
        }
    }
    fun check(a:String)
    {
        var cpu_choice=""
        var random :Int = Random.nextInt(3)
        if(random==0)
        {
            cpu_choice="Rock"
            ai_chosed.setText("Rock")
        }
        if( random ==1)
        {
            cpu_choice="Paper"
            ai_chosed.setText("Paper")
        }
        if(random==2) {
            cpu_choice = "Scissor"
            ai_chosed.setText("Scissor")
        }

        if (cpu_choice==a)
        {
            result.setText("TIE !!!")
        }
        if (cpu_choice=="Rock" && a=="Scissor")
        {
            result.setText("You Lose !!!")
        }
        if (cpu_choice=="Rock" && a=="paper")
        {
            result.setText("You Won !!!")
        }
        if (cpu_choice=="Paper" && a=="Rock")
        {
            result.setText("You Lose !!!")
        }
        if (cpu_choice=="Paper" && a=="Scissor")
        {
            result.setText("You Won !!!")
        }
        if (cpu_choice=="Scissor" && a=="Rock")
        {
            result.setText("You Won !!!")
        }
        if (cpu_choice=="Scissor" && a=="Paper")
        {
            result.setText("You Lose !!!")
        }

    }
}