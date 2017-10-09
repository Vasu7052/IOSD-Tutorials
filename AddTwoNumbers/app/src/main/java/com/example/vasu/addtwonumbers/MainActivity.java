package com.example.vasu.addtwonumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etFirst , etSecond , etAnswer ;
    Button add ;
    int first , second , answer ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirst = (EditText) findViewById(R.id.editTextFirst);
        etSecond = (EditText) findViewById(R.id.editTextSecond);
        etAnswer = (EditText) findViewById(R.id.editTextAnswer);

        add = (Button) findViewById(R.id.buttonAdd);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                first = Integer.parseInt(etFirst.getText().toString());
                second = Integer.parseInt(etSecond.getText().toString());

                answer = first + second ;

                etAnswer.setText("" + answer);

            }
        });
    }
}
