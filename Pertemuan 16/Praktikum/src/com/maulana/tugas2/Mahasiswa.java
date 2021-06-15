package com.maulana.tugas2;
import java.util.Comparator;
public class Mahasiswa {
    String nim;
    String nama;
    String noTelepon;

    public Mahasiswa (String nim, String nama, String noTelepon) {
        this.nim = nim;
        this.nama = nama;
        this.noTelepon = noTelepon;
    }
    static Comparator<Mahasiswa>MhsNimCom = new Comparator<Mahasiswa>(){
        public int compare(Mahasiswa mhs1, Mahasiswa mhs2){
            return mhs1.nim.compareTo(mhs2.nim);
        }
    };
}
