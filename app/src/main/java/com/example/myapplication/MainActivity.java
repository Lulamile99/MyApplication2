package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View view){
        TextView txtHello = findViewById(R.id.textView);
        EditText edtTxtName = findViewById(R.id.editTextTextPersonName);
        EditText edtEmail = findViewById(R.id.editEmailAddress);
        EditText edtPhone = findViewById(R.id.editPhone);
        EditText edtPassword = findViewById(R.id.editPassword);
        txtHello.setText("Name:  "+edtTxtName.getText().toString()+"\n"+"Email: "+edtEmail.getText().toString()+"\n"+"Phone: "+edtPhone.getText().toString());
    }
}