package ASD.BangunRuang;
// Maulana Bintang Irfansyah_TI-1H_2041720132
public class Kubus {
    public int sisi;

    public Kubus(int s) {
        sisi = s;
    }
    public int hitungLuas() {
        return 6 * sisi * sisi;
    }
    public int hitungVolume() {
        return sisi * sisi * sisi;
    }
}
