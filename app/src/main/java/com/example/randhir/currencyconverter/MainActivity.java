package com.example.randhir.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){

        Log.i("Info", "Button Pressed");


        EditText editText = (EditText) findViewById(R.id.editText);

        String amountInDollars = editText.getText().toString();

        double amountInDollarsDouble = Double.parseDouble(amountInDollars);

        double amountInRuppeDouble = (amountInDollarsDouble/0.013);

        String amountInRupeeString = String.format("%.2f", amountInRuppeDouble);

        Log.i("Amount In Rupee", amountInRupeeString);

        Toast.makeText(this, "$" + amountInDollars + " is Rs" + amountInRupeeString, Toast.LENGTH_SHORT).show();






    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
