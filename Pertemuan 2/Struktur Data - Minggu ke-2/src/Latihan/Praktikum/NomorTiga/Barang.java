package Latihan.Praktikum.NomorTiga;
// Maulana Bintang Irfansyah_TI-1H_2041720132

public class Barang {
    String nama;
    int hargaSatuan, jumlah;

    Barang(String nama, int hargaSatuan, int jumlah) {
        this.nama = nama;
        this.hargaSatuan = hargaSatuan;
        this.jumlah = jumlah;
    }
    public int hitungHargaTotal() {
        return this.jumlah * this.hargaSatuan;
    }
    public int hitungHargaDiskon() {
        int totalSebelumDiskon = hitungHargaTotal();
        int diskonBarang = 0;
        if (totalSebelumDiskon > 100000) {
            diskonBarang = (int) (totalSebelumDiskon * 0.1);
        } else if ((totalSebelumDiskon > 50000) && ((totalSebelumDiskon <= 100000))) {
            diskonBarang = (int) (totalSebelumDiskon * 0.05);
        } else {
            diskonBarang = (int) (totalSebelumDiskon * 0);
        }
        return diskonBarang;
    }
    public int hitungHargaBayar() {
        int totalSetelahDiskon = hitungHargaTotal();
        double diskon = hitungHargaDiskon();
        totalSetelahDiskon -= diskon;
        return totalSetelahDiskon;
    }
}
