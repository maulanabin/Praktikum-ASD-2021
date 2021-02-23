package Latihan.Praktikum.NomorSatu;
// Maulana Bintang Irfansyah_TI-1H_2041720132

public class Lingkaran {
    double phi, r;

    Lingkaran(double phi, double r) {
        // Kode this di bawah ini mereferensikan objek yang sedang digunakan.
        // Pemanggilan this ada di dalam konstruktor kelas Lingkaran.
        // Artinya nilai this mereferensikan objek lingkaran. Jadi, kode this.phi dan this.r -
        // adalah akses ke atribut phi dan r dalam kelas lingkaran.
        this.phi = phi;
        this.r = r;
    }
    public double hitungLuas() {
        double luasLingkaran = this.phi * (this.r * this.r);
        return luasLingkaran;
    }
    public double hitungKeliling() {
        double kelilingLingkaran = 2 * this.phi * this.r;
        return kelilingLingkaran;
    }
}
