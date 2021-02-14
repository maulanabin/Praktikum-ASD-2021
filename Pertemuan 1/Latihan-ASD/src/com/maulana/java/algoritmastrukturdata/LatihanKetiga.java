package com.maulana.java.algoritmastrukturdata;
//import java.util.Scanner;
public class LatihanKetiga { //diubah
    public static void main(String[] args) {
        //Scanner userInput = new Scanner(System.in);
        //int[] royalGarden1 = {}
        //String[] cabangToko = {"Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4"};
        int[][] stokBunga = {{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}};
        //int royalGarden1 = 0, royalGarden2 = 0, royalGarden3 = 0, royalGarden4 = 0;
        //String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int[] hargaBunga = {75000, 50000, 60000, 10000};

        int counter = 0;
        int[] totalBunga = new int[4]; // array untuk menyimpan jumlah bunga urut dari Algonema sampai Mawar

        //loop untuk menghitung total stokBunga, bisa dibuat method terpisah
        for (int i = 0; i < stokBunga.length; i += 1) {
            for (int j = 0; j < stokBunga[i].length; j += 1) {
                totalBunga[counter] += stokBunga[i][j];
            }
            counter += 1;
        }
        stokBunga[0][0] = stokBunga[0][0] - 1; // Aglonema mati 1 di Royal Garden1
        stokBunga[1][0] = stokBunga[1][0] - 2; // Keladi mati 2 di Royal Garden1
        stokBunga[3][0] = stokBunga[3][0] - 3; // Mawar mati 3 di Royal Garden1

        int totalPenjualan = 0;
        totalPenjualan += stokBunga[0][0] * hargaBunga[0]; // Penjualan Aglonema
        totalPenjualan += stokBunga[1][0] * hargaBunga[1]; // Penjualan Keladi
        totalPenjualan += stokBunga[2][0] * hargaBunga[2]; // Penjualan Alocasia
        totalPenjualan += stokBunga[3][0] * hargaBunga[3]; // Penjualan Mawar

        System.out.println(totalPenjualan);
    }
}
