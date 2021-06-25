package com.maulana.uas.baru;

public class Pajak {
    String kode;
    int nominal;
    int denda;
    String bulanBayar;

    public Pajak(String kode, int nominal, int denda, String bulanBayar) {
        this.kode = kode;
        this.nominal = nominal;
        this.denda = denda;
        this.bulanBayar = bulanBayar;
    }
}
