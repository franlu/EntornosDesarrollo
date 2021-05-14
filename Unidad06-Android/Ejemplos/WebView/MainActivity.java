package com.example.webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.webview.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtn(View view){
        EditText ed1 = (EditText) findViewById(R.id.et1);
        String url = ed1.getText().toString();
        Intent i = new Intent(this, SecondActivity.class);
        i.putExtra(EXTRA_MESSAGE, url);
        startActivity(i);
    }
}