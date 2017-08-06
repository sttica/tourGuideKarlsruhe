package com.example.android.tourguidekarlsruhe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Timo on 12.07.2017.
 */

public class PlacesActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(R.drawable.guenter_klotz_anlage,getString(com.example.android.tourguidekarlsruhe.R.string.placesTitle1),getString(com.example.android.tourguidekarlsruhe.R.string.placesDescription1)));
        items.add(new Item(R.drawable.gutenbergplatz,getString(com.example.android.tourguidekarlsruhe.R.string.placesTitle2),getString(com.example.android.tourguidekarlsruhe.R.string.placesDescription2)));
        items.add(new Item(R.drawable.schloss,getString(com.example.android.tourguidekarlsruhe.R.string.placesTitle3),getString(com.example.android.tourguidekarlsruhe.R.string.placesDescription3)));

        ItemAdapter adapter = new ItemAdapter(this, items, R.color.category_places);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
