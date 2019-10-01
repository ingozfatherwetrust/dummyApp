package com.example.dummyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button loginButton = findViewById(R.id.loginButton);
        final EditText userName = findViewById(R.id.usernameTextInput);
        final EditText password = findViewById(R.id.passwordTextInput);
        loginButton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext())
                        .setTitle(userName.getText())
                        .setMessage(password.getText())
                        .show();
            }

        });
    }
}
