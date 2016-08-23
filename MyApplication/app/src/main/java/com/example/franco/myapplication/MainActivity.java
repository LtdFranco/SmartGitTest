package com.example.franco.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText eText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String motify;

        eText = (EditText) findViewById(R.id.GitTestText);

        motify="Test Rebase" + "this is master";
        eText.setText(motify);

        //eText.setText("Test Rebase");

    }
}
