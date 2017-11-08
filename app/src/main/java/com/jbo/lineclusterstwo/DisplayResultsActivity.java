package com.jbo.lineclusterstwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_results);

        // Get the Intent that started this activity and extract the parameters
        Intent intent = getIntent();
        int n = intent.getIntExtra(MainActivity.n__key,0);
        int N = intent.getIntExtra(MainActivity.N__key,0);

        //Generate a string from parameters as POC
        String params = "n: " + n + " N: " + N;

        // Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(params);
    }
}
