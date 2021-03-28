package com.maulana.tugas3;
import java.util.*;
public class sequentialArrayMain {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int[][] data = {
                {45, 78, 7, 200, 80},
                {90, 1, 17, 100, 50},
                {21, 2, 40, 18,  65}
        };
        sequentialSearchArray pencarian = new sequentialSearchArray(data, 3, 5);
        System.out.println("🌳 🌳 🌳 🌳 🌳 🌳");
        System.out.println("Isi Array: ");
        pencarian.TampilData();
        System.out.println("🌳 🌳 🌳 🌳 🌳 🌳");

        System.out.print("Masukkan data yang ingin dicari: ");
        int cari = userInput.nextInt();

        System.out.println("Pencarian Menggunakan Sequential Search");
        pencarian.FindSeqSearch(cari);
        System.out.println("🌳 🌳 🌳 🌳 🌳 🌳 🌳 🌳 🌳 🌳 🌳 🌳 🌳 🌳 🌳  🌳 🌳 🌳  🌳 🌳 🌳");
        if (sequentialSearchArray.brs != -1 && sequentialSearchArray.klm != -1) {
            System.out.println("Data: " + cari + " ditemukan pada indeks baris ke-" + sequentialSearchArray.brs + " dan kolom ke-" + sequentialSearchArray.klm);
        } else {
            System.out.println("Data: " + cari + " tidak ditemukan!");
        }
    }
}
