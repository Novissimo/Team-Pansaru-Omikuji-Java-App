package com.example.omikuji;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button  omikujiButton = findViewById(R.id.mainButton);
                omikujiButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "あなたへの良い知らせ、そしてあなたの親族すべて",Toast.LENGTH_LONG).show();
                    }
                });
    }
}
