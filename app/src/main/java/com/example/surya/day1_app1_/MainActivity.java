package com.example.surya.day1_app1_;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by surya on 11/10/16.
 */
public class MainActivity extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ctivity_main);

        TextView textView=(TextView)findViewById(R.id.textView1);
        Toast.makeText(this,"First Activity",Toast.LENGTH_LONG).show();
        
    }
}