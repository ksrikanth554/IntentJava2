package com.sritech.www.intentjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b1.setOnClickListener(v->{
            Intent i=new Intent();
            i.setAction(Intent.ACTION_DIAL);
            //i.setAction(Intent.ACTION_VIEW);
           // i.setAction("android.media.action.IMAGE_CAPTURE");
            startActivity(i);



        });
        b2.setOnClickListener(v->{

        });
        b3.setOnClickListener(v->{

        });
    }
}
