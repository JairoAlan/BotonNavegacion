package com.example.botonnavegacion;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.botonnavegacion.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    BottomNavigationView bottomNavigationView;
    fragment_home f_h = new fragment_home();
    fragment_profile f_p = new fragment_profile();
    fragment_settings f_s = new fragment_settings();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        bottomNavigationView = findViewById(R.id.menu);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, f_h).commit();

        binding.menu.setOnNavigationItemSelectedListener(item -> {

            if(item.getItemId() == R.id.home){

                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, f_h).commit();

            }

            if(item.getItemId() == R.id.profile){

                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, f_p).commit();

            }

            if(item.getItemId() == R.id.settings){

                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, f_s).commit();

            }

            return true;
        });
    }
}
