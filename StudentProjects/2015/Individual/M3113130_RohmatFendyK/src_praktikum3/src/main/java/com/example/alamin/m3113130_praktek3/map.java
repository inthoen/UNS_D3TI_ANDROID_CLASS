package com.example.alamin.m3113130_praktek3;

import android.content.Intent;
import android .net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URI;

public class map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        final EditText editText1 = (EditText) findViewById(R.id.editText1);
        Button tombol_peta = (Button) findViewById(R.id.tombol_peta);
        tombol_peta.setOnClickListener(new View.OnClickListener(){
            @Override
        public  void onClick(View v){ 
                String lokasi = editText1.getText().toString();
                String geoURI = "geo:0,0?q= "+lokasi;
                Uri geo = Uri.parse(geoURI);
                Intent mapIntent =  new Intent (Intent.ACTION_VIEW,Uri.parse(geoURI));
                if(mapIntent.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(mapIntent);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_map, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
