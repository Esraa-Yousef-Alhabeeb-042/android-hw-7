package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<pokemon> myPokemons = new ArrayList<>();

        pokemon n1 = new pokemon("ivysaur",R.drawable.ivysaur,62,63,405);
        pokemon n2 = new pokemon("pikachu",R.drawable.pikachu,55,40,320);
        pokemon n3 = new pokemon("Gengar",R.drawable.gengar,65,60,500);
        pokemon n4 = new pokemon("Charizard",R.drawable.charizard,84,78,534);

        pokemon.add(n1);
        pokemon.add(n2);
        pokemon.add(n3);
        pokemon.add(n4);

        RecyclerView z = findViewById(R.id.RecyclerView);



          }
}