package com.maulana.java.algoritmastrukturdata;

import java.util.Scanner;
public class LatihanPertama {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("============== PROGRAM MENGHITUNG NILAI AKHIR MAHASISWA ==============");
        int nilaiTugas, nilaiUTS, nilaiUAS;
        double totalNilai;

        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = userInput.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = userInput.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = userInput.nextInt();

        totalNilai = (nilaiTugas * 0.2) + (nilaiUTS * 0.35) + (nilaiUAS * 0.45);
        System.out.println("Nilai akhir mahasiswa: " + totalNilai);
        if (totalNilai > 80 && totalNilai <= 100) {
            System.out.println("Nilai huruf: A");
            System.out.println("Selamat Anda lulus!");
        } else if (totalNilai > 73 && totalNilai <= 80) {
            System.out.println("Nilai huruf: B+");
            System.out.println("Selamat Anda lulus!");
        } else if (totalNilai > 65 && totalNilai <= 73) {
            System.out.println("Nilai huruf: B");
            System.out.println("Selamat Anda lulus!");
        } else if (totalNilai > 60 && totalNilai <= 65) {
            System.out.println("Nilai huruf: C+");
            System.out.println("Selamat Anda lulus!");
        } else if (totalNilai > 50 && totalNilai <= 60) {
            System.out.println("Nilai huruf: C");
            System.out.println("Selamat Anda lulus!");
        } else if (totalNilai > 39 && totalNilai <= 50) {
            System.out.println("Nilai huruf: D");
            System.out.println("Anda tidak lulus!");
        } else {
            System.out.println("Nilai huruf: E");
            System.out.println("Anda tidak lulus!");
        }
    }
}
