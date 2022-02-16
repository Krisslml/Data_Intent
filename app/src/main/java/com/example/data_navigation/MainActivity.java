package com.example.data_navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText Et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Et = (EditText) findViewById(R.id.edte);
    }
    public void Send(View view){
        Intent i = new Intent(this, ActivityTwo.class);
        i.putExtra("dato",Et.getText().toString());
        startActivity(i);
    }

}