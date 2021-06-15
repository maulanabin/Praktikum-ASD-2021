package com.maulana.tugas2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SistemInformasiAkademik {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Mahasiswa mhs1 = new Mahasiswa("20001", "Maya", "081xxx");
        Mahasiswa mhs2 = new Mahasiswa("20002", "Akbar", "082xxx");
        Mahasiswa mhs3 = new Mahasiswa("20003", "Citra", "083xxx");
        Mahasiswa mhs4 = new Mahasiswa("20004", "Bina", "084xxx");
        Mahasiswa mhs5 = new Mahasiswa("20005", "Irfan", "085xxx");
        Mahasiswa mhs6 = new Mahasiswa("20006", "Fansyah", "086xxx");

        MataKuliah mk1 = new MataKuliah("00001", "Manajemen Jaringan", "2");
        MataKuliah mk2 = new MataKuliah("00002","Keamanan Jaringan", "2");
        MataKuliah mk3 = new MataKuliah("00003", "Jaringan Komputer", "2");
        MataKuliah mk4 = new MataKuliah("00004", "Rekayasa Jaringan", "2");
        MataKuliah mk5 = new MataKuliah("00005", "Teknologi Jaringan", "2");

        ArrayList<Mahasiswa> arrayListMhs = new ArrayList<>();
        ArrayList<MataKuliah> arrayListMk = new ArrayList<>();
        ArrayList<Nilai> arrayListN = new ArrayList<>();

        arrayListMhs.add(mhs1);
        arrayListMhs.add(mhs2);
        arrayListMhs.add(mhs3);
        arrayListMhs.add(mhs4);
        arrayListMhs.add(mhs5);
        arrayListMhs.add(mhs6);

        arrayListMk.add(mk1);
        arrayListMk.add(mk2);
        arrayListMk.add(mk3);
        arrayListMk.add(mk4);
        arrayListMk.add(mk5);

        arrayListMhs.stream().forEach(matkul -> System.out.println("" + matkul.toString()));
        int pilih = 0;
        do {
            try {
                System.out.println();
                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                System.out.println("SISTEM PENGOLAHAN NILAI MAHASISWA SEMESTER");
                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                System.out.println("\t\t\t\t>> Pilihan Menu <<");
                System.out.println("1. Input Nilai");
                System.out.println("2. Tampil Nilai");
                System.out.println("3. Mencari Nilai Mahasiswa");
                System.out.println("4. Urut Data Nilai");
                System.out.println("5. Keluar");
                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                System.out.print("Pilihan Anda: ");
                pilih = Integer.parseInt(userInput.nextLine());
                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                switch (pilih) {
                    case 1:
                        System.out.println("\t\t\tMasukkan Data");
                        System.out.print("Nilai\t: ");
                        double nilai = userInput.nextDouble();
                        System.out.println("\t\tDAFTAR MAHASISWA");
                        System.out.println("⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐");
                        System.out.println("NIM\t\t\tNama\t\t\tTelp");
                        for (Mahasiswa mahasiswa : arrayListMhs) {
                            System.out.println(mahasiswa.nim + "\t\t" + mahasiswa.nama + "\t\t\t" + mahasiswa.noTelepon);
                        }
                        System.out.print("Pilih Mahasiswa by NIM: ");
                        String nim = userInput.next(); userInput.nextLine();
                        System.out.println("\n\t\tDAFTAR MATA KULIAH");
                        System.out.println("⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐");
                        System.out.println("Kode\t\tMata Kuliah\t\t\t\tSKS");
                        for (MataKuliah matkul : arrayListMk) {
                            System.out.println(matkul.kode + "\t\t" + matkul.mataKuliah + "\t\t" + matkul.sks);
                        }
                        System.out.print("Pilih MK by Kode: ");
                        String kode = userInput.nextLine();
                        int idxMhs = Collections.binarySearch(arrayListMhs, new Mahasiswa(nim,null,null), Mahasiswa.MhsNimCom);
                        int idxMk = Collections.binarySearch(arrayListMk, new MataKuliah(kode, null, null), MataKuliah.ComMkKode);
                        Nilai value = new Nilai(arrayListMhs.get(idxMhs), arrayListMk.get(idxMk), nilai);
                        arrayListN.add(value);
                        break;
                    case 2:
                        System.out.println("\t\tDAFTAR NILAI MAHASISWA");
                        System.out.println("⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐");
                        System.out.println("NIM\t\tNama\t\tMata Kuliah\t\t\t\tSKS\t\tNilai");
                        for (Nilai nilaiMhs : arrayListN) {
                            System.out.println(nilaiMhs.mahasiswa.nim + "\t" + nilaiMhs.mahasiswa.nama + "\t\t" + nilaiMhs.mk.mataKuliah + "\t\t" + nilaiMhs.mk.sks + "\t\t" + nilaiMhs.nilai);
                        }
                        break;
                    case 3:
                        System.out.println("\t\tDAFTAR NILAI MAHASISWA");
                        System.out.println("⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐");
                        System.out.println("NIM\t\tNama\t\tMata Kuliah\t\t\t\tSKS\t\tNilai");
                        for (Nilai nilaiMhs : arrayListN) {
                            System.out.println(nilaiMhs.mahasiswa.nim + "\t" + nilaiMhs.mahasiswa.nama + "\t\t" + nilaiMhs.mk.mataKuliah + "\t\t" + nilaiMhs.mk.sks + "\t\t" + nilaiMhs.nilai);
                        }
                        System.out.print("Masukkan data mahasiswa[NIM]: ");
                        String cariNim = userInput.nextLine();
                        int sks = 0;
                        System.out.println("NIM\t\tNama\t\tMata Kuliah\t\t\t\tSKS\t\tNilai");
                        for (Nilai nilaiMhs : arrayListN) {
                            if (nilaiMhs.mahasiswa.nim.equals(cariNim)) {
                                sks += Integer.parseInt(nilaiMhs.mk.sks);
                                System.out.println(nilaiMhs.mahasiswa.nim + "\t" + nilaiMhs.mahasiswa.nama + "\t\t" + nilaiMhs.mk.mataKuliah + "\t\t" + nilaiMhs.mk.sks + "\t\t" + nilaiMhs.nilai);
                            }
                        }
                        System.out.println("Total SKS = " + sks + " telah diambil.");
                        break;
                    case 4:
                        arrayListN.sort(Nilai.ComNilai);
                        System.out.println("\t\tDAFTAR NILAI MAHASISWA");
                        System.out.println("⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐");
                        System.out.println("NIM\t\tNama\t\tMata Kuliah\t\t\t\tSKS\t\tNilai");
                        for (Nilai nilaiMhs : arrayListN) {
                            System.out.println(nilaiMhs.mahasiswa.nim + "\t" + nilaiMhs.mahasiswa.nama + "\t\t" + nilaiMhs.mk.mataKuliah + "\t\t" + nilaiMhs.mk.sks + "\t\t" + nilaiMhs.nilai);
                        }
                        break;
                    case 5:
                        System.out.println("Anda telah keluar");
                        System.out.println("== Terima Kasih ==");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan salah!");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
        } while (pilih > 0 && pilih <= 5);
    }
}
