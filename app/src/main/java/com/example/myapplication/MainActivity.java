package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText weight;
    private EditText height;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        height=(EditText) findViewById(R.id.height);
        weight=(EditText) findViewById(R.id.weight);
        result=(TextView) findViewById(R.id.result);

    }

    public void Calc(View V){
        String h=height.getText().toString();
        String w=weight.getText().toString();
        if(h!=null && !"".equals(h) && w!=null && !"".equals(w)){
            float hf=Float.parseFloat(h);
            float wf=Float.parseFloat(w);
            float bmi=(wf/(hf*hf))*10000;
            String lbl="";
            if(bmi<=18.55) {
                lbl=getString(R.string.under);
            }
            else if(bmi>18.55 && bmi<=24.99) {
                lbl=getString(R.string.normal);
            }
            else if(bmi>=25 && bmi<=29.99){
                lbl=getString(R.string.over);
            }
            else{
                lbl=getString(R.string.obesity);
            }
            result.setText(bmi+"\n\n"+lbl);
        }

    }
}