package com.my.company.bubbleselectioninsertion;

public class DaftarMahasiswaBerprestasi {
        Mahasiswa[] listMhs = new Mahasiswa[5];
        int idx;

        public void tambah (Mahasiswa mhs){
            if (idx < listMhs.length) {
                listMhs[idx] = mhs;
                idx++;;
            } else {
                System.out.println("Data sudah penuh: ");
            }
        }
        public void tampil() {
            for (Mahasiswa mhs : listMhs) {
                mhs.tampil();
                System.out.println("==========================");
            }
        }
        public void bubbleSort() {
            for (int i = 0; i < listMhs.length; i++) {
                for (int j = 1; j < listMhs.length; j++) {
                    if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                        Mahasiswa temporary = listMhs[j];
                        listMhs[j] = listMhs[j - 1];
                        listMhs[j - 1] = temporary;
                    }
                }
            }
        }
        // Ascending yaitu data yang diurutkan dari terkecil ke terbesar
        public void selectionSort() {
            for (int i = 0; i < listMhs.length; i++) {
                int idxMin = i;
                for (int j = i + 1; j < listMhs.length; j++) {
                    if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                        idxMin = j;
                    }
                }
                // swap
                Mahasiswa temporary = listMhs[idxMin];
                listMhs[idxMin] = listMhs[i];
                listMhs[i] = temporary;

            }
        }
        // Ascending yaitu data yang diurutkan dari terkecil ke terbesar
        public void insertionSort() {
            for (int i = 1; i < listMhs.length; i++) {
                Mahasiswa temporary = listMhs[i];
                int j = i;
                while(j > 0 && listMhs[j - 1].ipk > temporary.ipk) {
                    listMhs[j] = listMhs[j - 1];
                    j--;
                }
                listMhs[j] = temporary;
            }
        }
}

