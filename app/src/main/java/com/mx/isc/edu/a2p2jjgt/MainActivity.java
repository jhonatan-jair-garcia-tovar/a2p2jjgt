package com.mx.isc.edu.a2p2jjgt;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
RadioButton c1,c2,c3,c4;

CheckBox casa, escu, trab;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=findViewById(R.id.radioButton);
        c2=findViewById(R.id.radioButton2);
        c3=findViewById(R.id.radioButton3);
        c4=findViewById(R.id.radioButton4);
        escu=findViewById(R.id.checkBox);
        casa=findViewById(R.id.checkBox2);
        trab=findViewById(R.id.checkBox3);


    }
    public void mensaje(View view){
        if (c1.isChecked()){
            Toast to1=Toast.makeText(getApplicationContext(), c1.getText(), Toast.LENGTH_SHORT);
            to1.show();
        }
        if (c2.isChecked()){
            Toast to1=Toast.makeText(getApplicationContext(), c2.getText(), Toast.LENGTH_SHORT);
            to1.show();
        }
        if (c3.isChecked()){
            Toast to1=Toast.makeText(getApplicationContext(), c3.getText(), Toast.LENGTH_SHORT);
            to1.show();
        }
        if (c4.isChecked()){
            Toast to1=Toast.makeText(getApplicationContext(), c4.getText(), Toast.LENGTH_SHORT);
            to1.show();
        }

        if (escu.isChecked()){
            Toast to1=Toast.makeText(getApplicationContext(), escu.getText(), Toast.LENGTH_SHORT);
            to1.show();
        }
        if (casa.isChecked()){
            Toast to1=Toast.makeText(getApplicationContext(), casa.getText(), Toast.LENGTH_SHORT);
            to1.show();
        }
        if (trab.isChecked()){
            Toast to1=Toast.makeText(getApplicationContext(), trab.getText(), Toast.LENGTH_SHORT);
            to1.show();
        }
    }

    @Override
    public void onClick(View view) {

    }
}
