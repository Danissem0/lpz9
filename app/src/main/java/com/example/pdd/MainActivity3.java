package com.example.pdd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void answer(View view) {
        view.setBackgroundColor(Color.parseColor("#FF1010"));
        Toast myToast = Toast.makeText(getApplicationContext(), "Ответ неверный", Toast.LENGTH_LONG);
        myToast.show();
        myToast.setGravity(Gravity.BOTTOM, 0, 0);
    }

    public void answertry(View view) {
        Intent intent = new Intent( MainActivity3.this, MainActivity4.class);
        startActivity(intent);
    }
}