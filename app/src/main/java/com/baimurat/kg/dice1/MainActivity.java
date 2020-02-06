package com.baimurat.kg.dice1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    public static final Random RANDOM = new Random();
    private Button ROLL;
    private ImageView Image6, Image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ROLL = (Button) findViewById(R.id.ROLL);
        Image2 = (ImageView) findViewById(R.id.Image2);
        Image6 = (ImageView) findViewById(R.id.Image6);


        ROLL.setOnClickListener(new View.OnClickListener() {
            @Override



    public void onClick(View view) {

        int value1 = randomDiceValue();
        int value2 = randomDiceValue();


        int res1 = getResources().getIdentifier("dice" + value1, "drawable", "com.atay.kg.dice");
        int res2 = getResources().getIdentifier("dice" + value2, "drawable", "com.atay.kg.dice");


        Image2.setImageResource(res1);
        Image6.setImageResource(res2);
    }
});
}


    public static int randomDiceValue() {
        return RANDOM.nextInt(6) + 1;
        }
        }