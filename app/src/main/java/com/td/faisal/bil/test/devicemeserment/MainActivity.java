package com.td.faisal.bil.test.devicemeserment;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn_showInfromation= (Button) findViewById(R.id.btn_show);
        Button btn_Draw= (Button) findViewById(R.id.btn_drawable);

        btn_showInfromation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               new DeviceSize(MainActivity.this);

                Toast.makeText(getApplicationContext(),"dpWidth: "+String.valueOf(DeviceSize.getDpWidth())
                                +" dpHeight:"+String.valueOf(DeviceSize.getDpHeight())

                        ,Toast.LENGTH_SHORT ).show();
            }
        });


        btn_Draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable drawable = getResources().getDrawable(R.drawable.camera_icon);

                DrawableImageSize drawableImageSize= new DrawableImageSize(drawable);

                Toast.makeText(getApplicationContext(),"dpWidth: "+drawableImageSize.getmWidth()
                                +" dpHeight:"+drawableImageSize.getmHeight()

                        ,Toast.LENGTH_SHORT ).show();

            }
        });

    }
}
