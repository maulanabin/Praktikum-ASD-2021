package com.maulana.tugas2;
import java.util.Comparator;
public class MataKuliah {
    String kode;
    String mataKuliah;
    String sks;

    public MataKuliah (String kode, String mataKuliah, String sks) {
        this.kode = kode;
        this.mataKuliah = mataKuliah;
        this.sks = sks;
    }
    static Comparator<MataKuliah> ComMkKode = new Comparator<MataKuliah>(){
        public int compare (MataKuliah mk1, MataKuliah mk2){
            return mk1.kode.compareTo(mk2.kode);
        }
    };
}
