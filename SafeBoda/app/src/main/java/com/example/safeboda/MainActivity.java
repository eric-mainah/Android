package com.example.safeboda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
EditText fname,lname;
Button saveBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fname=findViewById(R.id.textFirstname);
        lname=findViewById(R.id.textLastname);
        saveBtn=findViewById(R.id.button);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstname=fname.getText().toString();
                String lastname=lname.getText().toString();

                if(firstname.isEmpty()){
                    Toast.makeText(MainActivity.this, "Firstname is required", Toast.LENGTH_SHORT).show();
                }else if(lastname.isEmpty()){
                    Toast.makeText(MainActivity.this, "Lastname is required", Toast.LENGTH_SHORT).show();
                }else{
                    Intent nextPage= new Intent(MainActivity.this , secondActivity.class);
                    nextPage.putExtra("fname" , firstname);
                    nextPage.putExtra("lname" , lastname );
                }

            }
        });
    }
}

