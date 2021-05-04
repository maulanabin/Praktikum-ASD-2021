package com.maulana.asd.tugas2;

public class Buku {
    String judulBuku;
    Buku prev, next;

    Buku (Buku prev, String judulBuku, Buku next) {
        this.prev = prev;
        this.judulBuku = judulBuku;
        this.next = next;
    }
}
