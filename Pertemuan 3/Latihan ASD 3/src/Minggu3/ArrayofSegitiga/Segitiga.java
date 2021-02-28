package Minggu3.ArrayofSegitiga;

public class Segitiga {
    public int alas, tinggi;

    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }
    public int hitungLuas() {
        return (alas * tinggi) / 2;
    }
    public int hitungKeliling() {
        return 3 * alas;
    }
}
