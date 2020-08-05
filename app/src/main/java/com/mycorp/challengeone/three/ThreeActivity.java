package com.mycorp.challengeone.three;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mycorp.challengeone.R;

import java.util.regex.Pattern;

public class ThreeActivity extends AppCompatActivity {

    EditText email, pass;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        email = findViewById(R.id.email);
        pass = findViewById(R.id.password);
        submit = findViewById(R.id.btn_submit);

        final String password = pass.getText().toString();
        final String emails = email.getText().toString();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("ok");
                if (password.equals("")) {
                    System.out.println("kosong");
                }
            }
        });
    }

    public static boolean isValidateEmail(CharSequence email) {
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    public static boolean isValidatePassword(String pass) {
        return (!TextUtils.isEmpty(pass) && pass.matches("^[a-zA-Z0-9]$"));
    }
}