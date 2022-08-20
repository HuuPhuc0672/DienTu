package com.example.dientu.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dientu.MainActivity;
import com.example.dientu.R;

public class Game1Activity extends AppCompatActivity {
    private TextView btnDung;
    private TextView btnSai;
    private TextView btnSai2;
    private TextView btnSai3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game1);
        btnDung = (TextView) findViewById(R.id.btnDcau1);
        btnSai = (TextView) findViewById(R.id.btnSaicau1);
        btnSai2 = (TextView) findViewById(R.id.btnSai2cau1);
        btnSai3 = (TextView) findViewById(R.id.btnSai3cau1);
        btnDung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Game1Activity.this, Game2Activity.class);
                Toast.makeText(Game1Activity.this, getString(R.string.tra_dung), Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnSai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Game1Activity.this, getString(R.string.tra_sai), Toast.LENGTH_SHORT).show();
            }
        });
        btnSai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Game1Activity.this, getString(R.string.tra_sai), Toast.LENGTH_SHORT).show();
            }
        });
        btnSai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Game1Activity.this, getString(R.string.tra_sai), Toast.LENGTH_SHORT).show();
            }
        });

    }
}