package com.mycompany.jobsheet8.praktikum2;
import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = userInput.nextInt();
        Queue antri = new Queue(jumlah);
        int pilih;

        do {
            menu();
            pilih = userInput.nextInt();
            userInput.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama\t\t: ");
                    String nama = userInput.nextLine();
                    System.out.print("Kota Asal\t: ");
                    String asal = userInput.nextLine();
                    System.out.print("Kota Tujuan\t: ");
                    String tujuan = userInput.nextLine();
                    System.out.print("Jumlah Tiket: ");
                    int jml = userInput.nextInt();
                    System.out.print("Harga\t\t: ");
                    int hrg = userInput.nextInt();
                    Penumpang p = new Penumpang(nama, asal, tujuan, jml, hrg);
                    userInput.nextLine();
                    antri.Enqueue(p);
                    break;
                case 2:
                    Penumpang data = antri.Dequeue();
                    if (!"".equals(data.nama) && !"".equals(data.kotaAsal) && !"".equals(data.kotaTujuan)
                            && data.jumlahTiket != 0 && data.harga != 0);
                    System.out.println("Antrian yang keluar: " + data.nama + " " + data.kotaAsal + " "
                    + data.kotaTujuan + " " + data.jumlahTiket + " " + data.harga);
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                default:
                    System.out.println("Nomor yang Anda masukkan salah!");
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5); // while (pilih > 0 || pilih < 5);
    }
    public static void menu() {
        System.out.println("Pilih Menu: ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian Paling Belakang");
        System.out.println("----------------------------");
    }
}
