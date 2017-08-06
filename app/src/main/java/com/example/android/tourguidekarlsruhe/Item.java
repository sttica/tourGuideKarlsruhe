package com.example.android.tourguidekarlsruhe;

public class Item {

    /** image resource id */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value */
    private static final int NO_IMAGE_PROVIDED = -1;

    private String mTitle;
    private String mDescription;

    @Override
    public String toString() {
        return "Item{" +
                "mImageResourceId=" + mImageResourceId +
                ", mTitle='" + mTitle + '\'' +
                ", mDescription='" + mDescription + '\'' +
                '}';
    }

    /**
     * Create a new Item object.
     *
     * @param imageResourceId is the image resource id
     *
     * @param title is the title for the item
     *
     * @param description the description for the item
     */
    public Item(int imageResourceId, String title, String description) {
        mImageResourceId = imageResourceId;
        mTitle = title;
        mDescription = description;
    }

    /**
     * Get the picture of the item
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the description
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Get the title
     */
    public String getTitle() {
        return mTitle;
    }

}