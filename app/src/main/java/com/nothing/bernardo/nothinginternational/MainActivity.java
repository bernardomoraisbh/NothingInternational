package com.nothing.bernardo.nothinginternational;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initiate main textview

        // initiate view's (imagebutton)
        ImageButton imgButtonBr = (ImageButton)findViewById(R.id.imageButton3);
        ImageButton imgButtonIt = (ImageButton)findViewById(R.id.imageButton4);
        ImageButton imgButtonEs = (ImageButton)findViewById(R.id.imageButton5);
        ImageButton imgButtonUs = (ImageButton)findViewById(R.id.imageButton6);

        // perform click event on button's
        imgButtonBr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView mainNothing = (TextView)findViewById(R.id.changeNothing);
                mainNothing.setText(R.string.nada);
            }
        });
        imgButtonIt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView mainNothing = (TextView)findViewById(R.id.changeNothing);
                mainNothing.setText(R.string.nada);
            }
        });
        imgButtonEs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView mainNothing = (TextView)findViewById(R.id.changeNothing);
                mainNothing.setText(R.string.nada);
            }
        });
        imgButtonUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView mainNothing = (TextView)findViewById(R.id.changeNothing);
                mainNothing.setText(R.string.nada);
            }
        });
    }

}
