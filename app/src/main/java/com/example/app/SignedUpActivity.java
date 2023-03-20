package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.app.R;

public class SignedUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signed_up);

        Intent intentFromRegistration = getIntent();

        String nameOfChosenActivity = intentFromRegistration.getStringExtra("message");

        TextView textName = (TextView)findViewById(R.id.activityName);

        textName.setText(nameOfChosenActivity);

        String infoOfChosenActivity = intentFromRegistration.getStringExtra("message1");

        TextView textInfo = (TextView)findViewById(R.id.infoOfActivity);

        textInfo.setText(infoOfChosenActivity);


    }
}
