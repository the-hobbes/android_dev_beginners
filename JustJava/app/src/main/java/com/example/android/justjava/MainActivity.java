package com.example.android.justjava;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
@SuppressWarnings("deprecation")  // don't tell me about ActionBarActivity, I know already
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        display(1);
    }

    /**
     * This method displays the current quantity value on the screen, plus the given increase.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.value_text_view);
        int  currentValue = Integer.parseInt(quantityTextView.getText().toString());
        currentValue= currentValue + number;
        quantityTextView.setText("" + currentValue);
    }
}