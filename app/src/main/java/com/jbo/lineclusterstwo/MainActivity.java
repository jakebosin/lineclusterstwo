package com.jbo.lineclusterstwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Keys for Extra passing
    public static final String n__key = "com.jbo.lineclusterstwo.n";
    public static final String N__key = "com.jbo.lineclusterstwo.N";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Check for null input
    private boolean isEmpty(EditText etText) {
        if (etText.getText().toString().trim().length() > 0) return false;
        return true;
    }
    /** Called when the user taps the Start button */
    public void sendParameters(View view) {
        //Declare Parameters you'll pass through
        int n,N;
        //Set Intent
        Intent intent = new Intent(this, OpenGLES20Activity.class);

        //Get, process inputs
        EditText input_N = (EditText) findViewById(R.id.input_N);
        EditText input_n = (EditText) findViewById(R.id.input_n);

        if (isEmpty(input_n)) n=0;
        else n = Integer.parseInt(input_n.getText().toString());

        if (isEmpty(input_N)) N=0;
        else N = Integer.parseInt(input_N.getText().toString());

        //Send inputs to OpenGLES20Activity, Start it
        intent.putExtra(N__key,N);
        intent.putExtra(n__key,n);
        startActivity(intent);

    }
}
