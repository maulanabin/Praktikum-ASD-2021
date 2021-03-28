package com.mycompany.testsearching;

public class Mahasiswa {
    public int nim;
    public String nama;
    public int umur;
    public double ipk;

    Mahasiswa(int ni, String n, int u, double i) {
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;

    }

    public void tampil() {
        System.out.println("NIM\t\t: " + nim);
        System.out.println("Nama\t: " + nama);
        System.out.println("Umur\t: " + umur);
        System.out.println("IPK\t\t: " + ipk);

    }
}