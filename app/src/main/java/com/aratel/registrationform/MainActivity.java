package com.aratel.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etFirstname, etLastname, etEmail;
    private Button btRegister;
    private TextView tvFirstname, tvLastname, tvEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initWidgets();

        btRegister.setOnClickListener(this);
    }

    private void initWidgets() {
        etFirstname = findViewById(R.id.et_first_name);
        etLastname = findViewById(R.id.et_last_name);
        etEmail = findViewById(R.id.et_email);

        btRegister = findViewById(R.id.bt_register);

        tvFirstname = findViewById(R.id.tv_first_name);
        tvLastname = findViewById(R.id.tv_last_name);
        tvEmail = findViewById(R.id.tv_email);
    }

    @Override
    public void onClick(View view) {
        tvFirstname.setText("Firstname: " + etFirstname.getText().toString());
        tvLastname.setText("Lastname: " + etLastname.getText().toString());
        tvEmail.setText("Email: " + etEmail.getText().toString());
    }
}