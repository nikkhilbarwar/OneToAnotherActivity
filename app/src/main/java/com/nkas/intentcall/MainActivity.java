package com.nkas.intentcall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendToAnother(View view) {
        Intent intent = new Intent(MainActivity.this, SumOne.class);
        startActivity(intent);
        //finish();
        // add this line this is optional because if
        // user enter into sumOne activity and press back button
        //then he/she will exit the app
    }

}

//error is gone and lets run and try the app

//thanks for watching guys hope you like it subscribe for more information