package com.example.gcq1w_000.gcbasicviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Widgets from parent layout
        final RelativeLayout rel = (RelativeLayout) findViewById(R.id.relative);
        ToggleButton toggle = (ToggleButton) findViewById(R.id.toggleButton);

        // Toggle Change Listener
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                RadioButton r1 = (RadioButton) findViewById(R.id.radio1);
                RadioButton r2 = (RadioButton) findViewById(R.id.radio2);
                CheckBox chk = (CheckBox) findViewById(R.id.saveChk);

                if (isChecked) {
                    // Toggle on: checkbox, radio1 checked; radio2 unchecked
                    chk.setChecked(true);
                    r1.setChecked(true);
                    r2.setChecked(false);
                    Toast.makeText(getApplicationContext(), "Toggle button is On", Toast.LENGTH_SHORT).show();

                } else {
                    // Toggle off: checkbox, radio1 unchecked; radio2 checked
                    chk.setChecked(false);
                    r1.setChecked(false);
                    r2.setChecked(true);
                    Toast.makeText(getApplicationContext(), "Toggle button is Off", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void onCheckedChanged (View view){

    }
}

