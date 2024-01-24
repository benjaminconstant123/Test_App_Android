package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton ButtonAdd1 ;
    private FloatingActionButton ButtonAdd2 ;
    private TextView TextView1;
    private TextView TextView2;
    private View.OnClickListener ButtonAddListener1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.i("INFO", "onclick 1");
        }
    };
    private View.OnClickListener ButtonAddListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.i("INFO", "onclick 2");
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButtonAdd1 = findViewById(R.id.Add1);
        ButtonAdd2 = findViewById(R.id.Add2);
        ButtonAdd1.setOnClickListener(ButtonAddListener1);
        ButtonAdd2.setOnClickListener(ButtonAddListener2);
    }
}