package com.maulana.asd.tugas3;

public class AntrianVaksinasi {
    String noAntrian, nama;
    AntrianVaksinasi prev, next;

    AntrianVaksinasi(AntrianVaksinasi prev, String noAntrian, String nama, AntrianVaksinasi next) {
        this.prev = prev;
        this.noAntrian = noAntrian;
        this.nama = nama;
        this.next = next;
    }
}
