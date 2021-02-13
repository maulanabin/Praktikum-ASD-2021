// 16_Maulana Bintang Irfansyah_2041720132
package com.maulana.java.tugas_struktur_data_1;

public class TugasKedua {
    public static void main(String[] args) {
        int uangSimpananBank = 1000000, saldoMencapai = 1500000, penguranganSaldo;
        double bungaBank = 0.02, hasilBungaBank, hasilAkhir;
        hasilBungaBank = uangSimpananBank * bungaBank;
        penguranganSaldo = saldoMencapai - uangSimpananBank;
        hasilAkhir = penguranganSaldo / hasilBungaBank;
        System.out.println("Bulan ke-" + (int)hasilAkhir + " Nasabah mendapatkan saldo Rp 1500000");
    }
}
