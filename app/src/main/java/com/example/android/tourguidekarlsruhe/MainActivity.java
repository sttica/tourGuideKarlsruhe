package com.example.android.tourguidekarlsruhe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView attractions, events, places, restaurants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        attractions = (TextView) findViewById(R.id.attractions);
        events = (TextView) findViewById(R.id.events);
        places = (TextView) findViewById(R.id.places);
        restaurants = (TextView) findViewById(R.id.restaurants);
        attractions.setOnClickListener(this);
        events.setOnClickListener(this);
        places.setOnClickListener(this);
        restaurants.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch(id){
            case R.id.attractions:
                Intent attractionsIntent = new Intent(MainActivity.this, AttractionsActivity.class);
                startActivity(attractionsIntent);
                break;
            case R.id.events:
                Intent eventsIntent = new Intent(MainActivity.this, EventsActivity.class);
                startActivity(eventsIntent);
                break;
            case R.id.places:
                Intent placesIntent = new Intent(MainActivity.this, PlacesActivity.class);
                startActivity(placesIntent);
                break;
            case R.id.restaurants:
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
                break;
        }
    }
}
