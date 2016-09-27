package com.td.faisal.bil.test.devicemeserment;

import android.graphics.drawable.Drawable;
import android.util.Log;

/**
 * Created by USER on 8/13/2016.
 */
public class DrawableImageSize {


    private int mHeight;
    private int mWidth;

    private Drawable mDrawable;


    private static final String TAG = DrawableImageSize.class.getSimpleName();

    public DrawableImageSize(Drawable mDrawable) {
        this.mDrawable = mDrawable;

        getDrawableSize();
    }

    private void getDrawableSize() {
        int height = mDrawable.getIntrinsicHeight();
        setmHeight(height);
        int width = mDrawable.getIntrinsicWidth();

        setmWidth(width);
        Log.d(TAG, "mHeight:" + height + " dp mWidth :" + width + " dp");
    }

    public int getmHeight() {
        return mHeight;
    }

    private void setmHeight(int mHeight) {
        this.mHeight = mHeight;
    }

    public int getmWidth() {
        return mWidth;
    }

    private void setmWidth(int mWidth) {
        this.mWidth = mWidth;
    }
}
