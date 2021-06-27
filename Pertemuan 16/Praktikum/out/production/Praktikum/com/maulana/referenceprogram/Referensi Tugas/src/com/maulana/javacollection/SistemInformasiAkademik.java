package com.maulana.javacollection;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class SistemInformasiAkademik {
    List<Mahasiswa> mhs = new ArrayList<>();
    List<MataKuliah> matkul = new ArrayList<>();
    List<Nilai> nilaiMhs = new ArrayList<>();
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        SistemInformasiAkademik obj = new SistemInformasiAkademik();
        int pilihMenu;
        obj.dataMhsDanMatkul();
        do {
            System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Keluar");
            System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
            System.out.print("Pilih No: ");
            pilihMenu = userInput.nextInt();
            switch (pilihMenu) {
                case 1:
                    obj.menuInputNilai();
                    break;
                case 2:
                    obj.menuTampilNilai();
                    break;
                case 3:
                    obj.menuCariNilai();
                    break;
                case 4:
                    obj.menuUrutData();
                    break;
                default:
                    System.out.println("Anda telah keluar dari program");
                    break;
            }
            System.out.print("\n");
        } while (pilihMenu >= 1 && pilihMenu <= 4);
    }
    public void dataMhsDanMatkul() {
        mhs.add(new Mahasiswa("20001", "Kelvin", "021xx"));
        mhs.add(new Mahasiswa("20002", "Julia", "021xxx"));
        mhs.add(new Mahasiswa("20003", "Johan", "021xxx"));
        mhs.add(new Mahasiswa("20004", "Fitri", "021xxx"));
        mhs.add(new Mahasiswa("20005", "Firda", "021xxx"));
        mhs.add(new Mahasiswa("20006", "Ferdi", "021xxx"));
        matkul.add(new MataKuliah("00001", "Manajemen Jaringan", "3"));
        matkul.add(new MataKuliah("00002", "Keamanan Jaringan","3"));
        matkul.add(new MataKuliah("00003", "Jaringan Komputer", "3"));
        matkul.add(new MataKuliah("00004", "Rekayasa Jaringan", "3"));
        matkul.add(new MataKuliah("00005", "Teknologi Jaringan", "3"));
    }
    public void menuInputNilai() {
        userInput.nextLine();
        System.out.println("Masukkan Data");
        System.out.print("Kode\t: ");
        String kode = userInput.next();
        System.out.print("Nilai\t: ");
        float nilai = userInput.nextFloat();
        System.out.println("\nDAFTAR MAHASISWA");
        System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
        System.out.println("NIM\t\t\tNama\t\tTelp");
        for (Mahasiswa dataMahasiswa : mhs) {
            System.out.println(dataMahasiswa.nim + "\t\t" + dataMahasiswa.nama + "\t\t" + dataMahasiswa.noTelpon);
        }
        boolean ditemukan = true;
        String pilihMahasiswa;
        int konfirmasi = 0;
        do {
            System.out.print("Pilih Mahasiswa by NIM: ");
            pilihMahasiswa = userInput.next();
            for (Mahasiswa dataMahasiswa : mhs) {
                if (pilihMahasiswa.equals(dataMahasiswa.nim)) {
                    ditemukan = false;
                    konfirmasi++;
                }
            }
            if (konfirmasi == 0) {
                System.out.println("NIM Mahasiswa Tidak Ditemukan!");
            }
        } while (ditemukan);
        System.out.println("\nDAFTAR MATA KULIAH");
        System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
        System.out.println("Kode\t\tMata Kuliah\t\t\t\tSKS");
        for (MataKuliah matkulMahasiswa : matkul) {
            System.out.println(matkulMahasiswa.kode + "\t\t" + matkulMahasiswa.mataKuliah + "\t\t" + matkulMahasiswa.sks);
        }
        boolean ditemukan2 = true;
        String pilihMataKuliah;
        int konfirmasi2 = 0;
        do {
            System.out.print("Pilih Mata Kuliah by Kode: ");
            pilihMataKuliah = userInput.next();
            for (MataKuliah dataMataKuliah : matkul) {
                if (pilihMataKuliah.equals(dataMataKuliah.kode)) {
                    ditemukan2 = false;
                    konfirmasi2++;
                }
            }
            if (konfirmasi == 0) {
                System.out.println("Mata Kuliah Tidak Ditemukan!");
            }
        } while (ditemukan2);
        nilaiMhs.add(new Nilai(kode, nilai, pilihMataKuliah, pilihMahasiswa));
    }
    public void menuTampilNilai() {
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
        System.out.println("NIM\t\tNama\t\t\tMata Kuliah\t\t\tSKS\t\tNilai");
        nilaiMhs.forEach(nilaiSatuan -> {
            System.out.print(nilaiSatuan.nimMhs + "\t");
            for (Mahasiswa dataMahasiswa : mhs) {
                if (dataMahasiswa.nim.equals(nilaiSatuan.nimMhs)) {
                    System.out.print(dataMahasiswa.nama + "\t\t");
                }
            }
            for (MataKuliah dataMataKuliah : matkul) {
                if (dataMataKuliah.kode.equals(nilaiSatuan.kodeMataKuliah)) {
                    System.out.print(dataMataKuliah.mataKuliah + "\t\t" + dataMataKuliah.sks + "\t\t");
                }
            }
            System.out.println(nilaiSatuan.nilai);
        });
    }
    public void menuCariNilai() {
        menuTampilNilai();
        System.out.print("Masukkan Data Mahasiswa[NIM]: ");
        String cariData = userInput.next();
        int konfirmasi3 = 0;
        System.out.println("NIM\t\tNama\t\t\tMata Kuliah\t\t\tSKS\t\tNilai");
        for (Nilai cariNilai : nilaiMhs) {
            if (cariNilai.nimMhs.equals(cariData)) {
                System.out.print(cariNilai.nimMhs + "\t");
                for (Mahasiswa dataMahasiswa : mhs) {
                    if (dataMahasiswa.nim.equals(cariNilai.nimMhs)) {
                        System.out.print(dataMahasiswa.nama + "\t\t");
                    }
                }
                for (MataKuliah dataMataKuliah : matkul) {
                    if (dataMataKuliah.kode.equals(cariNilai.kodeMataKuliah)) {
                        System.out.print(dataMataKuliah.mataKuliah + "\t\t" + dataMataKuliah.sks + "\t\t");
                    }
                }
                System.out.println(cariNilai.nilai);
                konfirmasi3++;
            }
        }
        if (konfirmasi3 == 0) {
            System.out.println("Data dengan NIM " + cariData + " tidak ditemukan!");
        }
    }
    public void menuUrutData() {
        for (int i = 0; i < nilaiMhs.size() -1; i++) {
            for (int j = 0; j < nilaiMhs.size() - i - 1; j++) {
                if (nilaiMhs.get(j).nilai > nilaiMhs.get(j + 1).nilai) {
                    float swap = nilaiMhs.get(j).nilai;
                    nilaiMhs.get(j).nilai = nilaiMhs.get(j + 1).nilai;
                    nilaiMhs.get(j + 1).nilai = swap;
                }
            }
        }
        menuTampilNilai();
    }
}
