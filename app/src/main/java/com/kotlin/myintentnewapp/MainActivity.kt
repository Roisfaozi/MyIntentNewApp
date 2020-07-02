package com.kotlin.myintentnewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity : Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveActivityWithData : Button = findViewById(R.id.btn_move_activity_data)
        btnMoveActivityWithData.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.btn_move_activity_data -> {
                val moveActivityWithData = Intent(this@MainActivity, MoveActivityWithData::class.java)
                moveActivityWithData.putExtra(MoveActivityWithData.EXTRA_NAME, "DicodingACADEMY Boy")
                moveActivityWithData.putExtra(MoveActivityWithData.EXTRA_AGE, 5)
                startActivity(moveActivityWithData)
            }
        }
    }
}