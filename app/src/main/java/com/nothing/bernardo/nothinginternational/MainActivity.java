package com.nothing.bernardo.nothinginternational;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.util.Log;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "MainActivity";
    private Date currentTime;
    private String formattedDateOnStart;
    private long startTime;
    private String fim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initiate main textview

        // initiate view's (imagebutton)
        ImageButton imgButtonBr = findViewById(R.id.imageButton3);
        ImageButton imgButtonIt = findViewById(R.id.imageButton4);
        ImageButton imgButtonEs = findViewById(R.id.imageButton5);
        ImageButton imgButtonUs = findViewById(R.id.imageButton6);

        // perform click event on button's
        imgButtonBr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView mainNothing = findViewById(R.id.changeNothing);
                mainNothing.setText(R.string.nada);
            }
        });
        imgButtonIt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView mainNothing = findViewById(R.id.changeNothing);
                mainNothing.setText(R.string.nada);
            }
        });
        imgButtonEs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView mainNothing = findViewById(R.id.changeNothing);
                mainNothing.setText(R.string.nada);
            }
        });
        imgButtonUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView mainNothing = findViewById(R.id.changeNothing);
                mainNothing.setText(R.string.nada);
            }
        });
    }
    /* (non-Javadoc)
    * @see android.app.Activity#onStart()
    * current time is a global variable.
    * formattedDateOnStart is a global variable to tell the ate on start status.
    */
    @Override
    protected void onStart() {
        super.onStart();
        currentTime = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy-HH:mm:ss");
        formattedDateOnStart = df.format(currentTime);
        Log.i(TAG, formattedDateOnStart);
        setContentView(R.layout.activity_main);
        TextView datez = findViewById(R.id.date);
        TextView dates = findViewById(R.id.date2);
        startTime = System.currentTimeMillis();
        datez.setText(formattedDateOnStart);
        dates.setText(fim);
    }
    /* (non-Javadoc)
    * @see android.app.Activity#onPause()
    * dates is a textview object to set date2 text
    */
    @Override
    protected void onPause() {
        super.onPause();
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
        String formattedDate = df.format(currentTime);
        Log.i(TAG, formattedDate);
        long endTime = System.currentTimeMillis();
        long seconds = (endTime - startTime) / 1000;
        setContentView(R.layout.activity_main);
        TextView dates = findViewById(R.id.date2);
        fim = "Voltou! Uma breve pausa de: " + seconds;
        dates.setText(fim);
    }
}
