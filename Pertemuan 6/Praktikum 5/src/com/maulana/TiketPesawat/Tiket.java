package com.maulana.TiketPesawat;
// TI 1H_Maulana Bintang Irfansyah_16_2041720132
public class Tiket {
    public String maskapai;
    public int harga;
    public String asal;
    public String tujuan;

    Tiket(String m, int h, String a, String t) {
        maskapai = m;
        harga = h;
        asal = a;
        tujuan = t;
    }
    public void tampilTiket() {
        System.out.println("Maskapai\t\t\t: " + maskapai);
        System.out.println("Harga\t\t\t\t: " + harga);
        System.out.println("Asal Penerbangan\t: " + asal);
        System.out.println("Tujuan Penerbangan\t: " + tujuan);

    }
}
