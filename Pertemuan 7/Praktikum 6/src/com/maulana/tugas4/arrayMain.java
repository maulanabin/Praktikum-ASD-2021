package com.maulana.tugas4;

public class arrayMain {
    public static void main(String[] args) {
        int[] data = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};
        int pos = -1;
        System.out.println("☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘");
        System.out.println("\t\t\t>>Sorting dengan Merge Sort<<");
        arraySortAndSearch mSort = new arraySortAndSearch();
        System.out.println("Data awal: ");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("Setelah diurutkan: ");
        mSort.printArray(data);

        int cari = data[data.length - 1];
        System.out.println("❤Data terbesar adalah " + cari);

        System.out.println("☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘");
        System.out.println("\t\t\t>>Menggunakan Binary Search<<");
        System.out.print("\n");
        arraySortAndSearch pencarian = new arraySortAndSearch(data, 10);
        for (int i = 0; i < data.length; i++) {
            int posisi = pencarian.FindBinarySearch(cari, i, data.length - 1);
            if (pos == posisi) {
                continue;
            }
            pos = posisi;
            pencarian.Tampilposisi(cari, posisi);
        }
        System.out.println("☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘");
    }
}
