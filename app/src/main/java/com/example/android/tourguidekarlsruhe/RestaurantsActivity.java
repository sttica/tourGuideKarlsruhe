package com.example.android.tourguidekarlsruhe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Timo on 12.07.2017.
 */

public class RestaurantsActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(R.drawable.holzhacker,getString(com.example.android.tourguidekarlsruhe.R.string.restaurantsTitle1),getString(com.example.android.tourguidekarlsruhe.R.string.restaurantsDescription1)));
        items.add(new Item(R.drawable.papa_corleone,getString(com.example.android.tourguidekarlsruhe.R.string.restaurantsTitle2),getString(com.example.android.tourguidekarlsruhe.R.string.restaurantsDescription2)));
        items.add(new Item(R.drawable.vaca_verde,getString(com.example.android.tourguidekarlsruhe.R.string.restaurantsTitle3),getString(com.example.android.tourguidekarlsruhe.R.string.restaurantsDescription3)));

        ItemAdapter adapter = new ItemAdapter(this, items, R.color.category_restaurants);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
