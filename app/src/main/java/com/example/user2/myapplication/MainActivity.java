package com.example.user2.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity
{
    TextView quantityTextView;
    TextView priceTextView;
    TextView dolar;
    TextView quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        priceTextView = (TextView) findViewById(R.id.price_text_view);
        dolar = (TextView) findViewById(R.id.dollar);

    }

    protected void increment(View view)
    {
        display(5);

    }
    protected void decrement(View view)
    {
        display(1);

    }

    protected void submitOrder(View view)
    {
        display(2);
        displayPrice( 2 * 15);
    }

    public void display(int number)
    {

        quantityTextView.setText("" + number);

    }

    public void displayPrice(int number)
    {

         dolar.setText(NumberFormat.getCurrencyInstance().format(number));
    }

}
