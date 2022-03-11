package com.example.taskagtmakas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView img1,img2;
    Button btn;
    int oyun,oyun2;
    TextView p1,p2;
    int puan1=0,puan2=0;
    int temp=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1=findViewById(R.id.imageView);
        img2=findViewById(R.id.imageView2);
        btn=findViewById(R.id.oyna);

        p1=findViewById(R.id.p1);
        p2=findViewById(R.id.p2);

        Random r=new Random();
        Random r1=new Random();

        btn.setOnClickListener(view -> {
            oyun=r.nextInt(3)+1;
            temp=oyun;
            System.out.println("Oyun="+oyun);
            if(oyun==1){
                img1.setImageDrawable(getDrawable(R.drawable.tas));
            }
            if(oyun==2){
                img1.setImageDrawable(getDrawable(R.drawable.kagit));
            }
            if(oyun==3){
                img1.setImageDrawable(getDrawable(R.drawable.makas));
            }
            //******Oyuncu  2 *****//
            oyun2=r1.nextInt(3)+1;
            if(oyun2==1){
                img2.setImageDrawable(getDrawable(R.drawable.tas));
                if(oyun==oyun2){
                    Toast.makeText(this,"Oyun Berabere",Toast.LENGTH_SHORT).show();
                }
                if(oyun2==1 & temp==2){
                    puan1++;
                    p1.setText(String.valueOf(puan1));
                }
                if( oyun2==1 & temp==3){
                    puan2++;
                    p2.setText(String.valueOf(puan2));
                }
            }
            if(oyun2==2){
                img2.setImageDrawable(getDrawable(R.drawable.kagit));
                if(oyun==oyun2){
                    Toast.makeText(this,"Oyun Berabere",Toast.LENGTH_SHORT).show();
                }
                if(oyun2==2 & temp==1){
                    puan2++;
                    p2.setText(String.valueOf(puan2));
                }
                if(oyun2==2 & temp==3){
                    puan1++;
                    p1.setText(String.valueOf(puan1));
                }
            }
            if(oyun2==3){
                img2.setImageDrawable(getDrawable(R.drawable.makas));
                if(oyun==oyun2){
                    Toast.makeText(this,"Oyun Berabere",Toast.LENGTH_SHORT).show();
                }
                if(oyun2==3 & temp==1){
                    puan1++;
                    p1.setText(String.valueOf(puan1));
                }
                if(oyun2==3 & temp==2){
                    puan2++;
                    p2.setText(String.valueOf(puan2));
                }
            }
        });
    }
}