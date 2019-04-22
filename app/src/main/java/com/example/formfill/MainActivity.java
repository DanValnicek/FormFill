package com.example.formfill;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick (View view){
        TextView FNtext = findViewById(R.id.FNtext);
            FNtext.setText("");

        TextView LNtext = findViewById(R.id.LNtext);
            FNtext.setText("");

        TextView EMtext = findViewById(R.id.EMtext);
            EMtext.setText("");

        EditText nInput = findViewById(R.id.nInput);
            FNtext.setText("First name: " + nInput.getText().toString());

        EditText lInput = findViewById(R.id.lInput);
            LNtext.setText("Last name: " + lInput.getText().toString());

        EditText emInput = findViewById(R.id.emInput);
            EMtext.setText("e-mail: " + emInput.getText().toString());
    }
}
