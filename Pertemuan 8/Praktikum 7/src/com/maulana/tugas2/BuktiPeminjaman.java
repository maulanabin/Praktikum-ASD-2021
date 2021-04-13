package com.maulana.tugas2;

public class BuktiPeminjaman {
    String nomorTransaksi;
    String tanggalPembelian;
    int jumlahBarang;
    double totalHarga;

    BuktiPeminjaman(String nomorTransaksi, String tanggalPengembalian, int jumlahBarang, double totalHarga) {
        this.nomorTransaksi = nomorTransaksi;
        this.tanggalPembelian = tanggalPengembalian;
        this.jumlahBarang = jumlahBarang;
        this.totalHarga = totalHarga;
    }
    public String toString() {
        System.out.println("Nomor Transaksi\t\t\t\tTanggal Pembelian\t\t\t\tJumlah Barang\t\t\t\tTotal Harga");
        return "\t" + nomorTransaksi + "\t\t\t\t\t" + tanggalPembelian + "\t\t\t\t\t\t\t\t" + jumlahBarang + "\t\t\t\t\t" + totalHarga;
    }
}
