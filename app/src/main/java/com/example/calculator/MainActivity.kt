package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    private lateinit var firstNumber:EditText;
    private lateinit var secondNumber: EditText;
    private lateinit var add:Button;
    private lateinit var minus:Button;
    private lateinit var div:Button;
    private lateinit var mult:Button;



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNumber = findViewById(R.id.first)
        secondNumber= findViewById(R.id.second)

        add = findViewById(R.id.add)
        minus = findViewById(R.id.min)
        div = findViewById(R.id.div)
        mult = findViewById(R.id.mult)




        add.setOnClickListener{

            if (firstNumber.text.toString().isNullOrEmpty() || secondNumber.text.toString().isNullOrEmpty()){

                Toast.makeText(this,"Please Enter Numbers ! ", Toast.LENGTH_SHORT).show()
                return@setOnClickListener


            }

            val result = firstNumber.text.toString().toFloat() + secondNumber.text.toString().toFloat()
            val intent = Intent(this,MainActivity2::class.java)
                .putExtra("result",result.toString())


            startActivity(intent)

        }
        minus.setOnClickListener{

            if (firstNumber.text.toString().isNullOrEmpty() || secondNumber.text.toString().isNullOrEmpty()){

                Toast.makeText(this,"Please Enter Numbers ! ", Toast.LENGTH_SHORT).show()
                return@setOnClickListener


            }
            val result = firstNumber.text.toString().toFloat() - secondNumber.text.toString().toFloat()
            val intent = Intent(this,MainActivity2::class.java)
                .putExtra("result",result.toString())


            startActivity(intent)

        }
        mult.setOnClickListener{

            if (firstNumber.text.toString().isNullOrEmpty() || secondNumber.text.toString().isNullOrEmpty()){

                Toast.makeText(this,"Please Enter Numbers ! ", Toast.LENGTH_SHORT).show()
                return@setOnClickListener


            }
            val result = firstNumber.text.toString().toFloat() * secondNumber.text.toString().toFloat()
            val intent = Intent(this,MainActivity2::class.java)
                .putExtra("result",result.toString())


            startActivity(intent)

        }
        div.setOnClickListener{

            if (firstNumber.text.toString().isNullOrEmpty() || secondNumber.text.toString().isNullOrEmpty()){

                Toast.makeText(this,"Please Enter Numbers ! ", Toast.LENGTH_SHORT).show()
                return@setOnClickListener


            }
            val result = firstNumber.text.toString().toFloat() / secondNumber.text.toString().toFloat()
            val intent = Intent(this,MainActivity2::class.java)
                .putExtra("result",result.toString())


            startActivity(intent)

        }







    }
}