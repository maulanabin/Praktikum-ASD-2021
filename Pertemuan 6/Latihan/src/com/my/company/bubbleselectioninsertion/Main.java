package com.my.company.bubbleselectioninsertion;

public class Main {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 3.5); // idxMin
        Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 23, 2); // idx j
        Mahasiswa m5 = new Mahasiswa("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa Sebelum Sorting");
        list.tampil();
        System.out.print("\n");
        System.out.println("(Bubble sort): Data Mahasiswa Setelah Sorting Descending (Tinggi ke Rendah) Berdasarkan IPK");
        list.bubbleSort();
        list.tampil();
        System.out.print("\n");
        System.out.println("(Selection sort): Data Mahasiswa Setelah Sorting Ascending (Rendah ke Tinggi) Berdasarkan IPK");
        list.selectionSort();
        list.tampil();
        System.out.print("\n");
        System.out.println("(Insertion sort): Data Mahasiswa Setelah Sorting Ascending (Rendah ke Tinggi) Berdasarkan IPK");
        list.insertionSort();
        list.tampil();
    }
    // BB > Maju > Gelombong2 mana yang
    // SS > Indeks
    // IS > Memasukkan data
}
