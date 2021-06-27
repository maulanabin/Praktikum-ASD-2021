package com.maulana.javacollection;

public class Nilai {
    String kodeNilai;
    String kodeMataKuliah;
    String nimMhs;
    Float nilai;

    public Nilai() {

    }
    Nilai(String kodenilai, float nilai, String kodematakuliah, String nimmhs) {
        this.kodeNilai = kodenilai;
        this.nilai = nilai;
        this.kodeMataKuliah = kodematakuliah;
        this.nimMhs = nimmhs;
    }
}
