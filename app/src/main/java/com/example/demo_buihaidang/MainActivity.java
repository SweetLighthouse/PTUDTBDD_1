package com.example.demo_buihaidang;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textShow=findViewById(R.id.textShow);
        final EditText editName=findViewById(R.id.editName);
        Button btnShow=findViewById(R.id.btnShow);
        btnShow.setOnClickListener(v -> {
            String name=editName.getText().toString();
            textShow.setText(String.format("Hello %s", name));
            Toast.makeText(MainActivity.this,"Hello "+name, Toast.LENGTH_LONG).show();
        });

    }
}
