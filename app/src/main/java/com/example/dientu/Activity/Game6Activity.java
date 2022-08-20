package com.example.dientu.Activity;

import androidx.appcompat.app.AppCompatActivity;
import com.example.dientu.R;
import com.example.dientu.WinActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Game6Activity extends AppCompatActivity {
    private TextView btnDung;
    private TextView btnSai;
    private TextView btnSai2;
    private TextView btnSai3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game6);
        btnDung = (TextView) findViewById(R.id.btnDung);
        btnSai = (TextView) findViewById(R.id.btnSai);
        btnSai2 = (TextView) findViewById(R.id.btnSai2);
        btnSai3 = (TextView) findViewById(R.id.btnSai3);
        btnDung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Game6Activity.this, WinActivity.class);
                Toast.makeText(Game6Activity.this, getString(R.string.tra_dung), Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnSai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Game6Activity.this, getString(R.string.tra_sai), Toast.LENGTH_SHORT).show();
            }
        });
        btnSai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Game6Activity.this, getString(R.string.tra_sai), Toast.LENGTH_SHORT).show();
            }
        });
        btnSai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Game6Activity.this, getString(R.string.tra_sai), Toast.LENGTH_SHORT).show();
            }
        });
    }
}