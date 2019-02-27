package com.example.tugas_recylerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.tugas_recylerview.adapter.UniversitasAdapter;
import com.example.tugas_recylerview.models.Universitas;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Universitas> universitasList = new ArrayList<>();
        universitasList.add(new Universitas("album_1", "UIN Maulana Malik Ibrahim","",R.drawable.uin));
        universitasList.add(new Universitas("album_2", "Politeknik Negeri Malang","", R.drawable.polinema));
    }

    universitasList.add(new Universitas("album_3", "Universitas Muhammadiyah Malang","", R.drawable.umm));
    universitasList.add(new Universitas("album_4", "University of Brawijaya","" ,R.drawable.ub));
    universitasList.add(new Universitas("album_5", "UNISMA","" ,R.drawable.unisma));
    universitasList.add(new Universitas("album_6", "Universitas Merdeka Malang","" , R.drawable.umm));
    universitasList.add(new Universitas("album_7", "Universitas Widyagama Malang", "", R.drawable.uwg));