package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnTest, btnInsert, btnReplace, btnClear;
    TextView tvTest;
    EditText etTest, etIndex, etItem;
    ArrayList<String> myArrList;

    public void fill_arr() {
        myArrList.add("Стас");
        myArrList.add("Инна");
        myArrList.add("Вилена");
        myArrList.add("Кристина");

    }

    public void show_arr() {
        for (int i = 0; i < myArrList.size(); i++) {
            tvTest.setText(tvTest.getText() + "\n" + myArrList.get(i));
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myArrList = new ArrayList<String>();
        //fill_arr();
        btnTest = findViewById(R.id.btn_test);
        btnInsert = findViewById(R.id.btn_insert);
        btnReplace = findViewById(R.id.btn_replace);
        btnClear = findViewById(R.id.btn_clear);


        tvTest = findViewById(R.id.tv_test);
        etTest = findViewById(R.id.et_test);
        etIndex = findViewById(R.id.et_index);
        etItem = findViewById(R.id.et_item);

        show_arr();


        btnTest.setOnClickListener(this);
        btnInsert.setOnClickListener(this);
        btnReplace.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_test:
                tvTest.setText("");
                myArrList.add(etTest.getText().toString());
                show_arr();
                break;

            case R.id.btn_insert:

                break;

            case R.id.btn_replace:

                break;

            case R.id.btn_clear:
                tvTest.setText("");
                break;

        }
    }
}
