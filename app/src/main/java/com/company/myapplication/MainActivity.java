package com.company.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCLickChangeText(View view) {
        final TextView textViewTop = (TextView) findViewById(R.id.textViewTop);
        final TextView textView2 = (TextView) findViewById(R.id.textView2);
        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView2.setText("text Changed");
                textViewTop.setText("text Changed2");
            }
        });


    }

    public void onCLickChangeText2(View view) {
        final TextView textViewTop = (TextView) findViewById(R.id.textViewTop);
        final TextView textView2 = (TextView) findViewById(R.id.textView2);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView2.setText("text Changed again");
                textViewTop.setText("text Changed2 again");
            }
        });


    }


    public void onSwitchClick(View view ) {
        Switch aSwitch1 = (Switch) findViewById(R.id.switch1);
        final TextView textViewTop = (TextView) findViewById(R.id.textViewTop);
        final TextView textView2 = (TextView) findViewById(R.id.textView2);
        if(aSwitch1.isChecked()) {
            textView2.setText("text Changed again");
            textViewTop.setText("text Changed2 again");
        } else {
            textView2.setText("text Changed ");
            textViewTop.setText("text Changed2 ");
        }
    }


}
