package com.example.dialogtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var btnItem:Button
    lateinit var textResult:TextView
    lateinit var imgv:ImageView
    var verrionArray = arrayOf("악뮤","아이유","안예은")
    var singImg = arrayOf(R.drawable.akmu, R.drawable.iu, R.drawable.an)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnItem = findViewById(R.id.btn_item)
        textResult = findViewById(R.id.text_result)
        imgv = findViewById<ImageView>(R.id.imgv)
        
        btnItem.setOnClickListener { 
            var dlg = AlertDialog.Builder(this@MainActivity)
            dlg.setTitle("좋아하는 가수는?")
            dlg.setIcon(R.drawable.icon)
            dlg.setItems(verrionArray){dialog, index->
                textResult.text = verrionArray[index]
                imgv.setImageResource(singImg[index])
            }
            dlg.setNegativeButton("닫기",null)
            dlg.show()
        }
    }
}