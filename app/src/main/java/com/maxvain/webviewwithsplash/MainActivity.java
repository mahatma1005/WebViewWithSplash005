package com.maxvain.webviewwithsplash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.MyWebView01);

        webView.setWebChromeClient(new MyChromeClient());
        webView.setWebViewClient(new BrowserClient());

        WebSettings settings = webView.getSettings();

        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setAppCacheEnabled(true);
        
        loadWebPage();
        
    }

    private void loadWebPage() {

        webView.loadUrl("https://facebook.com");


    }
}