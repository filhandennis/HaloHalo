package com.filhandennis.kelas.halohalo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toSpinner(View v){
        startActivity(new Intent(this, ExSpinner.class));
    }

    public void toListview1(View v){startActivity(new Intent(this, ExListView.class));}
    public void toListview2(View v){startActivity(new Intent(this, ExListViewAdvance.class));}
    public void toFragment(View v){
        Toast.makeText(this, "Belum terkandung", Toast.LENGTH_SHORT).show();
    }
}
