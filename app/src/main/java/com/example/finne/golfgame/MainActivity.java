package com.example.finne.golfgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    MediaPlayer mMPlayer;
    Distance distance = new Distance();

    //play sound
    public void swingSound() {
        mMPlayer = MediaPlayer.create(this, R.raw.swing);
        mMPlayer.start();
    }

    public void buttonTapped(View view) {
        //hent id på den knap som er blevet tapped.
        int id = view.getId();
        String ourId = "";
        ourId = view.getResources().getResourceEntryName(id);
        Log.i("Button tapped",ourId);

        //valg af function.
        if (ourId.equals("driver")) {
            swingSound();
            Toast.makeText(MainActivity.this,String.valueOf(distance.getDriverDistance()),Toast.LENGTH_SHORT).show();
        } else if (ourId.equals("wood_3")) {
            swingSound();
            Toast.makeText(MainActivity.this,String.valueOf(distance.get3woodDistance()),Toast.LENGTH_SHORT).show();
        } else if (ourId.equals("imageButton")) {
            swingSound();
            Toast.makeText(MainActivity.this,String.valueOf(distance.getDriverDistance()),Toast.LENGTH_SHORT).show();
        }
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }




}










/*
package com.example.finne.golfgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    MediaPlayer mMPlayer;
    Distance distance = new Distance();

    //play sound
    public void swingSound() {
        mMPlayer = MediaPlayer.create(this, R.raw.swing);
        mMPlayer.start();
    }

    //Driver button
    public void chooseDriver(View view) {
        swingSound();
        Toast.makeText(MainActivity.this,String.valueOf(distance.getDriverDistance()),Toast.LENGTH_SHORT).show();
    }

    //3-wood button
    public void choose3Wood(View view) {
        swingSound();
        Toast.makeText(MainActivity.this,String.valueOf(distance.get3woodDistance()),Toast.LENGTH_SHORT).show();
    }







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }




}


 */