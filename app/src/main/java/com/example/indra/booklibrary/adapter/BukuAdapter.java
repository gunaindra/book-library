package com.example.indra.booklibrary.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.indra.booklibrary.R;
import com.example.indra.booklibrary.data.Buku;

import java.util.List;

/**
 * Created by indra on 14/04/17.
 */

public class BukuAdapter extends RecyclerView.Adapter<BukuAdapter.MyViewHolder> {

    List<Buku> listbukus;
    Context context;

    public BukuAdapter(Context context, List<Buku> listbukus) {
        this.listbukus = listbukus;
        this.context = context;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView judul, pengarang;
        public ImageView coverBuku;
        public LinearLayout frame;
        public MyViewHolder(View view) {
            super(view);
            coverBuku = (ImageView) view.findViewById(R.id.coverBuku);
            judul = (TextView) view.findViewById(R.id.judul);
            pengarang = (TextView) view.findViewById(R.id.pengarang);
            frame = (LinearLayout) view.findViewById(R.id.groupLayout);
        }
    }

    @Override
    public BukuAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_buku, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder (BukuAdapter.MyViewHolder holder, int position) {
        final Buku buku = listbukus.get(position);
        holder.judul.setText(buku.getJudul());
        holder.pengarang.setText(buku.getPengarang());
        holder.coverBuku.setImageResource(buku.getCoverBuku());
    }

    @Override
    public int getItemCount() {
        return listbukus.size();
    }
}
