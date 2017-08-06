package com.example.android.tourguidekarlsruhe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Timo on 12.07.2017.
 */

public class EventsActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(R.drawable.badisches_staatstheater,getString(com.example.android.tourguidekarlsruhe.R.string.eventsTitle1),getString(com.example.android.tourguidekarlsruhe.R.string.eventsDescription1)));
        items.add(new Item(R.drawable.das_fest,getString(com.example.android.tourguidekarlsruhe.R.string.eventsTitle2),getString(com.example.android.tourguidekarlsruhe.R.string.eventsDescription2)));
        items.add(new Item(R.drawable.schlosslichtspiele,getString(com.example.android.tourguidekarlsruhe.R.string.eventsTitle3),getString(com.example.android.tourguidekarlsruhe.R.string.eventsDescription3)));

        ItemAdapter adapter = new ItemAdapter(this, items, R.color.category_events);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}