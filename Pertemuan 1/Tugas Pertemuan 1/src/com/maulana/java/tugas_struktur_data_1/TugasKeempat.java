// 16_Maulana Bintang Irfansyah_2041720132
package com.maulana.java.tugas_struktur_data_1;
import java.util.Scanner;

public class TugasKeempat {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("Program Menghitung Luas Bangun Datar");
        System.out.println("======================================");
        System.out.println("1. Lingkaran");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.print("Masukkan nomor bangun datar pilihan Anda: ");
        int nomorPilihan = userInput.nextInt();
        switch (nomorPilihan) {
            case 1:
                System.out.println("-------------------------");
                System.out.println("Menghitung Luas Lingkaran");
                System.out.println("-------------------------");
                System.out.print("Masukkan panjang jari-jari lingkaran: ");
                double jariJari = userInput.nextDouble();
                double luasLingkaran = (fungsiLuasLingkaran(jariJari));
                System.out.println("Luas lingkaran adalah: " + luasLingkaran);
                break;
            case 2:
                System.out.println("-------------------------------");
                System.out.println("Menghitung Luas Persegi Panjang");
                System.out.println("-------------------------------");
                System.out.print("Masukkan panjang persegi panjang: ");
                double panjang = userInput.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double lebar = userInput.nextDouble();
                double luasPersegiPanjang = (fungsiLuasPersegiPanjang(panjang, lebar));
                System.out.println("Luas persegi panjang adalah: " + luasPersegiPanjang);
                break;
            case 3:
                System.out.println("-------------------------");
                System.out.println("Menghitung Luas Segitiga");
                System.out.println("-------------------------");
                System.out.print("Masukkan alas segitiga: ");
                double alas = userInput.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggi = userInput.nextDouble();
                double luasSegitiga = (fungsiLuasSegitiga(alas, tinggi));
                System.out.println("Luas segitiga adalah: " + luasSegitiga);
                break;
        }
    }
    static double fungsiLuasLingkaran(double jariJari) {
        double luasCircle = 3.14 * jariJari * jariJari;
        return luasCircle;
    }
    static double fungsiLuasPersegiPanjang(double panjang, double lebar) {
        double luasRectangle = panjang * lebar;
        return luasRectangle;
    }
    static double fungsiLuasSegitiga(double alas, double tinggi) {
        double luasTriangle = (alas * tinggi) / 2;
        return luasTriangle;
    }
}
