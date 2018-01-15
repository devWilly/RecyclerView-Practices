package com.devwilly.recyclerview_java;

import com.devwilly.recyclerview_java.wrapper.IEatingWrapper;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


/**
 * Created by Willy on 15/01/2018.
 */

public class DefaultRecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.default_recycler_view_activity);

        EatingDataWrapper dataWrapper = new EatingDataWrapper(this);
        ArrayList<IEatingWrapper> list = new ArrayList<>();
        list.addAll(dataWrapper.getFoodItemList());
        list.addAll(dataWrapper.getFruitItemList());

        RecyclerView rv = findViewById(R.id.default_recycler_view);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.addItemDecoration(new LayoutItemDecoration(this));
        rv.setAdapter(new RecyclerViewAdapter(list));
    }
}
