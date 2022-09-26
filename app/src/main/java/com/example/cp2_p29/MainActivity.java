package com.example.cp2_p29;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate (View view){
        EditText item1 = findViewById(R.id.itemNumber1);
        EditText item2 = findViewById(R.id.itemNumber2);
        EditText item3 = findViewById(R.id.itemNumber3);
        TextView output = findViewById(R.id.output);
        int total = (Integer.parseInt(item1.getText().toString()) * 375) +
                (Integer.parseInt(item2.getText().toString()) * 365) +
                (Integer.parseInt(item3.getText().toString()) * 150);

        output.setText(String.valueOf(total));

        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(findViewById(R.id.button).getWindowToken(), InputMethodManager.RESULT_UNCHANGED_SHOWN);

    }
}