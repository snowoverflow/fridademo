package com.yangjl.fridademo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button bt1;
    public Button bt2;
    public Button bt3;
    public Button bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.id_bt1);
        bt2 = findViewById(R.id.id_bt2);
        bt3 = findViewById(R.id.id_bt3);
        bt4 = findViewById(R.id.id_bt4);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToase(Utils.getPwd());
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToase(Utils.getCoinMoney(new CoinMoney(2)) + "");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToase(Utils.getCoin().getMoney() + "");
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToase(Utils.getCoinMoney(new CoinMoney(123)) + "");
            }
        });
    }

    private void showToase(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
