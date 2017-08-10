package com.example.holy.foodie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Foodie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodie);

        Button healthyRecipeButton = (Button) findViewById(R.id.healthy_recipe);
        healthyRecipeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), HealthyRecipe.class);
                startActivity(intent);
            }
        });

        Button dontEatTheseButton = (Button) findViewById(R.id.dont_eat_these);
        dontEatTheseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), DontEatThese.class);
                startActivity(intent);
            }
        });

        Button eatTheseButton = (Button) findViewById(R.id.eat_these);
        eatTheseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), EatThese.class);
                startActivity(intent);
            }
        });

        Button fullFatSkimMilkButton = (Button) findViewById(R.id.full_fat_skim_milk);
        fullFatSkimMilkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), FullCreamSkimMilk.class);
                startActivity(intent);
            }
        });

        Button teaCoffeeButton = (Button) findViewById(R.id.tea_coffee);
        teaCoffeeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), TeaCoffee.class);
                startActivity(intent);
            }
        });
    }
}