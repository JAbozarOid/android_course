package com.aratel.registrationform.userinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.aratel.registrationform.R;

import java.util.ArrayList;

public class BasicUI extends AppCompatActivity {

    private TextView textView;
    private RadioGroup rg;
    private EditText editText;
    private ProgressBar progressBar;

    private ListView listView;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_u_i);

        textView = findViewById(R.id.tv_hello);
        editText = findViewById(R.id.edt_name);
        rg = findViewById(R.id.rg);
        progressBar = findViewById(R.id.progress_bar);

        updateProgressBar();

        // define listview -> for adding items to spinner use like this
        listView = findViewById(R.id.listview);

        // if we use final for variable or objects we can not change the value of it but we can use the methods or attributes of it
        final ArrayList<String> names = new ArrayList<>();
        names.add("abozar");
        names.add("abel");
        names.add("amin");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(BasicUI.this, names.get(position), Toast.LENGTH_SHORT).show();
            }
        });

        spinner = findViewById(R.id.spinner);
        spinner.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,names));
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(BasicUI.this, names.get(position), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
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