package com.mycorp.challengeone.two;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mycorp.challengeone.R;
import com.mycorp.challengeone.one.DetailActivity;

public class ResultActivity extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        text = findViewById(R.id.text_two);
        Button btn =  findViewById(R.id.button_two);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (text.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Field Doesn't empty", Toast.LENGTH_LONG).show();
                }else {
                    String result = text.getText().toString();

                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                    intent.putExtra("result", result);
                    finish();
                    startActivity(intent);
                }
            }
        });

    }
}