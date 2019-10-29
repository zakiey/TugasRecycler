package com.example.recview;
import android.graphics.drawable.Drawable;
public class keluarga {
    private String nama, silsilah;
    private Drawable gambar;

    public keluarga(String nama, String silsilah, Drawable gambar) {
        this.nama = nama;
        this.silsilah = silsilah;
        this.gambar = gambar;
    }

    public Drawable getGambar() {
        return gambar;
    }

    public void setGambar(Drawable gambar) {
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSilsilah() {
        return silsilah;
    }

    public void setSilsilah(String silsilah) {
        this.silsilah = silsilah;
    }


}


