package com.example.administrator.activitychangetesthuziyang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mybutton=(Button)findViewById(R.id.mybutton01);
        mybutton.setOnClickListener(new Btnlistener());
        class Btnlistener implements
      View.OnClickListerner{
            @Override
            public void onClick(View view){
                Intent intent =new Intent();
                intent.setClass(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                finish();
            }
        }
    }
}

