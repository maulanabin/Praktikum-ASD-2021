package com.maulana.asd.kuis;

public class Mahasiswa {
    int nim;
    String nama;
    double ipk;
    Mahasiswa prev, next;

    Mahasiswa(Mahasiswa prev, int nim, String nama, double ipk, Mahasiswa next) {
        this.prev = prev;
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.next = next;
    }
}
