package com.example.myfirstapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect score with ressult variable to get the values

        score = findViewById(R.id.result);
    }

    public void inCrementScore(View view) {
        count++;
        score.setText(String.valueOf(count));
    }

    public void decrementScore(View view) {
        count--;
        score.setText(String.valueOf(count));
    }

    // To Attach(inflate) a menu file to an activity - We need to override

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.first_item:
                count = 0;
                score.setText(String.valueOf(count));
                break;
            case R.id.second_item:
                Toast.makeText(this, "Second id Clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.third_item:
                Toast.makeText(this, "Third id Clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.fourth_item:
                Toast.makeText(this, "fouth id Clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.fifth_item:
                Toast.makeText(this, "fifth id Clicked", Toast.LENGTH_LONG).show();
                break;
            default:
                Toast.makeText(this, "Submenu id Clicked", Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}