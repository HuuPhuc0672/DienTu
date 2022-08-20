package com.example.dientu.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dientu.R;
public class Game3Activity extends AppCompatActivity {
    private TextView btnDung;
    private TextView btnSai;
    private TextView btnSai2;
    private TextView btnSai3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game3);
        btnDung = (TextView) findViewById(R.id.btnDungcau3);
        btnSai = (TextView) findViewById(R.id.btnSaicau3);
        btnSai2 = (TextView) findViewById(R.id.btnSai2cau3);
        btnSai3 = (TextView) findViewById(R.id.btnSai3cau3);
        btnDung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Game3Activity.this, Game5Activity.class);
                Toast.makeText(Game3Activity.this, "Bạn đã chọn đúng", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnSai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Game3Activity.this, "Bạn Chọn Sai. Mời Bạn Chọn Lại", Toast.LENGTH_SHORT).show();
            }
        });
        btnSai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Game3Activity.this, "Bạn Chọn Sai. Mời Bạn Chọn Lại", Toast.LENGTH_SHORT).show();
            }
        });
        btnSai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Game3Activity.this, "Bạn Chọn Sai. Mời Bạn Chọn Lại", Toast.LENGTH_SHORT).show();
            }
        });
    }
}