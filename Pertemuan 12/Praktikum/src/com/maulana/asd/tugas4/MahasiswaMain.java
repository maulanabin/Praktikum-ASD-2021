package com.maulana.asd.tugas4;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        DLLMahasiswa dll = new DLLMahasiswa();
        int pilih = 0, dataNim, pointer;
        String dataNama;
        double dataIpk;
        do {
            try {
                System.out.println();
                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                System.out.println("\t\tSISTEM PENGOLAHAN DATA MAHASISWA");
                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                System.out.println("\t\t\t\t\t>> Pilihan Menu <<");
                System.out.println("1. Tambah Data Awal");
                System.out.println("2. Tambah Data Akhir");
                System.out.println("3. Tambah Data Index Tertentu");
                System.out.println("4. Hapus Data Pertama");
                System.out.println("5. Hapus Data Terakhir");
                System.out.println("6. Hapus Data Tertentu");
                System.out.println("7. Cetak Data");
                System.out.println("8. Cari NIM");
                System.out.println("9. Urutkan Data (terbesar - terkecil)");
                System.out.println("10. Keluar");
                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                System.out.print("Pilihan Anda: ");
                pilih = userInput.nextInt();
                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                switch (pilih) {
                    case 1:
                        System.out.println("Masukkan Data Mahasiswa Posisi Awal");
                        System.out.print("NIM\t\t: ");
                        dataNim = userInput.nextInt(); userInput.nextLine();
                        System.out.print("Nama\t: ");
                        dataNama = userInput.nextLine();
                        System.out.print("IPK\t\t: ");
                        dataIpk = userInput.nextDouble();
                        dll.addFirst(dataNim, dataNama, dataIpk);
                        break;
                    case 2:
                        System.out.println("Masukkan Data Mahasiswa Posisi Akhir");
                        System.out.print("NIM\t\t: ");
                        dataNim = userInput.nextInt(); userInput.nextLine();
                        System.out.print("Nama\t: ");
                        dataNama = userInput.nextLine();
                        System.out.print("IPK\t\t: ");
                        dataIpk = userInput.nextDouble();
                        dll.addLast(dataNim, dataNama, dataIpk);
                        break;
                    case 3:
                        System.out.println("Masukkan Data Mahasiswa");
                        System.out.println(">>Data Node<<");
                        System.out.print("NIM\t\t: ");
                        dataNim = userInput.nextInt(); userInput.nextLine();
                        System.out.print("Nama\t: ");
                        dataNama = userInput.nextLine();
                        System.out.print("IPK\t\t: ");
                        dataIpk = userInput.nextDouble();
                        System.out.print("Masukkan Pointer ke-");
                        pointer = userInput.nextInt();
                        dll.add(dataNim, dataNama, dataIpk, pointer);
                        break;
                    case 4:
                        dll.removeFirst();
                        break;
                    case 5:
                        dll.removeLast();
                        break;
                    case 6:
                        System.out.print("Masukkan Pointer ke-");
                        pointer = userInput.nextInt();
                        dll.remove(pointer);
                        break;
                    case 7:
                        System.out.println("Cetak Data Semua Mahasiswa");
                        dll.print();
                        break;
                    case 8:
                        System.out.println("Cari Data");
                        System.out.print("Masukkan NIM: ");
                        dataNim = userInput.nextInt();
                        dll.cari(dataNim);
                        break;
                    case 9:
                        System.out.println("Penguruan Nilai IPK (terbesar - terkecil)");
                        dll.selectionSort();
                        dll.print();
                        break;
                    case 10:
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
        } while (pilih > 0 && pilih <= 10);
    }
}
