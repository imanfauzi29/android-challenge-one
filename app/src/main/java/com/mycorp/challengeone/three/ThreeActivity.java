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

import com.mycorp.challengeone.MainActivity;
import com.mycorp.challengeone.R;

import java.util.regex.Pattern;

public class ThreeActivity extends AppCompatActivity {

    EditText email, pass;
    Button submit;
    String emails, passwords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        email = findViewById(R.id.email);
        pass = findViewById(R.id.password);
        submit = findViewById(R.id.btn_submit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emails = email.getText().toString();
                passwords = pass.getText().toString();

                if (passwords.equalsIgnoreCase("") || emails.equalsIgnoreCase("")) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong!", Toast.LENGTH_LONG).show();
                } else if(passwords.length() < 8) {
                    Toast.makeText(getApplicationContext(), "Password  kurang dari 8", Toast.LENGTH_LONG).show();
                }else if (!isValidateEmail(emails)) {
                    Toast.makeText(getApplicationContext(), "Email tidak valid", Toast.LENGTH_LONG).show();
                }else if (!isValidatePassword(passwords)) {
                    Toast.makeText(getApplicationContext(), "Password bukan alphanumeric", Toast.LENGTH_LONG).show();
                }else {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
    public static boolean isValidateEmail(String email) {
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    public static boolean isValidatePassword(String pass) {
        return (pass.matches("^[a-zA-Z0-9]+$"));
    }
}