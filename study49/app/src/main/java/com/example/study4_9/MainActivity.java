package com.example.study4_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button button;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btn);
        img = (ImageView) findViewById(R.id.image);
        img.setImageResource(R.drawable.compass);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setRotation(img.getRotation()+10);
            }
        });
    }
}