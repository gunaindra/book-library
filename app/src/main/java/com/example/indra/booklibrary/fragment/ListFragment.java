package com.example.indra.booklibrary.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.indra.booklibrary.R;
import com.example.indra.booklibrary.adapter.BukuAdapter;
import com.example.indra.booklibrary.data.Buku;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by indra on 14/04/17.
 */

public class ListFragment extends Fragment {

    private RecyclerView recyclerView;
    private BukuAdapter bukuAdapter;

    List<Buku> listBuku = new ArrayList<>();

    public ListFragment() {
        Buku bukuA = new Buku();
        bukuA.setCoverBuku(R.drawable.cover1);
        bukuA.setJudul("Ensiklopedi Akhir Zaman");
        bukuA.setPengarang("Dr. Muhammad Ahmad Al-Mubayayadh");

        Buku bukuB = new Buku();
        bukuB.setCoverBuku(R.drawable.cover2);
        bukuB.setJudul("Gerbang Dialog Danur");
        bukuB.setPengarang("Risa Saraswati");

        Buku bukuC = new Buku();
        bukuC.setCoverBuku(R.drawable.cover1);
        bukuC.setJudul("Ensiklopedi Akhir Zaman");
        bukuC.setPengarang("Dr. Muhammad Ahmad Al-Mubayayadh");

        Buku bukuD = new Buku();
        bukuD.setCoverBuku(R.drawable.cover2);
        bukuD.setJudul("Gerbang Dialog Danur");
        bukuD.setPengarang("Risa Saraswati");

        listBuku.add(bukuA);
        listBuku.add(bukuB);
        listBuku.add(bukuC);
        listBuku.add(bukuD);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_list, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        bukuAdapter = new BukuAdapter(getContext(), listBuku);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(bukuAdapter);
        return view;
    }
}