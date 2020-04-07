package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent in = getIntent();
        String strMessage = in.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView tv = findViewById(R.id.textView2);
        tv.setText(strMessage);
    }
}
