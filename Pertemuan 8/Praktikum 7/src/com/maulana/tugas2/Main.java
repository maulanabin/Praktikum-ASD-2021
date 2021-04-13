package com.maulana.tugas2;

public class Main {
    public static void main(String[] args) {
        Stack tumpukan = new Stack(10);
        BuktiPeminjaman struk;

        struk = new BuktiPeminjaman("1001", "2021-04-20", 2, 2000);
        tumpukan.push(struk);
        struk = new BuktiPeminjaman("1002", "2021-05-05", 1, 1000);
        tumpukan.push(struk);
        struk = new BuktiPeminjaman("1003", "2021-06-06", 3, 3000);
        tumpukan.push(struk);
        struk = new BuktiPeminjaman("1004", "2021-05-01", 1, 1000);
        tumpukan.push(struk);
        struk = new BuktiPeminjaman("1005", "2021-07-16", 2, 2000);
        tumpukan.push(struk);
        struk = new BuktiPeminjaman("1006", "2021-08-11", 1, 1000);
        tumpukan.push(struk);
        struk = new BuktiPeminjaman("1007", "2021-09-13", 3, 3000);
        tumpukan.push(struk);
        struk = new BuktiPeminjaman("1008", "2021-10-06", 2, 2000);
        tumpukan.push(struk);
        System.out.println("✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨");
        System.out.println("\t\t\t\t\t\t\t\t\t\t>> Data Struk Belanja <<");
        tumpukan.print();
        System.out.println("✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨");
        System.out.println("\t\t\t\t\t5 struk belanja dapat ditukar menjadi voucher belanja");
        System.out.print("\n");
        System.out.println("✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨");
        tumpukan.pop();
        tumpukan.pop();
        tumpukan.pop();
        tumpukan.pop();
        tumpukan.pop();
        System.out.println("✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨");
        System.out.println("\t\t\t\t\t\t\t\tTumpukan struk belanja sekarang");
        System.out.print("\n");
        tumpukan.print();
        System.out.println("✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨ ✨");
    }
}
