package com.gmail.lay123.edward.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView menuItem1 = (TextView) findViewById(R.id.menu_item_1);
        // Log.i("MainActivity.java", (String) menuItem1.getText()); <-- Also worked :)
        String menuItem1Text = menuItem1.getText().toString();
        Log.i("MainActivity.java", menuItem1Text);

        // Find second menu item TextView and print the text to the logs
        TextView menuItem2 = (TextView) findViewById(R.id.menu_item_2);
        String menuItem2Text = menuItem2.getText().toString();
        Log.i("MainActivity.java", menuItem2Text);

        // Find third menu item TextView and print the text to the logs
        TextView menuItem3 = (TextView) findViewById(R.id.menu_item_3);
        String menuItem3Text = menuItem3.getText().toString();
        Log.i("MainActivity.java", menuItem3Text);

    }
}