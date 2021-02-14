package com.maulana.java.algoritmastrukturdata;
import java.util.Scanner;
public class LatihanKedua {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan NIM Anda: ");
        int nimMhs = userInput.nextInt();
       //System.out.println(String.valueOf(nimMhs).substring(2));
        int akhir = nimMhs % 100;
        int n = akhir + 10;
        System.out.println("n: " + n);

        //String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        for (int i = 0; i <= n; i++) {
            System.out.println("Senin Selasa Rabu Kamis Jumat Sabtu Minggu ");
        }
        System.out.println("");
    }
}
