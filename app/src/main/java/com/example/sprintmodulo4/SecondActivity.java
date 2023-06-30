package com.example.sprintmodulo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.sprintmodulo4.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initListeners();

    }

    private void initListeners() {
        binding.linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linkedinIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/gencina2/"));
                startActivity(linkedinIntent);
            }
        });

        binding.whatssap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent whatsappIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.whatsapp.com"));
                startActivity(whatsappIntent);

            }
        });
        binding.correo.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent correoIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gmail.com/"));
                startActivity(correoIntent);
            }
        });
    }
}


