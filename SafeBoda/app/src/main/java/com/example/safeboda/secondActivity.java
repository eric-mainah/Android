package com.example.safeboda;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends MainActivity {
    TextView myfname,mylname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        myfname = findViewById(R.id.fnameDisp);
        mylname = findViewById(R.id.lnameDisp);

        Intent intent = getIntent();

        String nameone = intent.getStringExtra("fname");
        String nametwo = intent.getStringExtra("lname");

        myfname.setText(nameone);
        mylname.setText(nametwo);

    }
}
