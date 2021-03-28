package com.maulana.tugas1;

public class PencarianMhs {
    Mahasiswa[] listMhs = new Mahasiswa[5];
    public int idx;

    public void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }
    public void tampil() {
        for (Mahasiswa m : listMhs) {
            m.tampil();
            System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼");
        }

    }
    public void selectionSort() {
        for (int i = 0; i < listMhs.length; i++) {
            int idx = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].nim < listMhs[idx].nim) {
                    idx = j;
                }
            }
            Mahasiswa temp = listMhs[idx];
            listMhs[idx] = listMhs[i];
            listMhs[i] = temp;
        }
    }
//    public int FindSeqSearch(int cariMhs) {
//        int posisi = -1;
//        for (int j = 0; j < listMhs.length; j++) {
//            if (listMhs[j].nim == cariMhs) {
//                posisi = j;
//                break;
//            }
//        }
//        return posisi;
//    }
    public int FindBinarySearch(int cariMhs, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cariMhs == listMhs[mid].nim) {
                return (mid);
            } else if (listMhs[mid].nim < cariMhs) {
                return FindBinarySearch(cariMhs, left, mid - 1);
            } else {
                return FindBinarySearch(cariMhs, mid + 1, right);
            }
        }
        return -1;
    }
    public void TampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data: " + x + " ditemukan pada indeks ke-" + pos);
        } else {
            System.out.println("Data " + x + "tidak ditemukan");
        }

    }
    public void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("NIM\t\t: " + x);
            System.out.println("Nama\t: " + listMhs[pos].nama);
            System.out.println("Umur\t: " + listMhs[pos].umur);
            System.out.println("IPK\t\t: " + listMhs[pos].ipk);
        } else {
            System.out.println("Data " + x + "tidak ditemukan");
        }
    }
}
