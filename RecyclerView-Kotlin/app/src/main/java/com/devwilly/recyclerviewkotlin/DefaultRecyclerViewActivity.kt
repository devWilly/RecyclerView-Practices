package com.devwilly.recyclerviewkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.devwilly.recyclerviewkotlin.wrapper.IEatingWrapper

/**
 * Created by Willy on 15/01/2018.
 */
class DefaultRecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.default_recycler_view_activity)

        val dataWrapper = EatingDataWrapper(this)
        val dataList = ArrayList<IEatingWrapper>()
        dataList.addAll(dataWrapper.getFoodItemList())
        dataList.addAll(dataWrapper.getFruitItemList())


        val rv: RecyclerView = findViewById(R.id.default_recycler_view)
        rv.layoutManager = LinearLayoutManager(this)
        rv.addItemDecoration(LayoutItemDecoration(this))
        rv.adapter = RecyclerViewAdapter(dataList)
    }
}