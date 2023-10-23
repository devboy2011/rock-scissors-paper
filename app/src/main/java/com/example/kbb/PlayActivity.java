package com.example.kbb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        Button home = findViewById(R.id.homebutton);
        home.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(PlayActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

        ImageView keo1 = findViewById(R.id.keo1);

        keo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();

                Random random = new Random();

                int may = random.nextInt(3);

                switch (may) {
                    case 0 :
                        intent.setClass(PlayActivity.this, Keo1Activity.class);
                        break;
                    case 1 :
                        intent.setClass(PlayActivity.this, Keo2Activity.class);
                        break;
                    default :
                        intent.setClass(PlayActivity.this, Keo3Activity.class);
                }

                startActivity(intent);
            }
        });

        ImageView bua1 = findViewById(R.id.bua1);

        bua1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();

                Random random = new Random();

                int may = random.nextInt(3);

                switch (may) {
                    case 0 :
                        intent.setClass(PlayActivity.this, Bua1Activity.class);
                        break;
                    case 1 :
                        intent.setClass(PlayActivity.this, Bua2Activity.class);
                        break;
                    default :
                        intent.setClass(PlayActivity.this, Bua3Activity.class);
                }

                startActivity(intent);
            }
        });

        ImageView bao1 = findViewById(R.id.bao1);

        bao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();

                Random random = new Random();

                int may = random.nextInt(3);

                switch (may) {
                    case 0 :
                        intent.setClass(PlayActivity.this, Bao1Activity.class);
                        break;
                    case 1 :
                        intent.setClass(PlayActivity.this, Bao2Activity.class);
                        break;
                    default :
                        intent.setClass(PlayActivity.this, Bao3Activity.class);
                }

                startActivity(intent);
            }
        });
    }
}