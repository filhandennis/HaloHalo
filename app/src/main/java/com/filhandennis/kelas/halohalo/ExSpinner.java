package com.filhandennis.kelas.halohalo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class ExSpinner extends AppCompatActivity {


    //Buat Komponen Spinner di Layout [0]

    //Deklarasi Komponen Spinner [1]
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        //Inisialisasi Komponen Spinner [2]
        spinner = (Spinner)findViewById(R.id.spinner);

        //Spinner Data [3]
        final String[] planets = { "Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune", "Ceres", "Pluto", "Eris"};

        //ArrayAdapter untuk mengisi Nilai Spinner, layoutnya diambil dari bawaan android [3]
        //Referensi:
        // https://developer.android.com/reference/android/R.layout.html
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, planets);
        //Set bagaimana bentuk item dengan menggunakan layout bawaan android [4]
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Set Adapter untuk spinner [5]
        spinner.setAdapter(dataAdapter);

        //Memberikan Aksi Klik untuk Item Spinner [6]
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {
                Toast.makeText(ExSpinner.this, "Memilih Item '"+planets[pos]+"'", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(ExSpinner.this, "Gak jadi milih", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
