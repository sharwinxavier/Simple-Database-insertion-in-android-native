package com.am.mydatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edname,edloc;
    String nme, loc;
    DbHplr dbHplr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edname=findViewById(R.id.editTextTextPersonName);
        edloc=findViewById(R.id.editTextTextPersonName2);
        dbHplr= new DbHplr(MainActivity.this);
    }

    public void sav(View view) {
        nme=edname.getText().toString();
        loc=edloc.getText().toString();
        dbHplr.savdetals(nme,loc);
        Toast.makeText(this, nme+"\n"+loc+"  saved successfully!", Toast.LENGTH_SHORT).show();

    }
}