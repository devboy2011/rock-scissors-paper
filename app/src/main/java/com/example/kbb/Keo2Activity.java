package com.example.kbb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Keo2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keo2);

        Button button = findViewById(R.id.keo2HomeButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(Keo2Activity.this, MainActivity.class);
                startActivity(intent);

            }
        });

        Button again = findViewById(R.id.keo2Again);
        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(Keo2Activity.this, PlayActivity.class);
                startActivity(intent);

            }
        });
    }
}