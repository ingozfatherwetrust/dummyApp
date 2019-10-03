package com.example.dummyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button loginButton = findViewById(R.id.loginButton);
        final EditText userName = findViewById(R.id.usernameTextInput);
        final EditText password = findViewById(R.id.passwordTextInput);
        final TextView signUp = findViewById(R.id.signUpSwitch);
        userName.setHint("User Name");
        password.setHint("Password");
        signUp.setText("Sign Up");
        loginButton.setText("Login");
        loginButton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext())
                        .setTitle(userName.getText())
                        .setMessage(password.getText())
                        .show();
            }

        });
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext())
                        .setTitle(userName.getText() + " signUp")
                        .setMessage(password.getText() + " signUp")
                        .show();
            }
        });
    }
}
