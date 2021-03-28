package com.maulana.tugas2;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianMhs data = new PencarianMhs();
        int jumlahMhs = 5;

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 ");
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
        System.out.println("\t\tData Keseluruhan Mahasiswa: ");
        System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 ");
        System.out.println("\t\t\tPENCARIAN DATA");
        System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 ");
        System.out.println("Masukkan nama mahasiswa yang dicari! ");
        System.out.print("Nama\t: ");
        String cariMhs = s1.nextLine();
        System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 ");
        System.out.println("Pencarian menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cariMhs);
        data.TampilPosisi(cariMhs, posisi);
        data.TampilData(cariMhs, posisi);
    }
}
