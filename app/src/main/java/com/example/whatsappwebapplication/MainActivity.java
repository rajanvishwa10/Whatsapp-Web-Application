package com.example.whatsappwebapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Whatsapp Web");
    }

    public void whatsapp(View view) {
    }

    public void whatsappWeb(View view) {
        Intent intent = new Intent(this, WebViewActivity.class);
        startActivity(intent);
    }
}