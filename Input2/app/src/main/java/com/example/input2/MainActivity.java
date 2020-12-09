package com.example.input2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button submit;
    private EditText data;
    private TextView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.submitID);
        data = findViewById(R.id.numberID);
        show = findViewById(R.id.showID);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer Num =  Integer.valueOf(data.getText().toString());

                int Fac = 1;
                for (int i = Num; i >= 1; i--){
                    Fac = Fac * i;
                }

                show.setText(String.valueOf(Fac));

                Toast.makeText(MainActivity.this, String.valueOf(Fac), Toast.LENGTH_SHORT).show();
            }
        });
    }
}