package com.example.aipopilian.myapplication;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.aipopilian.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public String myText = "q";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setMyText(myText);
    }
}
