package com.maulana.tugas6;
import java.util.Scanner;
public class MainNasabah {
    public static void main(String[] args) {
        LinkedListsNasabah data = new LinkedListsNasabah();
        Scanner scan = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        int pil1 = 0;
        int pil2 = 0;
        String noRekening = " ";
        String nama = " ";
        String alamat = " ";
        int nilaiIndex = 0;
        try {
            do {
                menu();
                pil1 = scan.nextInt();
                switch (pil1) {
                    case 1:
                        menuTambah();
                        pil2 = scan.nextInt();
                        switch (pil2) {
                            case 1:
                                System.out.print("Masukkan No. Rekening\t:");
                                noRekening = scanStr.nextLine();
                                System.out.print("Masukkan Nama\t\t\t: ");
                                nama = scanStr.nextLine();
                                System.out.print("Masukkan Alamat\t\t\t: ");
                                alamat = scanStr.nextLine();
                                data.addFirst(noRekening, nama, alamat);
                                break;
                            case 2:
                                System.out.print("Masukkan No. Rekening\t:");
                                noRekening = scanStr.nextLine();
                                System.out.print("Masukkan Nama\t\t\t: ");
                                nama = scanStr.nextLine();
                                System.out.print("Masukkan Alamat\t\t\t: ");
                                alamat = scanStr.nextLine();
                                System.out.print("Masukkan Index\t\t\t: ");
                                nilaiIndex = scan.nextInt();
                                data.add(noRekening, nama, alamat, nilaiIndex);
                                break;
                            case 3:
                                System.out.print("Masukkan No. Rekening\t:");
                                noRekening = scanStr.nextLine();
                                data.addKey(noRekening);
                                break;
                            case 4:
                                System.out.print("Masukkan No. Rekening\t:");
                                noRekening = scanStr.nextLine();
                                System.out.print("Masukkan Nama\t\t\t: ");
                                nama = scanStr.nextLine();
                                System.out.print("Masukkan Alamat\t\t\t: ");
                                alamat = scanStr.nextLine();
                                data.addLast(noRekening, nama, alamat);
                                break;
                            default:
                                System.out.println("Pilihan Anda tidak tersedia!");
                        }
                        break;
                    case 2:
                        menuHapus();
                        pil2 = scan.nextInt();
                        switch (pil2) {
                            case 1:
                                System.out.print("Masukkan Index: ");
                                nilaiIndex = scan.nextInt();
                                data.remove(nilaiIndex);
                                break;
                            case 2:
                                System.out.print("Cari dan Hapus No. Rekening\t: ");
                                noRekening = scanStr.nextLine();
                                data.removeKey(noRekening);
                                break;
                            case 3:
                                data.removeFirst();
                                break;
                            case 4:
                                data.clear();
                                break;
                            default:
                                System.out.println("Pilihan tidak tersedia!");
                        }
                        break;
                    case 3:
                        menuCari();
                        pil2 = scan.nextInt();
                        switch (pil2) {
                            case 1:
                                System.out.print("Masukkan Index: ");
                                nilaiIndex = scan.nextInt();
                                data.get(nilaiIndex);
                                System.out.println("Data: ");
                                System.out.println("No. Rekening\t: " + data.get(nilaiIndex).noRekening);
                                System.out.println("Nama\t\t: " + data.get(nilaiIndex).nama);
                                System.out.println("Alamat\t\t: " + data.get(nilaiIndex).alamat);
                                break;
                            case 2:
                                System.out.print("Cari No. Rekening: ");
                                noRekening = scanStr.nextLine();
                                int hasil = data.getKey(noRekening);
                                if (hasil != -1) {
                                    System.out.println("Data ditemukan di index ke-" + hasil);
                                } else {
                                    System.out.println("Tidak ditemukan ");
                                }
                                break;
                            case 3:
                                System.out.println("Data: ");
                                System.out.println("No. Rekening\t: " + data.getFirst().noRekening);
                                System.out.println("Nama\t\t: " + data.getFirst().nama);
                                System.out.println("Alamat\t\t: " + data.getFirst().alamat);
                                break;
                            case 4:
                                System.out.println("Data: ");
                                System.out.println("No. Rekening\t: " + data.getLast().noRekening);
                                System.out.println("Nama\t\t: " + data.getLast().nama);
                                System.out.println("Alamat\t\t: " + data.getLast().alamat);
                                break;
                            default:
                                System.out.println("Pilihan tidak tersedia ");
                        }
                        break;
                    case 4:
                        data.print();
                        break;
                }
            } while (pil1 != 5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void menu() {
        System.out.println("=====================================");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("3. Cari");
        System.out.println("4. Print");
        System.out.println("5. Keluar");
        System.out.println("+ +");
        System.out.print("Pilih menu sesuai keinginan Anda: ");
    }
    static void menuTambah() {
        System.out.println("=====================================");
        System.out.println("1. Add First");
        System.out.println("2. Add Index");
        System.out.println("3. Add Key");
        System.out.println("4. Add Last");
        System.out.println("+ +");
        System.out.print("Pilih menu sesuai keinginan Anda: ");
    }
    static void menuHapus() {
        System.out.println("=====================================");
        System.out.println("1. Hapus Index");
        System.out.println("2. Hapus Key");
        System.out.println("3. Hapus First");
        System.out.println("4. Hapus Last");
        System.out.println("+ +");
        System.out.print("Pilih menu sesuai keinginan Anda: ");
    }
    static void menuCari() {
        System.out.println("=====================================");
        System.out.println("1. Cari Index");
        System.out.println("2. Cari Key");
        System.out.println("3. Get First");
        System.out.println("4. Get Last");
        System.out.println("+ +");
        System.out.print("Pilih menu sesuai keinginan Anda: ");
    }
}
