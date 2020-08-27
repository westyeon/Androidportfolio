package com.example.portfolio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

public class SearchActivity extends AppCompatActivity {
    private Spinner searchtype;
    private EditText value;
    private Button btnsearch;
    private ListView listview;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        searchtype = (Spinner)findViewById(R.id.searchtype);

        ArrayAdapter<CharSequence>adapter = ArrayAdapter.createFromResource(this,R.array.searchtype_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        searchtype.setAdapter(adapter);



        value = (EditText)findViewById(R.id.value);
        btnsearch = (Button)findViewById(R.id.btnsearch);
        listview = (ListView)findViewById(R.id.listview);



    }
}