package com.example.study4_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {
    Button button;
    CheckBox enabler, clickable, rotate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        enabler = (CheckBox) findViewById(R.id.enabler);
        clickable = (CheckBox) findViewById(R.id.checkabler);
        rotate = (CheckBox) findViewById(R.id.angler);

        enabler.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(enabler.isChecked()){
                    button.setEnabled(true);
                }
                if(!enabler.isChecked()){
                    button.setEnabled(false);
                }
            }
        });

        clickable.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(clickable.isChecked()){
                    button.setClickable(true);
                }
                if(!clickable.isChecked()){
                    button.setClickable(false);
                }
            }
        });

        rotate.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(rotate.isChecked()){
                    button.setRotation(45);
                }
                if(!rotate.isChecked()){
                    button.setRotation(0);
                }
            }
        });
    }
}