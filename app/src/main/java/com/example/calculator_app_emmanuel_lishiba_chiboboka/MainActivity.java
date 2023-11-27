package com.example.calculator_app_emmanuel_lishiba_chiboboka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity{

    TextView viewCalculation, viewResult;
    String calculations = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        castTextViews();

    }

    public void castTextViews() {
        viewCalculation = (TextView)findViewById(R.id.text_view_Wid);
        viewResult = (TextView)findViewById(R.id.text_view_Rid);
    }

    public void Calculate(String setValue) {
        calculations = calculations + setValue;
        viewCalculation.setText(calculations);
    }

    public void equalsClick (View view) {
        double result;
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");

        try {
            result = (double)engine.eval(calculations);
            viewResult.setText(String.valueOf(result));
        } catch (ScriptException e) {
            Toast.makeText(this, "Invalid input, check workings", Toast.LENGTH_SHORT).show();
        }
    }

    public void acClick (View view) {
        viewCalculation.setText("");
        calculations = "";
        viewResult.setText("");
    }

    public void clearClick (View view) {
        calculations = calculations.substring(0, calculations.length() - 1);
        viewCalculation.setText(calculations);
    }

    public void divideClick (View view) {

        Calculate("/");
    }

    public void multiplyClick (View view) {
        Calculate("*");
    }

    public void plusClick (View view) {
        Calculate("+");
    }

    public void minusClick (View view) {
        Calculate("-");
    }

    public void zeroClick (View view) {
        Calculate("0");
    }

    public void oneClick (View view) {
        Calculate("1");
    }

    public void twoClick (View view) {
        Calculate("2");
    }

    public void threeClick (View view) {
        Calculate("3");
    }

    public void fourClick (View view) {
        Calculate("4");
    }

    public void fiveClick (View view) {
        Calculate("5");
    }

    public void sixClick (View view) {
        Calculate("6");
    }

    public void sevenClick (View view) {
        Calculate("7");
    }

    public void eightClick (View view) {
        Calculate("8");
    }

    public void nineClick (View view) {
        Calculate("9");
    }

}