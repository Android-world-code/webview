package com.example.webview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.io.File;

public class Main3Activity extends AppCompatActivity {
    public WebView mywebView1;
    public File dir;
    public Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);




        mywebView1=(WebView) findViewById(R.id.webView1);
        WebSettings WebSettings=mywebView1.getSettings();
        WebSettings.setJavaScriptEnabled(true);
        mywebView1.loadUrl("https://m.youtube.com/");
        mywebView1.setWebViewClient(new WebViewClient());


        // Back button on tool bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }


    @Override
    public void onBackPressed() {
        if(mywebView1.canGoBack()){
            mywebView1.goBack();
        }else{
            super.onBackPressed();
        }

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home)

        {
            ////////////////////////////////////


            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }


}
