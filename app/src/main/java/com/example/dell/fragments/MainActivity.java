package com.example.dell.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.replace, new one()).commit();
    }

    public void call(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.b1:
                getSupportFragmentManager().beginTransaction().add(R.id.replace, new one()).commit();
                break;

            case R.id.b2:
                getSupportFragmentManager().beginTransaction().add(R.id.replace, new two()).commit();
                break;

            case R.id.b3:
                getSupportFragmentManager().beginTransaction().add(R.id.replace, new three()).commit();
                break;

            case R.id.b4:
                getSupportFragmentManager().beginTransaction().add(R.id.replace, new four()).commit();
                break;
        }
    }
}
