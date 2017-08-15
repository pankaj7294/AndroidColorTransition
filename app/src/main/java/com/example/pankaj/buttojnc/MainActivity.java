package com.example.pankaj.buttojnc;

import android.app.Activity;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends Activity
{
 //Button button1;
    LinearLayout ll;
    /*Integer[] colors = {
            R.color.color1,
            R.color.color2,
            R.color.color3,
            R.color.color4,
            R.color.color5,

    };*/
 //   Random random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll=(LinearLayout)findViewById(R.id.ll1);
       //  button1=(Button)findViewById(R.id.button);
       // button1.setOnClickListener(new View.OnClickListener() {
           // @Override
           // public void onClick(View v) {
           // button1.setBackgroundColor(ContextCompat.getColor());
     //       }
        //});
    }
    public void change (View v)
    {
        Random rnd=new Random();
       int color= Color.argb(255,rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
        ll.setBackgroundColor(color);
    }
}
