package com.example.listagem;

import java.util.ArrayList;

public class PlanetaDAO {
    ArrayList<Planeta> planetas;

    public PlanetaDAO(){
        planetas = new ArrayList<>();
        planetas.add(new Planeta("Mercúrio", R.drawable.mercury));
        planetas.add(new Planeta("Venus", R.drawable.venus));
        planetas.add(new Planeta("Terra", R.drawable.earth));
        planetas.add(new Planeta("Marte", R.drawable.mars));
        planetas.add(new Planeta("Jupiter", R.drawable.jupter));
        planetas.add(new Planeta("Saturno", R.drawable.saturn));
    }
}
