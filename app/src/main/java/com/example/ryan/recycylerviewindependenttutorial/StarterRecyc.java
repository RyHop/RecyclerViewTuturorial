package com.example.ryan.recycylerviewindependenttutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class StarterRecyc extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RVAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    //Creating a list of person
    private List<Person> persons;

    // This method creates an ArrayList that has three Person objects
// Checkout the project associated with this tutorial on Github if
// you want to use the same images.
    private void initializeData(){
        persons = new ArrayList<>();
        persons.add(new Person("Emma Wilson", "23 years old", R.drawable.ic_launcher_background));
        persons.add(new Person("Lavery Maiss", "25 years old", R.drawable.ic_launcher_background));
        persons.add(new Person("Walter White", "35 years old", R.drawable.ic_launcher_background));
        persons.add(new Person("Lillie Watts", "35 years old", R.drawable.ic_launcher_background));
        persons.add(new Person("Ryan Hopson", "35 years old", R.drawable.ic_launcher_background));
        persons.add(new Person("Che", "35 years old", R.drawable.ic_launcher_background));
        persons.add(new Person("Alex", "35 years old", R.drawable.ic_launcher_background));
        persons.add(new Person("Levi", "35 years old", R.drawable.ic_launcher_background));
        persons.add(new Person("Boi", "35 years old", R.drawable.ic_launcher_background));


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter_recyc);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // Making the example data we are using
        initializeData();

        // specify an adapter (see also next example)
        mAdapter = new RVAdapter(persons);
        mRecyclerView.setAdapter(mAdapter);
    }



}
