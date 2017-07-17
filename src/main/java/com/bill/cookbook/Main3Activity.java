package com.bill.cookbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        WebView weeeb = (WebView) findViewById(R.id.webview8);
        weeeb.loadUrl("file:///android_asset/view.html");
       // Button next = (Button) findViewById(R.id.buttonid);


    }
}
