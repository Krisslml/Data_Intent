package com.example.data_navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        tv1 = (TextView) findViewById(R.id.TW);
        String dato = getIntent().getStringExtra("dato");
        tv1.setText("hola "+dato);

    }
    public void back (View view){
        Intent j = new Intent(this,MainActivity.class);
        startActivity(j);
    }
}