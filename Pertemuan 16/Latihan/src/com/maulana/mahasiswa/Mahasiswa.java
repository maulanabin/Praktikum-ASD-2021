package com.maulana.mahasiswa;

public class Mahasiswa {
    String nim;
    String nama;
    String noTelepon;

    public Mahasiswa() {

    }
    public Mahasiswa(String nim, String nama, String noTelepon) {
        this.nim = nim;
        this.nama = nama;
        this.noTelepon = noTelepon;
    }
    @Override
    public String toString() {
        return "Mahasiswa{" + "nim = " + nim + ", nama = " + nama + ", no telepon = " + noTelepon + '}';
    }
}
