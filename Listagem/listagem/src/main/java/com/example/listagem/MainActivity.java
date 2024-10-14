package com.example.listagem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] palavras = new String[]{"Vinisius", "Maria", "Kismidic", "Maxstell", "Lisz", "Romulito", "Andrei"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.ListView);

        PlanetaDAO planetaDAO = new PlanetaDAO();
        planetaAdapter planetaAdapter = new planetaAdapter(this,R.layout.planeta_item, planetaDAO.planetas);
        listView.setAdapter(planetaAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), Integer.toString(i) + palavras[i], Toast.LENGTH_LONG).show();
            }
        });
    }
}