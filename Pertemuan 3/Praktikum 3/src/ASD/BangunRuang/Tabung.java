package ASD.BangunRuang;
// Maulana Bintang Irfansyah_TI-1H_2041720132
public class Tabung {
    double phi, jariJari, tinggi;

    public Tabung(double pi, double r, double t) {
        phi = pi;
        jariJari = r;
        tinggi = t;
    }
    public double hitungLuas() {
        return 2 * (phi * jariJari * jariJari) + (2 * phi * jariJari * tinggi);
    }
    public double hitungVolume() {
        return (phi * jariJari * jariJari) * tinggi;
    }
}
