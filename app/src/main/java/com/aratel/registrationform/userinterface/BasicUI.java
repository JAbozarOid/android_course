package com.aratel.registrationform.userinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.aratel.registrationform.R;

public class BasicUI extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_u_i);

        textView = findViewById(R.id.tv_hello);

    }

    public void onClick(View view) {
        textView.setVisibility(View.VISIBLE);
    }
}