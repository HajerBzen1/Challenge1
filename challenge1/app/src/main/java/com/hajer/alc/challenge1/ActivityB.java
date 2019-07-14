package com.hajer.alc.challenge1;

import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        WebView webView =(WebView)findViewById(R.id.web_view);
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView v, String url)
            {
                v.loadUrl(url);
                return true;
            }

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDisplayZoomControls(true);
        webView.loadUrl("https://andela.com/alc");
    }
}
