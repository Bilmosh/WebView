package com.bill.cookbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        WebView web = (WebView) findViewById(R.id.webview4);
        web.loadUrl("file:///android_asset/about.html");
        Button next = (Button) findViewById(R.id.buttonid);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(x);
            }
        });
    }
}
