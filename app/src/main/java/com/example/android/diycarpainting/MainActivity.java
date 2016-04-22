package com.example.android.diycarpainting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This onClick method starts a new activity
     * for each button.
     */

    public void showActivity(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Start Here")) {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        } else if (button_text.equals("Prepare")) {
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);
        } else if (button_text.equals("Sand and Clean")) {
            Intent intent = new Intent(this, FourthActivity.class);
            startActivity(intent);
        } else if (button_text.equals("Mask and Prime")) {
            Intent intent = new Intent(this, FifthActivity.class);
            startActivity(intent);
        } else if (button_text.equals("Paint and Buff")) {
            Intent intent = new Intent(this, SixthActivity.class);
            startActivity(intent);
        }


    }
}