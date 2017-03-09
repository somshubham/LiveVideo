package com.som.android.livevideo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fr.maxcom.libmedia.Licensing;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// Libmedia requirement
        Licensing.allow(getApplicationContext());
// optional
        Licensing.setDeveloperMode(true);

        Button button = (Button) findViewById(R.id.MyButton);

        // Capture button clicks
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        VideoActivity2.class);
                startActivity(myIntent);


                //startActivity(new Intent(this, VideoActivity2.class));
            }
        });
    }
}
