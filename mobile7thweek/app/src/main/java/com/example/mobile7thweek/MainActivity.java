package com.example.mobile7thweek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(MainActivity.this, "사진토스트", Toast.LENGTH_SHORT);
                Display display = ((WindowManager)getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setImageResource(R.drawable.q10);
                toast.setView(imageView);
                int xoffset = (int)(Math.random() * display.getWidth());
                int yoffset = (int)(Math.random() * display.getHeight());
                toast.setGravity(Gravity.TOP | Gravity.LEFT, xoffset, yoffset);
                toast.show();
            }
        });
    }
}