package ASD.BangunRuang;
// Maulana Bintang Irfansyah_TI-1H_2041720132
public class Balok {
    public double panjang, lebar, tinggi;

    public Balok(double p, double l, double t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    public double hitungLuas() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
}
