package com.devwilly.recyclerviewkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.default_recycler_view_btn).setOnClickListener { openActivity(DefaultRecyclerViewActivity::class.java) }
    }

    private fun openActivity(cls: Class<*>) {
        val intent = Intent()
        intent.setClass(this@MainActivity, cls)
        startActivity(intent)
    }
}
