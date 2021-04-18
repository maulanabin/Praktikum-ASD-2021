package com.maulana.asd.queue.tugas2;

public class Mahasiswa {
    public String nim, nama;
    public int absen;
    public double ipk;

    public Mahasiswa(String nim, String nama, int absen, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.ipk = ipk;
    }
    public Mahasiswa() {

    }
    public void print() {
        System.out.println("Data Mahasiswa");
        System.out.println("NIM\t\t: " + nim);
        System.out.println("Nama\t: " + nama);
        System.out.println("Absen\t: " + absen);
        System.out.println("IPK\t\t: " + ipk);
    }
}
