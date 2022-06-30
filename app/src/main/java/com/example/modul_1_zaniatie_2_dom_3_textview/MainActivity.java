package com.example.modul_1_zaniatie_2_dom_3_textview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int ticketPrice = 10;
        int years = 99;
        int payment = 8;
        int addedPayment = 5;
        int pensionerId = 0; // 1 - YES, 0 - NO
        int needPayment;
        int refund;

        TextView tvEnter = findViewById(R.id.tvEnter);
        tvEnter.setText("Hello, passenger! Please, provide your age.");
        tvEnter.setTextSize(32);
        tvEnter.setTextColor(Color.BLACK);
        tvEnter.setBackgroundColor(Color.WHITE);
        tvEnter.setPadding(200,300,200,100);


        if (years < 18){
            //
            tvEnter.setBackgroundColor(Color.CYAN);
            tvEnter.setText("You are child. Ticket is free for you. Please, take your place. 1");
            Log.d("MYLOG", "You are child. Ticket is free for you. Please, take your place. 1");
        } else if ((years >= 18) && (years <= 60)){
            //
            tvEnter.setText("You are adult. You need a ticket. Please, make a payment.");
            Log.d("MYLOG", "You are adult. You need a ticket. Please, make a payment.");
            if (payment == ticketPrice){
                //
                tvEnter.setBackgroundColor(Color.CYAN);
                tvEnter.setText("Thank you. Please, take your place. 2");
                Log.d("MYLOG", "Thank you. Please, take your place. 2");
            } else if (payment < ticketPrice){
                //
                tvEnter.setBackgroundColor(Color.RED);
                tvEnter.setText("Ticket price is 10, please add money.");
                Log.d("MYLOG", "Ticket price is 10, please add money.");
                needPayment = ticketPrice - payment;
                //
                tvEnter.setBackgroundColor(Color.RED);
                tvEnter.setText("You need to add " + needPayment + " UAH.");
                Log.d("MYLOG", "You need to add " + needPayment + " UAH.");

                payment = payment + addedPayment;
                if (payment == ticketPrice){
                    //
                    tvEnter.setBackgroundColor(Color.CYAN);
                    tvEnter.setText("Thank you. Please, take your place. 3");
                    Log.d("MYLOG", "Thank you. Please, take your place. 3");
                } else if (payment > ticketPrice){
                    refund = payment - ticketPrice;
                    //
                    tvEnter.setBackgroundColor(Color.CYAN);
                    tvEnter.setText("Thank you. " + refund + " UAH will be refunded back to you. Please, take your place. 4");
                    Log.d("MYLOG", "Thank you. " + refund + " UAH will be refunded back to you. Please, take your place. 4");
                } else if (payment < ticketPrice){
                    //
                    tvEnter.setBackgroundColor(Color.RED);
                    tvEnter.setText("Excuse me. This bus is not for you. Goodbye. 1");
                    Log.d("MYLOG", "Excuse me. This bus is not for you. Goodbye. 1");
                }
            }
        } else {
            //
            tvEnter.setText("You are pensioner. Do you have pensioner's ID?");
            Log.d("MYLOG", "You are pensioner. Do you have pensioner's ID?");
            if (pensionerId == 1){
                //
                tvEnter.setBackgroundColor(Color.CYAN);
                tvEnter.setText("Thank you. Please, take your place. 5");
                Log.d("MYLOG", "Thank you. Please, take your place. 5");
            } else {
                //
                tvEnter.setText("You need a ticket. Please, make a payment.");
                Log.d("MYLOG", "You need a ticket. Please, make a payment.");
                if (payment == ticketPrice){
                    //
                    tvEnter.setBackgroundColor(Color.CYAN);
                    tvEnter.setText("Thank you. Please, take your place. 6");
                    Log.d("MYLOG", "Thank you. Please, take your place. 6");
                } else if (payment < ticketPrice){
                    //
                    tvEnter.setBackgroundColor(Color.RED);
                    tvEnter.setText("Ticket price is 10, please add money.");
                    Log.d("MYLOG", "Ticket price is 10, please add money.");
                    needPayment = ticketPrice - payment;
                    //
                    tvEnter.setBackgroundColor(Color.RED);
                    tvEnter.setText("You need to add " + needPayment + " UAH.");
                    Log.d("MYLOG", "You need to add " + needPayment + " UAH.");

                    payment = payment + addedPayment;
                    if (payment == ticketPrice){
                        //
                        tvEnter.setBackgroundColor(Color.CYAN);
                        tvEnter.setText("Thank you. Please, take your place. 7");
                        Log.d("MYLOG", "Thank you. Please, take your place. 7");
                    } else if (payment < ticketPrice){
                        //
                        tvEnter.setBackgroundColor(Color.RED);
                        tvEnter.setText("Excuse me. This bus is not for you. Goodbye. 2");
                        Log.d("MYLOG", "Excuse me. This bus is not for you. Goodbye. 2");
                    } else if (payment > ticketPrice){
                        refund = payment - ticketPrice;
                        //
                        tvEnter.setBackgroundColor(Color.CYAN);
                        tvEnter.setText("Thank you. " + refund + " UAH will be refunded back to you. Please, take your place. 8");
                        Log.d("MYLOG", "Thank you. " + refund + " UAH will be refunded back to you. Please, take your place. 8");
                    }
                }
            }
        }



    }
}