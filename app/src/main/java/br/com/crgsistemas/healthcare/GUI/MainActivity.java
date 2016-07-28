package br.com.crgsistemas.healthcare.GUI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.crgsistemas.healthcare.R;

public class MainActivity extends AppCompatActivity {

    Button btnPersonData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPersonData = (Button) findViewById(R.id.btnPerson);

    }

    public void showPersonData(View v) {
        Intent i = new Intent(getApplicationContext(), PersonActivity.class);
        startActivity(i);
    }
}
