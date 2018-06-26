package com.example.divyanshukumar.collegelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Spinner listOf = (Spinner) findViewById(R.id.listOf);
        listOf.setPrompt("Select");


        ArrayList<String> words = new ArrayList<String>();
        words.add("Healthy Foods");
        words.add("Unhealthy Foods");
        words.add("Developer's favorite");
        words.add("all Foods");

        final ArrayList<String> colleges = new ArrayList<String>();
        /*colleges.add("bpit");
        colleges.add("dtu");
        colleges.add("msit");
        colleges.add("iit");
        colleges.add("mit");
        colleges.add("northern");
        colleges.add("mait");
        colleges.add("northern");
        colleges.add("cid"); */

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, words);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        listOf.setAdapter(adapter);

        Button Go = (Button) findViewById(R.id.Go);

        Go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // TextView showSelectedItem = (TextView) findViewById(R.id.showSelectedItem);
               // showSelectedItem.setText(listOf.getSelectedItem());

                ArrayAdapter<String> itemsAdapter =
                        new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, colleges);

                ListView list = (ListView) findViewById(R.id.list);

                 if(listOf.getSelectedItemPosition() == 0)
                //showSelectedItem.setText(colleges.get(3));
                 {
                     itemsAdapter.clear();


                     itemsAdapter.add("Oats");
                     itemsAdapter.add("Eggs");
                     itemsAdapter.add("Milk");
                     itemsAdapter.add("Brown Bread");


                   /*  itemsAdapter.remove("iit");
                     itemsAdapter.remove("mit");
                     itemsAdapter.remove("northern");
                     itemsAdapter.remove("mait");
                     itemsAdapter.remove("northern"); */


                     list.setAdapter(itemsAdapter);
                 }

                else if(listOf.getSelectedItemPosition() == 1) {

                    itemsAdapter.clear();


                    itemsAdapter.add("Burger");
                    itemsAdapter.add("Pizza");
                    itemsAdapter.add("WhiteBread");
                    itemsAdapter.add("Fries");
                    itemsAdapter.add("Pastries");

                    list.setAdapter(itemsAdapter);
                }
                else if(listOf.getSelectedItemPosition() == 2) {

                    itemsAdapter.clear();


                    itemsAdapter.add("Oats");
                     itemsAdapter.add("Pastries");


                     list.setAdapter(itemsAdapter);

                }

                else
                {

                    itemsAdapter.clear();

                    itemsAdapter.add("Oats");
                    itemsAdapter.add("Eggs");
                    itemsAdapter.add("Burger");
                    itemsAdapter.add("Pizza");
                    itemsAdapter.add("WhiteBread");
                    itemsAdapter.add("Fries");
                    itemsAdapter.add("Pastries");
                    itemsAdapter.add("Milk");
                    itemsAdapter.add("Brown Bread");

                    list.setAdapter(itemsAdapter);


                }


            }
        });


    }
}
