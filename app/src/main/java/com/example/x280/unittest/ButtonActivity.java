package com.example.x280.unittest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

//        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "xxxxx",Toast.LENGTH_SHORT);
//            }
//        });
    }

    public void btn_click(View view){
        EditText editText = (EditText)findViewById(R.id.editText);
        String msg = editText.getText().toString();
        Intent intent = new Intent(ButtonActivity.this, ResponseActivity.class);
        intent.putExtra("msg", msg);
        Log.d("Tag", "start"+ msg);

        Toast.makeText(getApplicationContext(), "starter:"+ msg, Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}
