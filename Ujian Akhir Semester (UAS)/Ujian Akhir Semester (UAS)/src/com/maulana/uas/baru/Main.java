package com.maulana.uas.baru;

import java.util.Scanner;

public class Main {
    static Scanner userInput = new Scanner(System.in);
    static Proses data = new Proses();

    public static void main(String[] args) {
        dataKendaraan();
        dataPajaki();
        menu();

    }
    static void dataKendaraan() {
        Kendaraan k1 = new Kendaraan("N6703WF", "Mail", "Sepeda Motor", "00125", "2016", "Maret");
        Kendaraan k2 = new Kendaraan("B2045AZ", "Rose", "Sepeda Motor", "00125", "2017", "Juni");
        Kendaraan k3 = new Kendaraan("L7683BC", "Lisa", "Sepeda Motor", "00125", "2018", "Februari");
        Kendaraan k4 = new Kendaraan("S8913FG", "Jennie", "Sepeda Motor", "00125", "2018", "Oktober");
        Kendaraan k5 = new Kendaraan("K4345WR", "Jisoo", "Sepeda Motor", "00125", "2019", "Mei");

        data.addKendaraan(k1);
        data.addKendaraan(k2);
        data.addKendaraan(k3);
        data.addKendaraan(k4);
        data.addKendaraan(k5);

    }
    static void dataPajaki() {
        Pajak p1 = new Pajak("00001", 310000, 10000, "Maret");
        Pajak p2 = new Pajak("00002", 350000, 15000, "Juni");
        Pajak p3 = new Pajak("00003", 340000, 5000, "Februari");
        Pajak p4 = new Pajak("00004", 330000, 10000, "Oktober");
        Pajak p5 = new Pajak("00005", 250000, 12000, "Mei");

        data.addPajak(p1);
        data.addPajak(p2);
        data.addPajak(p3);
        data.addPajak(p4);
        data.addPajak(p5);

    }
    static void menu(){
        System.out.println("\t\tMenu Samsat");
        System.out.println("1. Tampilkan Data Kendaraan");
        System.out.println("2. Tampilkan Data Pajak");
        System.out.println("3. Mencari Nominal > 300.000");
        System.out.println("4. Mencari Data (TNKB)");
        System.out.println("5. Mengurutkan berdasarkan Nama");
        System.out.println("6. Keluar");
        System.out.print("Pilih No: ");
        int pilih = userInput.nextInt();

        switch(pilih){
            case 1:
                data.tampilKendaraan();
                menu();
                break;
            case 2:
                data.tampilPajak();
                menu();
                break;
            case 3:
                System.out.println("Mencari nominal kendaraan di atas > 300000");
                data.cariData(300000);
                menu();
                break;
            case 4:
                cariTnkb();
                menu();
                break;
            case 5:
                boolean bool = sortBy();
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("Mengrutkan Data Berdasarkan Nama (Sort by) " + (bool ? "Descending" : "Ascending"));
                System.out.println("--------------------------------------------------------------------------");
                data.sorting(bool);
                data.tampilKendaraan();
                menu();
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Opsi tidak ada!");
                menu();
        }
    }
    static void cariTnkb() {
        System.out.println("----------------------------------");
        System.out.println("Cari Berdasaran No TNKB");
        System.out.println("----------------------------------");
        System.out.print("Masukkan No. TNKB: ");
        userInput.nextLine();
        String noTnkb = userInput.nextLine();
        data.check(noTnkb);
    }
    static boolean sortBy(){
        boolean bool = false;
        System.out.println("\tSORT BY :");
        System.out.println("1. DESCENDING");
        System.out.println("2. ASCENDING");
        System.out.print("Masukkan No: ");
        int pilih = userInput.nextInt();

        switch(pilih){
            case 1:
                bool = true;
                break;
            case 2:
                bool = false;
                break;
            default:
                System.out.println("Pilihan tidakAda");
                sortBy();
        }
        return bool;
    }
}
