package com.example.safeboda;
//mipmap-crops an image
//drawable-doesn't crop
//if you have a heavy
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread songa = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(1000);
                    Intent endaMain = new Intent(splashActivity.this , MainActivity.class);
                    startActivity(endaMain);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        songa.start();
    }
}
