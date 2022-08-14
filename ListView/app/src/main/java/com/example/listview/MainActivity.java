package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView fruitlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fruitlist =findViewById(R.id.ListView);

        // TODO 1: Get the data ready
        String[] fnames = new String[]{"Apple","Banana","Grapes","Pineapple","Strawberry","Mango","Guava","Kiwi","Papaya","Orange"};
        // TODO 2: Set up the Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,fnames);
        // TODO 3: set up the adapter on the ListView
        fruitlist.setAdapter(adapter);
        // TODO 4: when an item tapped, get the item name
        fruitlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String itm = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(MainActivity.this,itm,Toast.LENGTH_SHORT).show();
            }
        });

    }

}