package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SuoLong extends AppCompatActivity {
    private Button mBtn2;
    private Button mBtn3;
    private Button mBtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suo_long);
        mBtn2 = findViewById(R.id.introduction);
        mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到介绍个人信息页面
                Intent intent = new Intent(SuoLong.this,Introduction.class);
                startActivity(intent);
            }
        });
        mBtn3 = findViewById(R.id.btn_love);
        mBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到表达爱意页面
                Intent intent = new Intent(SuoLong.this,Love.class);
                startActivity(intent);
            }
        });
        mBtn4 = findViewById(R.id.lalala);
        mBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到不知道说啥页面
                Intent intent = new Intent(SuoLong.this,lalala.class);
                startActivity(intent);
            }
        });

    }
}
