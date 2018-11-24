package com.company.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

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


    public void onSwitchClick(View view) {
        Switch aSwitch1 = (Switch) findViewById(R.id.switch1);
        final TextView textViewTop = (TextView) findViewById(R.id.textViewTop);
        final TextView textView2 = (TextView) findViewById(R.id.textView2);
        if (aSwitch1.isChecked()) {
            textView2.setText("text Changed again");
            textViewTop.setText("text Changed2 again");
        } else {
            textView2.setText("text Changed ");
            textViewTop.setText("text Changed2 ");
        }
    }

    public void radioOnClick(View view) {
        final TextView textViewTop = (TextView) findViewById(R.id.textViewTop);
        final TextView textView2 = (TextView) findViewById(R.id.textView2);
        RadioButton radio1 = (RadioButton) findViewById(R.id.radio1);
        RadioButton radio2 = (RadioButton) findViewById(R.id.radio2);
        RadioButton radio3 = (RadioButton) findViewById(R.id.radio3);

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio1:
                if (checked)
                    textView2.setText("Radio button clicked 1");
                textViewTop.setText("Radio button clicked 1");
                break;
            case R.id.radio2:
                if (checked)
                    textView2.setText("Radio button clicked 2");
                textViewTop.setText("Radio button clicked 2");
                break;
            case R.id.radio3:
                if (checked)
                    textView2.setText("Radio button clicked 3");
                textViewTop.setText("Radio button clicked 3");
                break;
        }
    }

    public void selected(View view) {
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        TextView boxQty = (TextView) findViewById(R.id.checkBoxSelected);
        boolean box1 = checkBox1.isChecked();
        boolean box2 = checkBox2.isChecked();
        boolean box3 = checkBox3.isChecked();


//        if (box1 || box2 || box3) {
//            boxQty.setText("1");
//        } else if (box1 && box2) {
//            boxQty.setText("2");
//        } else if ((box1 && box2 && box3)) {
//            boxQty.setText("3");
//        } else
//            boxQty.setText("0");
//    }

        if (box1 && box2 && box3) {
            boxQty.setText("3");
        } else if ((box1 && box2) || (box1 && box3) || (box2 && box3)) {
            boxQty.setText("2");
        } else if (box1 || box2 || box3) {
            boxQty.setText("1");
        } else
            boxQty.setText("0");

    }


}