package com.maulana.tugas2;

public class PencarianMhs {
    Mahasiswa[] listMhs = new Mahasiswa[5];
    public int idx;

    public void tambah(Mahasiswa mhs) {
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }
    public void tampil() {
        for (Mahasiswa mhs : listMhs) {
            mhs.tampil();
            System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼");
        }

    }
    public int FindSeqSearch(String cariMhs) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].nama.equalsIgnoreCase(cariMhs)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    public void TampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("data: " + x + " ditemukan pada indeks ke-" + pos);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }

    }
    public void TampilData(String x, int pos) {
        if (pos != -1) {
            System.out.println("NIM\t\t: " + x);
            System.out.println("Nama\t: " + listMhs[pos].nama);
            System.out.println("Umur\t: " + listMhs[pos].umur);
            System.out.println("IPK\t\t: " + listMhs[pos].ipk);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }
}
