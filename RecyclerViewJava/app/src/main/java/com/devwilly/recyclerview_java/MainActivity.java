package com.devwilly.recyclerview_java;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.default_recycler_view_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity(DefaultRecyclerViewActivity.class);
            }
        });
    }

    private void openActivity(Class<? extends AppCompatActivity> cls) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, cls);
        startActivity(intent);
    }
}
