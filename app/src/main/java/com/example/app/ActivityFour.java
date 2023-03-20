package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
    }
    public void deltag(View view) {

        Intent intent = new Intent(ActivityFour.this, SignedUpActivity.class);
        TextView textView = findViewById(R.id.textView7);
        String inputAsString = textView.getText().toString();
        intent.putExtra("message", inputAsString);
        startActivity(intent);

        TextView textView1 = findViewById(R.id.textView8);
        String inputAsString1 = textView1.getText().toString();
        intent.putExtra("message1", inputAsString1);
        startActivity(intent);
    }

    public void tilbage (View view) {
        finish();
    }
}