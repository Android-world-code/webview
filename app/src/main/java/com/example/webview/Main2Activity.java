package com.example.webview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.io.File;

public class Main2Activity extends AppCompatActivity {
    public WebView mywebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mywebView=(WebView) findViewById(R.id.webView);
        WebSettings WebSettings=mywebView.getSettings();
        WebSettings.setJavaScriptEnabled(true);
        mywebView.loadUrl("https://www.messenger.com/login.php?next=https%3A%2F%2Fwww.messenger.com%2Ft%2F2251044834909821%2F%3Fmessaging_source%3Dsource%253Apages%253Amessage_shortlink");
        mywebView.setWebViewClient(new WebViewClient());


        // Back button on tool bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(mywebView.canGoBack()){
            mywebView.goBack();
        }else{
            super.onBackPressed();
        }

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home)

        {
           // Clear cash  ////////////////////////////////////////////////



            mywebView.reload();



            ///////////////////////////////////////////////////////////////


            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }


}
