package com.example.bergerak1.modul;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bergerak1.R;

public class FirstActivity extends AppCompatActivity {
    TextView header;
    Button btnAdd;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_list_task);
//        header = findViewById(R.id.headerMain);
        btnAdd = findViewById(R.id.createTaskBtn);

        header.setText("Success");

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                move();
            }
        });
    }

    public void move(){
        Intent intent = new Intent(this, AddActivity.class);
        startActivity(intent);
    }
}
