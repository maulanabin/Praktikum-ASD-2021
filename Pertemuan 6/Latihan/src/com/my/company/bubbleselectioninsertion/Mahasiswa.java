package com.my.company.bubbleselectioninsertion;

public class Mahasiswa {
    public String nama;
    public int tahunMasuk;
    public int umur;
    public double ipk;

    Mahasiswa(String n, int t, int u, double i) {
        nama = n;
        tahunMasuk = t;
        umur = u;
        ipk = i;
    }
    public void tampil() {
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Tahun masuk\t: " + tahunMasuk);
        System.out.println("Umur\t\t: " + umur);
        System.out.println("IPK\t\t\t: " + ipk);

    }
}
