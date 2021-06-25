package com.maulana.uas.baru;

public class Proses {
    Kendaraan[]  kend = new Kendaraan[5];
    Pajak[] pjk = new Pajak[5];
    int kendIdx, pjkIdx;

    public void addKendaraan(Kendaraan m) {
        if(kendIdx < kend.length){
            kend[kendIdx] = m;
            kendIdx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }
    public void addPajak(Pajak m){
        if(pjkIdx < pjk.length){
            pjk[pjkIdx] = m;
            pjkIdx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }
    public void tampilKendaraan(){
        System.out.println("TNKB\t\tNama\t\tJenis\t\t\tCC\t\t\tTahun\t\t\tBulan harus bayar");
        System.out.println("----------------------------------------------------------------");
        for(Kendaraan m : kend){
            System.out.println(m.tnkb + "\t\t" + m.nama + "\t\t" + m.jenis + "\t\t" + m.cc + "\t\t" + m.tahun + "\t\t\t" + m.bulanBayar);
        }
        System.out.println("----------------------------------------------------------------");
    }
    public void tampilPajak(){
        System.out.println("Kodet\t\tNominal\t\tDenda\t\tBulan harus bayar\t\t");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        for (Pajak pajak : pjk) {
            System.out.println(pajak.kode + "\t\t" + pajak.nominal + "\t\t" + pajak.denda + "\t" + pajak.bulanBayar);
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
    public void cariData(int cari){
        System.out.println("-------------------------------------------------------------------------------------------------------");
        for (Pajak pajak : pjk) {
            if (pajak.nominal > cari) {
                System.out.println(pajak.kode + "\t\t" + pajak.nominal + "\t\t" + pajak.denda + "\t\t" + pajak.bulanBayar);
            }
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
    public void check(String cari) {
        System.out.println("-------------------------------------------------------------------------------------------------------");
        for(int i = 0; i < kend.length; i++){
            if(kend[i].tnkb.equals(cari)){
                System.out.println("TNKB\t\t: " + kend[i].tnkb);
                System.out.println("Nama\t\t: " + kend[i].nama);
                System.out.println("Kodet\t\tNominal\t\tDenda\t\tBulan harus bayar\t\t");
                System.out.println("-------------------------------------------------------------------------");
                System.out.println(pjk[i].kode + "\t\t" + pjk[i].nominal + "\t\t" + pjk[i].denda + "\t\t" + pjk[i].bulanBayar);
            }
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
    void sorting(boolean bool){
        int size = kend.length;
        for(int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < kend.length; j++) {
                if (!bool){
                    if(kend[i].nama.compareToIgnoreCase(kend[j].nama) > 0) {
                        String temp = kend[i].nama;
                        kend[i].nama = kend[j].nama;
                        kend[j].nama = temp;
                    }
                }else{
                    if (kend[i].nama.compareToIgnoreCase(kend[j].nama)<0) {
                        String temp = kend[i].nama;
                        kend[i].nama = kend[j].nama;
                        kend[j].nama = temp;
                    }
                }
            }
        }
    }
}

