package com.mycorp.challengeone.one;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.mycorp.challengeone.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView text = findViewById(R.id.text_one);

        Intent intent = getIntent();

        text.setText(intent.getStringExtra("result"));

    }
}