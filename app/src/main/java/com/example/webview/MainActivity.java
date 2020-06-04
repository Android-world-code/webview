package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.SearchRecentSuggestions;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import java.io.File;
import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    private Button button,button2;
    public File dir;
    public Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button_clear);
        button2 = (Button)findViewById(R.id.button_youtube);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, Main2Activity.class));

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, Main3Activity.class));



            }
                ///////////////////////////
        });

        /*
        mywebView.clearCache(true);
        mywebView.clearHistory();
        android.webkit.CookieManager cookieManager = CookieManager.getInstance();

       */



    }



}
