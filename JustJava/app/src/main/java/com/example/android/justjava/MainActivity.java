package com.example.android.justjava;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;  // give us access to currency formatting

/**
 * This app displays an order form to order coffee.
 */
@SuppressWarnings("deprecation")  // don't tell me about ActionBarActivity, I know already
public class MainActivity extends ActionBarActivity {

    // instance variables for all methods to consume
    int quantity = 1;
    int price = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        display(quantity);
        displayPrice(price * quantity);
    }

    public void increment(View view) {
        TextView quantityTextView = (TextView) findViewById(R.id.value_text_view);
        quantity = quantity + 1;
        quantityTextView.setText("" + quantity);
    }

    public void decrement(View view) {
        TextView quantityTextView = (TextView) findViewById(R.id.value_text_view);
        quantity = quantity - 1;
        if (quantity >= 0) {
            quantityTextView.setText("" + quantity);
        }
        else {
            quantity = 0;
            quantityTextView.setText("" + quantity);
        }
    }

    /**
     * This method displays the current quantity value on the screen, plus the given increase.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.value_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}