package edu.uic.cs478.gmasca2.project2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends Activity {

    public WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        webView = new WebView(this);

        webView.getSettings().setJavaScriptEnabled(true); //To play YouTube videos


        webView.setWebViewClient(new WebViewClient(){});

        Intent intent = getIntent();
        String sv = intent.getStringExtra("url");


        webView.loadUrl(sv);

        setContentView(webView);

    }
}

