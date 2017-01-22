package com.example.mainpchan.csc201_ch549_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn).setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new View.OnClickListener() {
        public void onClick(View v) {

            EditText temp =(EditText) findViewById(R.id.input);
            String input = String.valueOf(temp.getText()).trim();

            TextView voutput =(TextView)findViewById(R.id.voutput);
            TextView coutput =(TextView)findViewById(R.id.coutput);

            int j = input.length() - 1;
            int vowels = 0;
            int cans = 0;


            for (int i = 0; i <= j; i++) {
                if (input.substring(i, (i + 1)).equalsIgnoreCase("a")) {
                    vowels++;
                } else if (input.substring(i, (i + 1)).equalsIgnoreCase("e")) {
                    vowels++;
                } else if (input.substring(i, (i + 1)).equalsIgnoreCase("i")) {
                    vowels++;
                } else if (input.substring(i, (i + 1)).equalsIgnoreCase("o")) {
                    vowels++;
                } else if (input.substring(i, (i + 1)).equalsIgnoreCase("u")) {
                    vowels++;
                } else if (input.substring(i, (i + 1)).equalsIgnoreCase(" ")) {

                } else {
                    cans++;
                }

            }

            voutput.setText("The number of vowels is " + vowels);
            coutput.setText("The number of consonants is " + cans);

        }
    };
}