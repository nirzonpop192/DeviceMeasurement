package com.td.faisal.bil.test.devicemeserment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;

/**
 * Created by USER on 8/13/2016.
 */
public class CalculationPadding {

    private static final String TAG = CalculationPadding.class.getSimpleName();
    int leftPaddSingleView;
    int rightPaddSingleView;

    private Context mContext;
    private Drawable mDrawable;

    public int getLeftPaddSingleView() {
        return leftPaddSingleView;
    }

    public void setLeftPaddSingleView(int leftPaddSingleView) {
        this.leftPaddSingleView = leftPaddSingleView;
    }

    public int getRightPaddSingleView() {
        return rightPaddSingleView;
    }

    public void setRightPaddSingleView(int rightPaddSingleView) {
        this.rightPaddSingleView = rightPaddSingleView;
    }


    public int calculateLeftPaddingSingle() {
        return calculateSidePaddingSingle();
    }

    public  int calculateRightPaddingSingle() {
        return calculateSidePaddingSingle();
    }

    public int calculateSidePaddingSingle() {
        new DeviceSize(mContext);
        int deviceWidth = (int) DeviceSize.getDpWidth();

        DrawableImageSize imageSize = new DrawableImageSize(mDrawable);
        int imageWidth = imageSize.getmWidth();

        int p = (int) (deviceWidth - imageWidth) / 2;
        Log.i(TAG, "padding :" + p);
        return p;
    }


    public void calculateSidePaddingDouble() {
        int width=calculateSidePaddingSingle();

    }
}
