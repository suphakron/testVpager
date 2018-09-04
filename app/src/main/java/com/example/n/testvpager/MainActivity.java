package com.example.n.testvpager;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends Activity {
    ImageView imageView1;
    TextView tvpage;
    float x1,y1;
    float x2,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//for no title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
//link up with XML files
        imageView1 = (ImageView)findViewById(R.id.imageView1);
        tvpage = (TextView)findViewById(R.id.tvpage);

    }

    /* //declare method for detecting gesture
    public boolean onTouchEvent(MotionEvent touchevent)
    {
    switch (touchevent.getAction())
    {
    // when user first touches the screen we get x and y coordinate
    case MotionEvent.ACTION_DOWN:
    {
    x1 = touchevent.getX();
    y1 = touchevent.getY();
    break;
    }
    case MotionEvent.ACTION_UP:
    {
    x2 = touchevent.getX();
    y2 = touchevent.getY();
    //if left to right sweep event on screen
    if (x1 < x2)
    {
    Toast.makeText(this, "Left to Right Swap Performed", Toast.LENGTH_LONG).show();
    Intent i = new Intent(MainActivity.this,Secondpage.class);
    startActivity(i);
    }
    // if right to left sweep event on screen
    if (x1 > x2)
    {
    Toast.makeText(this, "Right to Left Swap Performed", Toast.LENGTH_LONG).show();
    }



    }
    }
    return false;
    }*/
    public boolean onTouchEvent(MotionEvent touchevent)
    {
        switch (touchevent.getAction())
        {
// when user first touches the screen we get x and y coordinate
            case MotionEvent.ACTION_DOWN:
            {
                x1 = touchevent.getX();
                y1 = touchevent.getY();
                break;
            }
            case MotionEvent.ACTION_UP:
            {
                x2 = touchevent.getX();
                y2 = touchevent.getY();
//if left to right sweep event on screen
                if (x1 < x2)
                {
                    Toast.makeText(this, "Left to Right Swap Performed", Toast.LENGTH_LONG).show();
                }
// if right to left sweep event on screen
                if (x1 > x2)
                {
                    Toast.makeText(this, "Right to Left Swap Performed", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(i);
                }
// if UP to Down sweep event on screen
                if (y1 < y2)
                {
//Toast.makeText(this, "UP to Down Swap Performed", Toast.LENGTH_LONG).show();
                }
//if Down to UP sweep event on screen
                if (y1 > y2)
                {
// Toast.makeText(this, "Down to UP Swap Performed", Toast.LENGTH_LONG).show();
                }
                break;
            }
        }
        return false;
    }


}
