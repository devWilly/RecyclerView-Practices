package com.devwilly.recyclerviewkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by Willy on 15/01/2018.
 */
class DefaultRecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.default_recycler_view_activity)
    }
}