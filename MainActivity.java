package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //declare GUI elements
    Spinner spinner_item;
    Button button_display;
    ListView stock_list;

    Stock stock_1 = new Stock(101,"Blue",4.99);
    Stock stock_2 = new Stock(102,"Red",4.99);


    ArrayList<Stock> stockList = new ArrayList<Stock>();

    stockList.add(stock_1);
    stockList.add(stock_2);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner_item = findViewById(R.id.spinner_item);
        button_display = findViewById(R.id.button_display);
        stock_list = findViewById(R.id.stock_list);


        spinner_item.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        button_display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check what item user picks
                String item = spinner_item.getSelectedItem().toString();

                //display toast message
                Toast.makeText(getApplicationContext(), item + " " + " displayed.",
                                Toast.LENGTH_SHORT).show();

            }
        });









    }//end of onCreate
}//end of class