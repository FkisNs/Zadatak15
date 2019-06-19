package com.example.zadatak15.activities;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.zadatak15.R;
import com.example.zadatak15.models.Category;
import com.example.zadatak15.models.Sastojci;
import com.example.zadatak15.providers.CategoryProvider;
import com.example.zadatak15.providers.JeloProvider;
import com.example.zadatak15.providers.SastojciProvider;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    private int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (savedInstanceState != null){
            this.position = savedInstanceState.getInt("position");
        }
        position = getIntent().getIntExtra("position",0);

        ImageView ivImage = (ImageView) findViewById(R.id.image_viewer);
        InputStream is = null;
        try {
            is = getAssets().open(JeloProvider.getJeloById(position).getImage());
            Drawable drawable = Drawable.createFromStream(is,null);
            ivImage.setImageDrawable(drawable);
        }catch (IOException e){
            e.printStackTrace();
        }
        TextView tvNaziv = (TextView) findViewById(R.id.tv_naziv);
        tvNaziv.setText(JeloProvider.getJeloById(position).getNaziv());
        TextView tvOpis = (TextView) findViewById(R.id.tv_opis);
        tvNaziv.setText(JeloProvider.getJeloById(position).getOpis());

        Spinner Kategorija = findViewById(R.id.sp_kategorija);
        List<String> kategorije = CategoryProvider.getCategoryNames();
        ArrayAdapter<String> adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item, kategorije);
        Kategorija.setAdapter(adapter);
        Kategorija.setSelection(JeloProvider.getJeloById(position).getKategorija().getId());

        final List<Sastojci> sastojciNames = SastojciProvider.getSastojci();
        ArrayAdapter<Sastojci> dataAdapter = new ArrayAdapter<>(this,R.layout.list_item,sastojciNames);
        ListView listView = (ListView) findViewById(R.id.lv_sastojci);
        listView.setAdapter(dataAdapter);

        TextView tvKalorije = (TextView) findViewById(R.id.tv_kalorije);
        tvKalorije.setText(String.valueOf(JeloProvider.getJeloById(position).getKalorije()));
        TextView tvCena = (TextView) findViewById(R.id.tv_cena);
        tvCena.setText(String.valueOf(JeloProvider.getJeloById(position).getCena()));
        RatingBar rbRating = (RatingBar) findViewById(R.id.rb_rating);
        rbRating.setRating(JeloProvider.getJeloById(position).getRating());
    }

}
