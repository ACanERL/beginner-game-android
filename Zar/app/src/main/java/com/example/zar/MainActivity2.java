package com.example.zar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button cıkıs,tekrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        cıkıs=findViewById(R.id.cıkıs);
        tekrar=findViewById(R.id.tekrar);
        tekrar.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity2.this,MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}