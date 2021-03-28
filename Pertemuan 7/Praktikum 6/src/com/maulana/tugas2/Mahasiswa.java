package com.maulana.tugas2;

public class Mahasiswa {
    public String nama;
    public int nim, umur;
    public double ipk;

    Mahasiswa(int nim, String nama, int umur, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.umur = umur;
        this.ipk = ipk;

    }

    public void tampil() {
        System.out.println("NIM\t\t: " + nim);
        System.out.println("Nama\t: " + nama);
        System.out.println("Umur\t: " + umur);
        System.out.println("IPK\t\t: " + ipk);

    }
}