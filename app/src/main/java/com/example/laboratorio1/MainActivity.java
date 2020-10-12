package com.example.laboratorio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Switch cambiar;
    ImageView imgv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cambiar = (Switch)findViewById(R.id.switch1);
        imgv2 = (ImageView)findViewById(R.id.imageView2);

        cambiar.setChecked(false);
    cambiar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

            if (isChecked){
                imgv2.setImageResource(R.drawable.lobo);
            } else{
                imgv2.setImageResource(R.drawable.will);
            }
        }
    });

    }
}