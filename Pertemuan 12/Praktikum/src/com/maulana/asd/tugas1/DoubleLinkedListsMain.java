package com.maulana.asd.tugas1;

import java.util.Scanner;

public class DoubleLinkedListsMain {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        DoubleLinkedLists dll = new DoubleLinkedLists();
        int pilih = 0, data, pointer;
        do {
            try {
                System.out.println();
                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                System.out.println("PROGRAM PENGOLAHAN ANGKA DENGAN DOUBLY LINKED LISTS");
                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                System.out.println("\t\t\t\t\t>> Pilihan Menu <<");
                System.out.println("1. Tambah Awal (head)");
                System.out.println("2. Tambah Akhir (tail)");
                System.out.println("3. Tambah Data (pointer tertentu)");
                System.out.println("4. Hapus Data Awal");
                System.out.println("5. Hapus Data AKhir");
                System.out.println("6. Hapus Data (pointer tertentu)");
                System.out.println("7. Cetak Data");
                System.out.println("8. Cari Data");
                System.out.println("9. Urutkan Data (terbesar - terkecil)");
                System.out.println("10. Keluar");
                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                System.out.print("Pilihan Anda: ");
                pilih = userInput.nextInt();
                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                switch (pilih) {
                    case 1:
                        System.out.print("Masukkan Data Posisi Head: ");
                        data = userInput.nextInt();
                        dll.addFirst(data);
                        break;
                    case 2:
                        System.out.print("Masukkan Data Posisi Tail: ");
                        data = userInput.nextInt();
                        dll.addLast(data);
                        break;
                    case 3:
                        System.out.print("Masukkan Data: ");
                        data = userInput.nextInt();
                        System.out.print("Masukkan Pointer ke-");
                        pointer = userInput.nextInt();
                        dll.add(data, pointer);
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
                        dll.print();
                        break;
                    case 8:
                        System.out.print("Masukkan data yang ingin dicari: ");
                        data = userInput.nextInt();
                        dll.cari(data);
                        break;
                    case 9:
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
