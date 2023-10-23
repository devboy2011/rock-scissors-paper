package com.example.kbb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bua1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bua1);

        Button button = findViewById(R.id.bua1HomeButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(Bua1Activity.this, MainActivity.class);
                startActivity(intent);

            }
        });

        Button again = findViewById(R.id.bua1Again);
        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(Bua1Activity.this, PlayActivity.class);
                startActivity(intent);

            }
        });
    }
}