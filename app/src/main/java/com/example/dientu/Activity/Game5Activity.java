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
public class Game5Activity extends AppCompatActivity {
    private TextView btnDung;
    private TextView btnSai;
    private TextView btnSai2;
    private TextView btnSai3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game5);
        btnDung = (TextView) findViewById(R.id.btnDungcau5);
        btnSai = (TextView) findViewById(R.id.btnSaicau5);
        btnSai2 = (TextView) findViewById(R.id.btnSai2cau5);
        btnSai3 = (TextView) findViewById(R.id.btnSai3cau5);
        btnDung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Game5Activity.this, Game6Activity.class);
                Toast.makeText(Game5Activity.this, "Bạn đã chọn đúng", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnSai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Game5Activity.this, "Bạn Chọn Sai. Mời Bạn Chọn Lại", Toast.LENGTH_SHORT).show();
            }
        });
        btnSai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Game5Activity.this, "Bạn Chọn Sai. Mời Bạn Chọn Lại", Toast.LENGTH_SHORT).show();
            }
        });
        btnSai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Game5Activity.this, "Bạn Chọn Sai. Mời Bạn Chọn Lại", Toast.LENGTH_SHORT).show();
            }
        });
    }
}