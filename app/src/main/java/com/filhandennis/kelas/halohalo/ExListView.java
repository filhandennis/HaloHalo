package com.filhandennis.kelas.halohalo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ExListView extends AppCompatActivity {

    //Buat Komponen View di Layout [0]

    //Deklarasi Komponen List View [1]
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        //Inisialisasi Komponen ListView [2]
        listView=(ListView)findViewById(R.id.SimpleListview);

        //Daftar Item (Data) untuk ListView [3]
        final String[] planets = { "Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune", "Ceres", "Pluto", "Eris"};
        //ArrayAdapter untuk merubah Daftar Data menjadi Daftar yang bisa digunakan di Komponen ListView [4]
        //Referensi: https://androidexample.com/Create_A_Simple_Listview_-_Android_Example/index.php?view=article_discription&aid=65
        //           https://stackoverflow.com/questions/3663745/what-is-android-r-layout-simple-list-item-1
        ArrayAdapter dataAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, planets);

        //Set Adapter Listview [5]
        listView.setAdapter(dataAdapter);

        //Aksi Klik untuk tiap item ListView [6]
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id) {
                //Mengeluarkan TOAST
                Toast.makeText(ExListView.this, "Memilih Item '"+planets[pos]+"'", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
