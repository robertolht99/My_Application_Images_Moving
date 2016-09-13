package com.example.robertoluishernandeztovar.myapplication_example_profe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // this method shows how to fade in and fade out
    public void FirstClick(View view) {
        ImageView android1 = (ImageView) findViewById(R.id.android1);
        ImageView android2 = (ImageView) findViewById(R.id.android2);

        Button Button1 = (Button) findViewById(R.id.Button1);
        Button Button2 = (Button) findViewById(R.id.Button2);
        Button Button3 = (Button) findViewById(R.id.Button3);

        android1.animate().alpha(0f).setDuration(1000);
        android2.animate().alpha(1f).setDuration(1000);


        Button1.setEnabled(false);
        Button2.setVisibility(View.INVISIBLE);


        Button2.setEnabled(true);
        Button2.setVisibility(View.VISIBLE);

        Button3.setEnabled(false);
        Button3.setVisibility(View.VISIBLE);


    }

    // this method shows how to move an image programmatically
    public void moveAndroid3(View view) {
        ImageView android3 = (ImageView) findViewById(R.id.android3);
        ImageView android2 = (ImageView) findViewById(R.id.android2);


        Button Button2 = (Button) findViewById(R.id.Button2);
        Button Button3 = (Button) findViewById(R.id.Button3);
        Button resetButton = (Button) findViewById(R.id.resetButton);


        android2.animate().translationXBy(1000f).setDuration(2000);
        android3.setVisibility(View.VISIBLE);
        android3.animate().translationYBy(3000f).setDuration(2000);


        Button2.setEnabled(false);
        Button2.setVisibility(View.VISIBLE);


        Button3.setEnabled(true);
        Button3.setVisibility(View.VISIBLE);


        resetButton.setEnabled(true);
        resetButton.setVisibility(View.VISIBLE);
    }


    public void moveAndroid4 (View view) {
        ImageView android3 = (ImageView) findViewById(R.id.android3);
        ImageView android4 = (ImageView) findViewById(R.id.android4);


        Button Button3 = (Button) findViewById(R.id.Button3);
        Button resetButton = (Button) findViewById(R.id.resetButton);

        android3.animate().translationXBy(1000f).setDuration(2000);
        android4.setVisibility(View.VISIBLE);
        android4.animate().translationY(-100f).setDuration(2000);

        Button3.setEnabled(false);
        Button3.setVisibility(View.VISIBLE);

        resetButton.setEnabled(true);
        resetButton.setVisibility(View.VISIBLE);




    }

    public void resetear(View view) {
        Button Button1 = (Button) findViewById(R.id.Button1);
        Button resetButton = (Button) findViewById(R.id.resetButton);
        ImageView android1 = (ImageView) findViewById(R.id.android1);
        ImageView android2 = (ImageView) findViewById(R.id.android2);
        ImageView android3 = (ImageView) findViewById(R.id.android3);
        ImageView android4 = (ImageView) findViewById(R.id.android4);

        android4.setVisibility(View.INVISIBLE);
        android4.setTranslationY(-3000f);
        android3.setVisibility(View.INVISIBLE);
        android3.setTranslationY(-3000f);
        android3.setTranslationX(0f);
        android2.setAlpha(0f);
        android2.animate().translationX(0f).setDuration(0);
        android1.setAlpha(1f);


        resetButton.setEnabled(true);
        Button1.setEnabled(true);
        Button1.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView android3 = (ImageView) findViewById(R.id.android3);
        android3.setTranslationY(-3000);

        ImageView android4 = (ImageView) findViewById(R.id.android4);
        android4.setTranslationY(3000);
    }
}

