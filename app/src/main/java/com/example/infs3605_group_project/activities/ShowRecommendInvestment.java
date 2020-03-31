package com.example.infs3605_group_project.activities;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.infs3605_group_project.R;

public class ShowRecommendInvestment extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend_1_1);

        TextView textView = (TextView) findViewById(R.id.textView_savings);
        SharedPreferences sharedPreferences = getSharedPreferences("incomes", MODE_PRIVATE);
        Long t_savings = sharedPreferences.getLong("total_savings", 0);
        textView.setText("Make the most of your savings: $" + t_savings + "\n");


    }
}
