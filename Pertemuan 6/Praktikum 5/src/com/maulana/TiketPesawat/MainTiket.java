package com.maulana.TiketPesawat;
// TI 1H_Maulana Bintang Irfansyah_16_2041720132
import java.util.*;
public class MainTiket {
    static int jumlahTiket;

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        TiketService data = new TiketService();
        System.out.print("Masukkan jumlah tiket\t: ");
        jumlahTiket = userInput.nextInt();
        data.TiketService(jumlahTiket);
        userInput.nextLine();
        System.out.print("\n");

        for (int x = 0; x < jumlahTiket; x++) {
            System.out.printf("✈ ✈ ✈ ✈ ✈ Input Data Tiket %d ✈ ✈ ✈ ✈ ✈\n", (x + 1));
            System.out.print("Maskapai\t\t: ");
            String maskapai = userInput.nextLine();
            System.out.print("Harga\t\t\t: Rp ");
            int harga = userInput.nextInt();
            System.out.print("Asal\t\t\t: "); userInput.nextLine();
            String asal = userInput.nextLine();
            System.out.print("Tujuan\t\t\t: ");
            String tujuan = userInput.nextLine();
            System.out.println("✈ ✈ ✈ ✈ ✈ ✈ ✈ ✈ ✈ ✈ ✈ ✈ ✈ ✈ ✈ ✈ ✈");
            Tiket t = new Tiket(maskapai, harga, asal, tujuan);
            data.tambah(t);
        }
        System.out.println("\t\t\t✨ ✨ ✨ ✨ ✨ Data Tiket Sebelum Sorting ✨ ✨ ✨ ✨ ✨");
        data.tampilAll();
        System.out.println("\t\t\t✨ ✨ ✨ ✨ ✨ Urutkan Tiket ✨ ✨ ✨ ✨ ✨");
        System.out.println("\t1. Termurah - Termahal");
        System.out.println("\t2. Termahal - Termurah");
        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = userInput.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("\t\t✨ ✨ ✨ ✨ ✨ Data Tiket Setelah Bubble Sort Ascending ✨ ✨ ✨ ✨ ✨");
                data.bubbleSortAsc();
                data.tampilAll();
                System.out.println("\t\t✨ ✨ ✨ ✨ ✨ Data Tiket Setelah Selection Sort Ascending ✨ ✨ ✨ ✨ ✨");
                data.selectionSortAsc();
                data.tampilAll();
                break;
            case 2:
                System.out.println("\t\t✨ ✨ ✨ ✨ ✨ Data Tiket Setelah Bubble Sort Descending ✨ ✨ ✨ ✨ ✨");
                data.bubbleSortDesc();
                data.tampilAll();
                System.out.println("\t\t✨ ✨ ✨ ✨ ✨ Data Tiket Setelah Selection Sort Descending ✨ ✨ ✨ ✨ ✨");
                data.selectionSortDesc();
                data.tampilAll();
                break;

        }

    }
}
