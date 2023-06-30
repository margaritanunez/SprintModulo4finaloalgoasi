package com.example.sprintmodulo4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sprintmodulo4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.infoDeContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            Intent nextPage = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(nextPage);
            }

        });

    }
}