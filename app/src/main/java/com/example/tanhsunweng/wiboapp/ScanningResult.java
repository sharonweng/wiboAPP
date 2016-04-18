package com.example.tanhsunweng.wiboapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.graphics.*;
import android.view.View;
import android.widget.*;
import android.widget.ImageView;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class ScanningResult extends Activity implements View.OnClickListener {

    ImageButton hat, scarf, coat;
    ImageView iw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanning_result);

        Bitmap bitmap = (Bitmap) getIntent().getParcelableExtra("BitmapImage");
        ImageView img = (ImageView)findViewById(R.id.imageView1);
        img.setImageBitmap(bitmap);

        hat = (ImageButton) findViewById(R.id.hat_imageView);
        scarf = (ImageButton) findViewById(R.id.scarf_imageView);
        coat = (ImageButton) findViewById(R.id.coat_imageView);


        hat.setOnClickListener(this);
        scarf.setOnClickListener(this);
        coat.setOnClickListener(this);

        iw = (ImageView) findViewById(R.id.nonecloth);



    }

    @Override
    public void onClick(View v) {

        if (v == hat) {
            String backgroundImageName = String.valueOf(iw.getTag());
            if (iw.getTag().equals("")) {
                iw.setImageResource(R.drawable.hat);
                iw.setTag("tag_hat");
            } else if (iw.getTag().equals("tag_scarf")) {
                iw.setImageResource(R.drawable.hat_scarf);
                iw.setTag("tag_hat_scarf");
            } else if (iw.getTag().equals("tag_coat")) {
                iw.setImageResource(R.drawable.hat_coat);
                iw.setTag("tag_hat_coat");
            } else if (iw.getTag().equals("tag_scarf_coat")) {
                iw.setImageResource(R.drawable.hat_scarf_coat_final);
                iw.setTag("tag_hat_scarf_coat");
            }


        }

        if (v == scarf) {
            String backgroundImageName = String.valueOf(iw.getTag());
            if (iw.getTag().equals("")) {
                iw.setImageResource(R.drawable.scarf);
                iw.setTag("tag_scarf");
            } else if (iw.getTag().equals("tag_hat")) {
                iw.setImageResource(R.drawable.scarf_hat);
                iw.setTag("tag_hat_scarf");
            } else if (iw.getTag().equals("tag_coat")) {
                iw.setImageResource(R.drawable.coat_scarf);
                iw.setTag("tag_scarf_coat");
            } else if (iw.getTag().equals("tag_hat_coat")) {
                iw.setImageResource(R.drawable.hat_scarf_coat_final);
                iw.setTag("tag_hat_scarf_coat");
            }

        }

        if (v == coat) {
            String backgroundImageName = String.valueOf(iw.getTag());
            if (iw.getTag().equals("")) {
                iw.setImageResource(R.drawable.coat);
                iw.setTag("tag_coat");
            } else if (iw.getTag().equals("tag_hat")) {
                iw.setImageResource(R.drawable.coat_hat);
                iw.setTag("tag_hat_coat");
            } else if (iw.getTag().equals("tag_hat_scarf")) {
                iw.setImageResource(R.drawable.hat_scarf_coat_final);
                iw.setTag("tag_hat_scarf_coat");
            } else if (iw.getTag().equals("tag_scarf")) {
                iw.setImageResource(R.drawable.coat_scarf);
                iw.setTag("tag_scarf_coat");
            }
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scanning_result, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
