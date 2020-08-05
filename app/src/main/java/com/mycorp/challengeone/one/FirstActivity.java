package com.mycorp.challengeone.one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mycorp.challengeone.R;

public class FirstActivity extends AppCompatActivity {
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        text = findViewById(R.id.first_field);
        Button btn = findViewById(R.id.first_btn);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (text.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Field Doesn't empty", Toast.LENGTH_LONG).show();
                }else {
                    String result = text.getText().toString();

                    Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                    intent.putExtra("result", result);
                    startActivity(intent);
                }
            }
        });
    }
}