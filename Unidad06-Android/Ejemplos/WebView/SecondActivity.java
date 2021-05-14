package com.example.webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String url = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);


       WebView wv1 = findViewById(R.id.webv2);

       WebSettings webSettings = wv1.getSettings();
       webSettings.setJavaScriptEnabled(true);

        wv1.setWebViewClient(new WebViewClient());

        wv1.loadUrl(url);

    }
}