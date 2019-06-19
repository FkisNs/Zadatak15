package com.example.zadatak15.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.zadatak15.R;
import com.example.zadatak15.providers.JeloProvider;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(getBaseContext(),"MainActivity onCreate",Toast.LENGTH_SHORT);
        toast.show();

        final List<String> jeloNames = JeloProvider.getJeloNames();
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this,R.layout.list_item,jeloNames);
        ListView listView = (ListView) findViewById(R.id.listofJelos);
        listView.setAdapter(dataAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("position",position);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast toast = Toast.makeText(getBaseContext(),"MainActivity onStart",Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Toast toast = Toast.makeText(getBaseContext(),"MainActivity onRestart",Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast toast = Toast.makeText(getBaseContext(),"MainActivity onResume",Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast toast = Toast.makeText(getBaseContext(),"MainActivity onPause",Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast toast = Toast.makeText(getBaseContext(),"MainActivity onStop",Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast toast = Toast.makeText(getBaseContext(),"MainActivity onDestroy",Toast.LENGTH_SHORT);
        toast.show();
    }
}
