// 16_Maulana Bintang Irfansyah_2041720132
package com.maulana.java.tugas_struktur_data_1;
import java.util.Scanner;

public class TugasKetiga {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        // Program menampilkan bilangan genap kecuali kelipatan 4
        int nilaiInputan, i;
        System.out.print("Masukkan bilangan: ");
        nilaiInputan = userInput.nextInt();
        i = 2;
        while (i <= nilaiInputan) {
            if ( i % 4 != 0) {
                System.out.println(i + " ");
            }
            i += 2;
        }
    }
}
