package com.example.android.tourguidekarlsruhe;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Timo on 23.05.2017.
 */

public class ItemAdapter extends ArrayAdapter<Item>{

    private int mColorResourceId;

    public ItemAdapter(Activity context, ArrayList<Item> items, int ColorResourceId) {
        super(context, 0, items);
        mColorResourceId = ColorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item, parent, false);
        }

        Item currentItem = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        titleTextView.setText(currentItem.getTitle());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(currentItem.getDescription());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        // Get the image resource ID from the current item object and
        // set the image to imageView
        imageView.setImageResource(currentItem.getImageResourceId());
        // Make sure the view is visible
        imageView.setVisibility(View.VISIBLE);

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        // Return the whole item item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
