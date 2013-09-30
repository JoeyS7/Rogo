package com.rogoapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;

public class AuthTestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.auth_test);
        
        // creates view of custom title bar -> now included in main_screen.xml
        
        //getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.customtitlebar);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_screen, menu);
        return true;
    }
    
}
