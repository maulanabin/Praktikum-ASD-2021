package com.maulana.asd.tugas2;

import java.util.Scanner;

public class BukuMain {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        DLLBuku dll = new DLLBuku();
        int pilih = 0;
        String data;
        do {
            try {
                System.out.println();
                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                System.out.println("\t\t\t\tData Buku Perpustakaan");
                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                System.out.println("\t\t\t\t>> Pilihan Menu <<");
                System.out.println("1. Entry Judul Buku");
                System.out.println("2. Ambil Buku Teratas");
                System.out.println("3. Cek Judul Buku Teratas");
                System.out.println("4. Info Semua Judul Buku");
                System.out.println("5. Keluar");
                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                System.out.print("Pilihan Anda: ");
                pilih = Integer.parseInt(userInput.nextLine());
                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                switch (pilih) {
                    case 1:
                        System.out.print("Masukkan Judul Buku: ");
                        data = userInput.nextLine();
                        dll.push(data);
                        break;
                    case 2:
                        dll.pop();
                        System.out.println("Buku pada tumpukan teratas telah diambil!");
                        break;
                    case 3:
                        System.out.println("Cek Buku Teratas");
                        dll.peek();
                        break;
                    case 4:
                        System.out.println("Cetak Seluruh Judul Buku");
                        dll.print();
                        break;
                    case 5:
                        System.out.println("Anda telah keluar");
                        System.out.println("== Terima Kasih ==");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan salah!");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
        } while (pilih > 0 && pilih <= 5);
    }
}
