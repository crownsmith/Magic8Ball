package com.example.magic8ball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView magicBall = (ImageView) findViewById(R.id.magicBall);
        Button askBtn = (Button) findViewById(R.id.askBtn);

        askBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final int[] ballArray = {R.drawable.ball1,
                         R.drawable.ball2,
                         R.drawable.ball3,
                         R.drawable.ball4,
                         R.drawable.ball5};


                Random randomNumberGenerator = new Random();

               int number = randomNumberGenerator.nextInt(5);

               magicBall.setImageResource(ballArray[number]);


            }
        });


    }
}

