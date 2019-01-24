package com.sritech.www.intentjava;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button b1,b2,b3;
    private EditText edt1,edt2,edt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        edt1=findViewById(R.id.edt1);
        edt2=findViewById(R.id.edt2);
        edt3=findViewById(R.id.edt3);
        b1.setOnClickListener(v->{
            Intent i=new Intent();
            i.setAction(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:"+edt1.getText().toString()));
            //i.setAction(Intent.ACTION_VIEW);
           // i.setAction("android.media.action.IMAGE_CAPTURE");
            //i.setAction(Intent.ACTION_VIEW);
            //i.setData(Uri.parse("https://"+edt1.getText().toString()));
            //i.setAction(Intent.ACTION_GET_CONTENT);
            //i.setType("video/*");
            startActivity(i);



        });
        b2.setOnClickListener(v->{
            Intent i=new Intent(this,Welcome.class);
            i.putExtra("name",edt2.getText().toString());
            i.putExtra("email", edt3.getText().toString());
            startActivity(i);

        });
        b3.setOnClickListener(v->{

            Intent i=getPackageManager().getLaunchIntentForPackage("com.testbook.tbapp&hl=en");
            if (i!=null)
            {
                startActivity(i);
            }
            else
            {
                Intent i1=new Intent();
                i1.setAction(Intent.ACTION_VIEW);
                i1.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.testbook.tbapp&hl=en"));
                startActivity(i1);
            }

        });
    }
}
