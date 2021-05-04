package com.maulana.asd.tugas3;

import java.util.Scanner;

public class VaksinasiMain {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        QueueDLLVaksin dll = new QueueDLLVaksin();
        int pilih = 0;
        String dataNo, dataNama;
        do {
            try {
                System.out.println();
                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                System.out.println("\t\t\tPengantri Vaksin Nusantara");
                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                System.out.println("\t\t\t\t>> Pilihan Menu <<");
                System.out.println("1. Tambah Data Penerima Vaksin");
                System.out.println("2. Hapus Data Pengantri Vaksin");
                System.out.println("3. Daftar Penerima Vaksin");
                System.out.println("4. Keluar");
                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                System.out.print("Pilihan Anda: ");
                pilih = Integer.parseInt(userInput.nextLine());
                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                switch (pilih) {
                    case 1:
                        System.out.println("Masukkan Data Penerima Vaksin");
                        System.out.println("✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨");
                        System.out.print("No Antrian\t\t: ");
                        dataNo = userInput.next(); userInput.nextLine();
                        System.out.print("Nama penerima\t: ");
                        dataNama = userInput.nextLine();
                        dll.Enqueue(dataNo, dataNama);
                        break;
                    case 2:
                        dll.Dequeue();
                        dll.print();
                        break;
                    case 3:
                        dll.print();
                        break;
                    case 4:
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
        } while (pilih > 0 && pilih <= 4);
    }
}
