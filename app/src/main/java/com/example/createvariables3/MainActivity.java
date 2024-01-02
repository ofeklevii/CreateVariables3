package com.example.createvariables3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    int sum=0;
    String str = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
    }

    public void exe3(View view) {
        if (sum<6)
        {
            str = sum + "";
            btn.setText("This is a click number:" + str);
            sum++;
        }
        else {
            btn.setText("Enough to click. Go to new start!");
            sum = 0;
        }
    }
}