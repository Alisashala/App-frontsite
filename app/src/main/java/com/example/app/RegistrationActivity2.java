package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistrationActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration2);
    }

    public void one(View view) {
        Intent intent = new Intent(RegistrationActivity2.this, ActivityOne.class);
        startActivity(intent);
    }
    public void two(View view) {
        Intent intent = new Intent(RegistrationActivity2.this, ActivityTwo.class);
        startActivity(intent);
    }
    public void three(View view) {
        Intent intent = new Intent(RegistrationActivity2.this, ActivityThree.class);
        startActivity(intent);
    }
    public void four(View view) {
        Intent intent = new Intent(RegistrationActivity2.this, ActivityFour.class);
        startActivity(intent);
    }
}