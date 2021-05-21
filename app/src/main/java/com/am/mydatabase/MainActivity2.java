package com.am.mydatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    String nme, loc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.textView);

      nme=  getIntent().getStringExtra("nam");
      loc=  getIntent().getStringExtra("loc");

      textView.setText(nme+"\n"+loc);
    }
}