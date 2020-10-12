package com.example.bergerak1.modul;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bergerak1.R;

public class AddActivity extends AppCompatActivity {
    TextView header;
    Button btnCancel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_add_task);
//        header = findViewById(R.id.headerAdd);
        btnCancel = findViewById(R.id.cancelTaskBtn);

        //header.setText("Success 2");

        btnCancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                move();
            }
        });
    }
    public void move(){
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }
}
