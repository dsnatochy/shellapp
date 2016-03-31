package com.domain.shellapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.widget.RelativeLayout;
import android.widget.TextView;

import shellapp.R;


public class MainActivity extends AppCompatActivity {

    private Typeface robotoLight = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        robotoLight = Typeface.createFromAsset(getAssets(),"RobotoTTF/Roboto-Light.ttf");

        //TextView comingSoon = (TextView) findViewById(R.id.comingSoon);
        //comingSoon.setTypeface(robotoLight);

        RelativeLayout outerLayout = (RelativeLayout) findViewById(R.id.outerLayout);
        outerLayout.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Intent i = new Intent();
                                               i.setAction(Intent.ACTION_MAIN);
                                               i.addCategory(Intent.CATEGORY_HOME);
                                               MainActivity.this.startActivity(i);
                                               finish();
                                           }
                                       }
        );

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }


}
