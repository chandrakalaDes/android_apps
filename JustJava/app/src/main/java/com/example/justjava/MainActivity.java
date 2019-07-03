package com.example.justjava;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int quantity=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
    public void submitOrder(View view) {


int price=quantity*5;
        String orderSummary=createOrderSummary(price);
        displayMessage(orderSummary);

    }
    public void increase(View view) {

        quantity=quantity+1;
        display(quantity);
    }
    public void decrement(View view) {

        quantity=quantity-1;
        display(quantity);
    }
    private String createOrderSummary(int price)
    {
        String orderSummary="Name: Kaptain Kunal"
                +"\nQuantity:"+quantity
                +"\nTotal : $"+price+
                "\nThank you";
        return(orderSummary);



    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }


    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}