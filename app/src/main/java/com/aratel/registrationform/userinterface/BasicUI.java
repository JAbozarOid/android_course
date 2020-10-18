package com.aratel.registrationform.userinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.aratel.registrationform.R;

public class BasicUI extends AppCompatActivity {

    private TextView textView;
    private RadioGroup rg;
    private EditText editText;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_u_i);

        textView = findViewById(R.id.tv_hello);
        editText = findViewById(R.id.edt_name);
        rg = findViewById(R.id.rg);
        progressBar = findViewById(R.id.progress_bar);

        updateProgressBar();

    }

    private void updateProgressBar() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    progressBar.incrementProgressBy(10);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread.start();
    }

    public void onClick(View view) {
        textView.setVisibility(View.VISIBLE);
    }

    public void onRadioClicked(View view) {
        int radioId = rg.getCheckedRadioButtonId();
        switch (radioId) {
            case R.id.rb_male:
                editText.setText("male");
                break;
            case R.id.rb_female:
                editText.setText("female");
                break;
            case R.id.rb_not_specify:
                editText.setText("not specify");
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + radioId);
        }
    }
}