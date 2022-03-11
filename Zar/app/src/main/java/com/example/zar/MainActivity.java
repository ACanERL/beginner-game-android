package com.example.zar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity  {
    ImageView zarimage;
    Button btn,btn2;
    ConstraintLayout layout;
    TextView p1,p2;
    int temp;
    int puan1=0,puan2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zarimage=findViewById(R.id.imageView);
        btn=findViewById(R.id.zar);
        btn2=findViewById(R.id.zar2);
        layout=findViewById(R.id.bglayout);
        p1=findViewById(R.id.puan1);
        p2=findViewById(R.id.puan2);

        Random sayi=new Random();
        int[] rainbow = this.getResources().getIntArray(R.array.rainbow);
        btn2.setEnabled(false);

        btn.setOnClickListener(view -> {
            temp=0;
            int zar=sayi.nextInt(6)+1;
            temp=zar;
            System.out.println(zar);
            if(zar==1){
                zarimage.setImageDrawable(getDrawable(R.drawable.bir));
                animationZar();
                Toast.makeText(this,"Gelen Zar:"+zar,Toast.LENGTH_SHORT).show();
              //  layout.setBackgroundColor(rainbow[zar]);
                btn2.setEnabled(true);
                btn.setEnabled(false);
            }
            if(zar==2){
                zarimage.setImageDrawable(getDrawable(R.drawable.iki));
                animationZar();
                Toast.makeText(this,"Gelen Zar:"+zar,Toast.LENGTH_SHORT).show();
               // layout.setBackgroundColor(rainbow[zar]);
                btn2.setEnabled(true);
                btn.setEnabled(false);
            }
            if(zar==3){
                zarimage.setImageDrawable(getDrawable(R.drawable.uc));
                animationZar();
                Toast.makeText(this,"Gelen Zar:"+zar,Toast.LENGTH_SHORT).show();
              //  layout.setBackgroundColor(rainbow[zar]);
                btn2.setEnabled(true);
                btn.setEnabled(false);
            }
            if(zar==4){
                zarimage.setImageDrawable(getDrawable(R.drawable.dort));
                animationZar();
                Toast.makeText(this,"Gelen Zar:"+zar,Toast.LENGTH_SHORT).show();
             //   layout.setBackgroundColor(rainbow[zar]);
                btn2.setEnabled(true);
                btn.setEnabled(false);
            }
            if(zar==5){
                zarimage.setImageDrawable(getDrawable(R.drawable.bes));
                animationZar();
                Toast.makeText(this,"Gelen Zar:"+zar,Toast.LENGTH_SHORT).show();
              //  layout.setBackgroundColor(rainbow[zar]);
                btn2.setEnabled(true);
                btn.setEnabled(false);
            }
            if(zar==6){
                zarimage.setImageDrawable(getDrawable(R.drawable.alti));
                animationZar();
                Toast.makeText(this,"Gelen Zar:"+zar,Toast.LENGTH_SHORT).show();
              //  layout.setBackgroundColor(rainbow[zar]);
                btn2.setEnabled(true);
                btn.setEnabled(false);
            }
            if(puan1==20){
                Toast.makeText(this,"Kazanan P1",Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setOnClickListener(view -> {
            int zar=sayi.nextInt(6)+1;
            System.out.println(zar);
            if(zar==1){
                zarimage.setImageDrawable(getDrawable(R.drawable.bir));
                animationZar();
                Toast.makeText(this,"Gelen Zar:"+zar,Toast.LENGTH_SHORT).show();
              //  layout.setBackgroundColor(rainbow[zar]);
                if(temp>zar){
                    puan1++;
                    p1.setText(Integer.toString(puan1));
                }
                else{
                    puan2++;
                    p2.setText(Integer.toString(puan2));
                }
                btn.setEnabled(true);
                btn2.setEnabled(false);
            }
            if(zar==2){
                zarimage.setImageDrawable(getDrawable(R.drawable.iki));
                animationZar();
                Toast.makeText(this,"Gelen Zar:"+zar,Toast.LENGTH_SHORT).show();
              //  layout.setBackgroundColor(rainbow[zar]);
                if(temp>zar){
                    puan1++;
                    p1.setText(Integer.toString(puan1));
                }
                else{
                    puan2++;
                    p2.setText(Integer.toString(puan2));
                }
                btn.setEnabled(true);
                btn2.setEnabled(false);
            }
            if(zar==3){
                zarimage.setImageDrawable(getDrawable(R.drawable.uc));
                animationZar();
                Toast.makeText(this,"Gelen Zar:"+zar,Toast.LENGTH_SHORT).show();
             //   layout.setBackgroundColor(rainbow[zar]);
                if(temp>zar){
                    puan1++;
                    p1.setText(Integer.toString(puan1));
                }
                else{
                    puan2++;
                    p2.setText(Integer.toString(puan2));
                }
                btn.setEnabled(true);
                btn2.setEnabled(false);
            }
            if(zar==4){
                zarimage.setImageDrawable(getDrawable(R.drawable.dort));
                animationZar();
                Toast.makeText(this,"Gelen Zar:"+zar,Toast.LENGTH_SHORT).show();
             //   layout.setBackgroundColor(rainbow[zar]);
                if(temp>zar){
                    puan1++;
                    p1.setText(Integer.toString(puan1));
                }
                else{
                    puan2++;
                    p2.setText(Integer.toString(puan2));
                }
                btn.setEnabled(true);
                btn2.setEnabled(false);
            }
            if(zar==5){
                zarimage.setImageDrawable(getDrawable(R.drawable.bes));
                animationZar();
                Toast.makeText(this,"Gelen Zar:"+zar,Toast.LENGTH_SHORT).show();
             //   layout.setBackgroundColor(rainbow[zar]);
                if(temp>zar){
                    puan1++;
                    p1.setText(Integer.toString(puan1));
                }
                else{
                    puan2++;
                    p2.setText(Integer.toString(puan2));
                }
                btn.setEnabled(true);
                btn2.setEnabled(false);
            }
            if(zar==6){
                zarimage.setImageDrawable(getDrawable(R.drawable.alti));
                animationZar();
                Toast.makeText(this,"Gelen Zar:"+zar,Toast.LENGTH_SHORT).show();
             //   layout.setBackgroundColor(rainbow[zar]);
                if(temp>zar){
                    puan1++;
                    p1.setText(Integer.toString(puan1));
                }
                else{
                    puan2++;
                    p2.setText(Integer.toString(puan2));
                }
                btn.setEnabled(true);
                btn2.setEnabled(false);
            }
            if(puan2==20){
                Toast.makeText(this,"Kazanan P2",Toast.LENGTH_SHORT).show();
            }
        });
    }
    private  void  animationZar(){
        RotateAnimation rotate = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(1000);
        rotate.setInterpolator(new LinearInterpolator());
        zarimage.setAnimation(rotate);
    }


}