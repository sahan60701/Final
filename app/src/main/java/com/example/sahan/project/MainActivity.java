package com.example.sahan.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onBtnClicked(View v) {

        if (v.getId() == R.id.button4) {
            MessageBox("About This Game");
        }
        if (v.getId() == R.id.button5) {

            System.exit(0);
        }
        if (v.getId() == R.id.button3) {

            MessageBox("Visit Our Web Site to view TopPlayers");
        }
        if (v.getId() == R.id.button1) {
            Intent intent;
            intent = new Intent(MainActivity.this, Qrcode.class);
            startActivity(intent);
        }


    }
    public void MessageBox(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}

