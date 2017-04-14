package com.example.indra.booklibrary.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;

/**
 * Created by indra on 14/04/17.
 */

public class Buku implements Parcelable {

    private int coverBuku;
    private String judul;
    private String pengarang;

    public static final Creator<Buku> CREATOR = new Creator<Buku>() {
        @Override
        public Buku createFromParcel(Parcel in) {
            return new Buku(in);
        }

        @Override
        public Buku[] newArray(int size) {
            return new Buku[size];
        }
    };

    public int getCoverBuku() { return coverBuku; }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setCoverBuku (int coverBuku) { this.coverBuku = coverBuku; }
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(judul);
        dest.writeString(pengarang);
    }

    private Buku(Parcel in) {
        this.coverBuku = in.readInt();
        this.judul = in.readString();
        this.pengarang = in.readString();
    }

    public Buku(){

    }
}
