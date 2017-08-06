package com.example.android.tourguidekarlsruhe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Timo on 12.07.2017.
 */

public class AttractionsActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(R.drawable.bonifatiuskirche,getString(R.string.attractionsTitle1),getString(R.string.attractionsDescription1)));
        items.add(new Item(R.drawable.pyramide,getString(R.string.attractionsTitle2),getString(R.string.attractionsDescription2)));
        items.add(new Item(R.drawable.sankt_stephan,getString(R.string.attractionsTitle3),getString(R.string.attractionsDescription3)));

        ItemAdapter adapter = new ItemAdapter(this, items, R.color.category_attractions);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
