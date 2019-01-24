package com.sritech.www.intentjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    private TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        txt1=findViewById(R.id.txt1);

        String name= getIntent().getStringExtra("name");
        String email=getIntent().getStringExtra("email");
        txt1.setText("Welcome \n"+name+"\n"+email);
    }
}
