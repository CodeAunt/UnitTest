package com.example.x280.unittest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class ResponseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_response);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");

        Log.d("Tag", msg);

        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }

}
