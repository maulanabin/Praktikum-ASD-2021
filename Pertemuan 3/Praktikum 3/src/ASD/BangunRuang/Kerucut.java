package ASD.BangunRuang;
// Maulana Bintang Irfansyah_TI-1H_2041720132
public class Kerucut {
    double phi, rusuk, tinggi, sisi;

    public Kerucut(double pi, double r, double t, double s) {
        phi = pi;
        rusuk = r;
        tinggi = t;
        sisi = s;
    }
    public double hitungLuas() {
        return phi * rusuk * (rusuk + sisi);
    }
    public double hitungVolume() {
        return 1/(double)3 * phi * rusuk * rusuk * tinggi;
    }
}
