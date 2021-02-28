package Minggu3.ArrayOfObjects;

import java.util.Scanner;

public class PersegiPanjangMain {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan jumlah persegi panjang: ");
        int jumlahPersegiPanjang = userInput.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[jumlahPersegiPanjang]; 
        for (int i = 0; i < jumlahPersegiPanjang; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-" + (i + 1));
            System.out.print("Masukkan nilai panjang: ");
            ppArray[i].panjang = userInput.nextInt();
            System.out.print("Masukkan nilai lebar: ");
            ppArray[i].lebar = userInput.nextInt();

        }
        // cetak data
        for (int i = 0; i < jumlahPersegiPanjang; i++) {
            System.out.println("Persegi panjang ke-" + (i +1));
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
    }
}
