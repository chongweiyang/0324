package com.example.a0317

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var ans = "1234"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.button)
        var editText = findViewById<EditText>(R.id.editText)
        var textView = findViewById<TextView>(R.id.textView)

        button.setOnClickListener {
            var guess=editText.text.toString()
            var nA =0;
            var nB =0;
            for( i in 0..3){
                for (j in 0..3){
                    if ( ans.get(i) == guess.get(j))
                    {
                        if (i==j )
                            nA++
                        else
                            nB++
                    }
                }
            }
            textView.text = nA.toString()+"A"+nB.toString()+"B"
        }
        var value = intent.extras?.getString("user")
        textView.setText("welcome " + value)
    }
}