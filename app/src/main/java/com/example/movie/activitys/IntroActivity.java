package com.example.movie.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.movie.R;
import com.example.movie.databinding.ActivityIntroBinding;

public class IntroActivity extends AppCompatActivity {
    private ActivityIntroBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIntroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
    private void Even_haldle()
    {
        binding.button.setOnClickListener(v -> {

        });
    }

}