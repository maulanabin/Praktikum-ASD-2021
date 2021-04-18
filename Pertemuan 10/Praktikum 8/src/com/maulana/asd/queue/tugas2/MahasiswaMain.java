package com.maulana.asd.queue.tugas2;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan jumlah kapasitas queue: ");
        int kapasitas = userInput.nextInt();

        Queue antri = new Queue(kapasitas);

        int pilih;
        do {
            menu();
            pilih = userInput.nextInt();
            userInput.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM\t\t: ");
                    String nimMhs = userInput.nextLine();
                    System.out.print("Nama\t: ");
                    String namaMhs = userInput.nextLine();
                    System.out.print("Absen\t: ");
                    int absenMhs = userInput.nextInt();
                    System.out.print("IPK\t\t: ");
                    double ipkMhs = userInput.nextDouble();
                    Mahasiswa mhs = new Mahasiswa(nimMhs, namaMhs, absenMhs, ipkMhs);
                    userInput.nextLine();
                    antri.Enqueue(mhs);
                    break;
                case 2:
                    Mahasiswa data = antri.Dequeue();
                    if (!"".equals(data.nim) && !"".equals(data.nama) &&  data.absen != 0 && data.ipk != 0.0);
                    System.out.println("Antrian yang keluar: " + data.nim + " " + data.nama +
                            " " + data.absen + " " + data.ipk);
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
                case 6:
                    System.out.print("Masukkan NIM yang ingin diketahui antriannya: ");
                    String cariNim = userInput.nextLine();
                    antri.peekPosition(cariNim);
                    break;
                case 7:
                    System.out.print("Masukkan posisi antrian yang ingin diketahui datanya : ");
                    int pos = userInput.nextInt();
                    antri.printMahasiswa(pos);//
                    break;
                default:
                    System.out.println("Nomor yang Anda masukkan salah!");
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7); // while (pilih > 0 || pilih < 5);

    }
    public static void menu() {
        System.out.println("\nMasukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Peek Rear");
        System.out.println("6. Peek Position");
        System.out.println("7. Peek At");
        System.out.println("--------------------");
    }
}
