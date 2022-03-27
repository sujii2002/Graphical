package com.example.graphical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //4.change activity main to newly created class
        Samp sc = new Samp(this);
        setContentView(sc);
    }
}
//1.create a new private  class and clear all  errors
class Samp extends View {
    Samp(Context context) {
        super(context);
    }

    //2.do overriding alt+insert

    @Override
    protected void onDraw(Canvas canvas) {
        //super.onDraw(canvas);
        //3.create a paint brush object
        Paint paintb = new Paint();
        paintb.setColor(Color.BLUE);
        canvas.drawPaint(paintb);
        paintb.setColor(Color.YELLOW);
        canvas.drawCircle(70,70,60,paintb);
        // give text below circle
        paintb.setColor(Color.BLACK);
        paintb.setTextSize(40);
        canvas.drawText("Circle",25,180,paintb);
        //draw square
        paintb.setColor(Color.GREEN);
        //left + square dim = right
        canvas.drawRect(170,30,270,130,paintb);
        //give text to square
        paintb.setColor(Color.BLACK);
        paintb.setTextSize(40);
        canvas.drawText("Square",170,180,paintb);
        //draw rectangle
        paintb.setColor(Color.RED);
        canvas.drawRect(40,200,270,280,paintb);
        paintb.setColor(Color.BLACK);
        paintb.setTextSize(40);
        canvas.drawText("Rectangle",60,330,paintb);
        //for line start and end of line X coordiante will be same
        paintb.setColor(Color.YELLOW);
        paintb.setStrokeWidth(4);//thickness of the brush
        canvas.drawLine(40,350,40,450,paintb);
        //text for line
        paintb.setTextSize(40);
        paintb.setColor(Color.BLACK);
        canvas.drawText("Line",30,490,paintb);
    }
}