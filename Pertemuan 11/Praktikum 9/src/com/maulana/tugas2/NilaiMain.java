package com.maulana.tugas2;

import java.util.Scanner;

public class NilaiMain {
    public static void main(String[] args) {
        SingleLinkedList data = new SingleLinkedList();
        Scanner userInput = new Scanner(System.in);
        int pilih, nilai, index, key;
        do {
            System.out.println("\nMenu Penambahan Data Nilai");
            System.out.println("1. Tambah (First)");
            System.out.println("2. Tambah (Index)");
            System.out.println("3. Tambah (After)");
            System.out.println("4. Tambah (Last)");
            System.out.println("5. Cetak Data");
            System.out.println("6. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilih = userInput.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("=================================");
                    System.out.println("\t\t>>Tambah (First)<<");
                    System.out.print("Masukkan Data: ");
                    nilai = userInput.nextInt();
                    data.addFirst(nilai);
                    data.print();
                    break;
                case 2:
                    System.out.println("=================================");
                    System.out.println("\t\t>>Tambah (Index)<<");
                    System.out.print("Masukkan Indeks ke-");
                    index = userInput.nextInt();
                    System.out.print("Masukkan Data: ");
                    nilai = userInput.nextInt();
                    data.insertAt(index, nilai);
                    data.print();
                    break;
                case 3:
                    System.out.println("=================================");
                    System.out.println("\t\t>>Tambah (After)<<");
                    System.out.print("Masukkan Key: ");
                    key = userInput.nextInt();
                    System.out.print("Masukkan Data: ");
                    nilai = userInput.nextInt();
                    data.insertAfter(key, nilai);
                    data.print();
                    break;
                case 4:
                    System.out.println("=================================");
                    System.out.println("\t\t>>Tambah (Last)<<");
                    System.out.print("Masukkan Data: ");
                    nilai = userInput.nextInt();
                    data.addLast(nilai);
                    data.print();
                    break;
                case 5:
                    System.out.println("=================================");
                    System.out.println("\t\t>>Cetak Data<<");
                    data.print();
                    break;
                case 6:
                    System.out.println("=================================");
                    System.out.println("\t\t>>Keluar Program<<");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Salah!");
            }
        } while (pilih != 6);
    }
}
