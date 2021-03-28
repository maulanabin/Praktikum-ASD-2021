package com.maulana.tugas3;

public class sequentialSearchArray {
    public int[][] data;
    public static int jumlahDataBaris, jumlahDataKolom, brs = -1, klm = -1;

    public sequentialSearchArray(int[][] Data, int jmlDataBaris, int jmlDataKolom) {
        jumlahDataBaris = jmlDataBaris;
        jumlahDataKolom = jmlDataKolom;
        data = new int[jumlahDataBaris][jumlahDataKolom];

        for (int i = 0; i < jmlDataBaris; i++) {
            for (int j= 0; j < jumlahDataKolom; j++) {
                data[i][j] = Data[i][j];
            }
        }
    }
    public void FindSeqSearch(int cari) {
        for (int i = 0; i < jumlahDataBaris; i++) {
            for (int j = 0; j < jumlahDataKolom; j++) {
                if (data[i][j] == cari) {
                    brs = i;
                    klm = j;
                    break;
                }
            }
        }
    }
    public void TampilData() {
        for (int i = 0; i < jumlahDataBaris; i++) {
            for (int j = 0; j < jumlahDataKolom; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.print("\n");
        }
        //System.out.print("\n");
    }
}
