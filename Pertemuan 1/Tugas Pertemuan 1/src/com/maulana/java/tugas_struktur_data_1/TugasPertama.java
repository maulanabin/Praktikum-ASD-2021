// 16_Maulana Bintang Irfansyah_2041720132
package com.maulana.java.tugas_struktur_data_1;

public class TugasPertama {
    public static void main(String[] args) {
        int[] jumlahPelanggan = new int[4];
        int[] totalPelanggan = new int[4];
        String[] namaPelanggan = {"Ania", "Budi", "Bina", "Cita"};
        int[] banyakPakaian = {3, 10, 6, 11};
        int[] hargaSatuKilo = {4500};
        double[] totalCucian = {0};
        double diskon = 0.05;

        for (int i = 0; i < jumlahPelanggan.length; i++) {
            // harga * banyak barang
            double harga = hargaSatuKilo[jumlahPelanggan[i]] * banyakPakaian[i];
            // hitung potongan yang bisa didapatkan
            double potongan = harga * diskon;
            // kalau beli barang > 10 maka harga dipotong
            if(banyakPakaian[i] > 10) harga = harga - potongan;
            // total cucian yang di-laundry
            System.out.print(i + 1 + ". ");
            System.out.println(namaPelanggan[i] + ", " + hargaSatuKilo[jumlahPelanggan[i]] +
                    " x\t" + banyakPakaian[i] + "\tkg " + "\t= " + (harga));
            // masukkan harga yang sudah dipotong karena totalPelanggan memiliki tipe data int, maka harga yang tipe data double harus di-casting menjadi int (narrowing casting)
            totalPelanggan[i] = (int)harga;
            totalCucian[0] += totalPelanggan[i];
        }
        System.out.println("Total pendapatan Smile Laundry adalah Rp " + totalCucian[0]);
    }
}