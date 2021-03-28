package com.mycompany.testsearching;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianMhs data = new PencarianMhs();
        int jumlahMhs = 5;

        System.out.println("------------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari NIM terkecil\n");
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("---------------------");
            System.out.print("NIM\t\t: ");
            int nimMhs = s.nextInt();
            System.out.print("Nama\t: ");
            String namaMhs = s1.nextLine();
            System.out.print("Umur\t: ");
            int umurMhs = s.nextInt();
            System.out.print("IPK\t\t: ");
            double ipkMhs = s.nextDouble();

            Mahasiswa mhs = new Mahasiswa(nimMhs, namaMhs, umurMhs, ipkMhs);
            data.tambah(mhs);
        }
        System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 ");
        System.out.println("Data Keseluruhan Mahasiswa: ");
        data.tampil();
        System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 ");
        System.out.println("\t\t\tPENCARIAN DATA");
        System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 ");
        System.out.println("Masukkan NIM Mahasiswa yang dicari: ");
        System.out.print("NIM: ");
        int cariMhs = s.nextInt();
        System.out.println("Pencarian menggunakan Sequential Search");
        int posisiMhs = data.FindSeqSearch(cariMhs);
        data.TampilPosisi(cariMhs, posisiMhs);
        data.TampilData(cariMhs, posisiMhs);
        System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 ");
        System.out.println("Pencarian menggunakan Binary Search");
        posisiMhs = data.FindBinarySearch(cariMhs, 0, jumlahMhs -1);
        data.TampilPosisi(cariMhs, posisiMhs);
        data.TampilData(cariMhs, posisiMhs);
    }
}
