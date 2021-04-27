package com.maulana.tugas5;
import java.util.Scanner;
public class Main {
    static Scanner userInput = new Scanner(System.in);
    static Queue data = new Queue();

    public static void main(String[] args) {
        menuNasabah();
    }
    public static void menuNasabah(){
        System.out.println("🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹");
        System.out.println("\t\t>>Pilihan Menu<<");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print All");
        System.out.println("4. Peek");
        System.out.println("5. Peek Position");
        System.out.println("6. Peek Rear");
        System.out.println("7. Keluar Program");
        System.out.println("🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹");
        System.out.print("Masukkan pilihan Anda: ");
        int pilih;
        pilih = userInput.nextInt();
        userInput.nextLine();

        switch(pilih){
            case 1:
                addData();
                menuNasabah();
                break;
            case 2:
                data.Dequeue();
                menuNasabah();
            case 3:
                data.print();
                menuNasabah();
                break;
            case 4:
                data.peek();
                menuNasabah();
                break;
            case 5:
                System.out.print("Masukkan No. Rekening: ");
                String position = userInput.nextLine();
                data.peekPosition(position);
                menuNasabah();
                break;
            case 6:
                data.peekRear();
                menuNasabah();
                break;
            default:
                System.out.println("Keluar program...");
        }
    }
    public static void addData(){
        String noRekening, nama, alamat;
        System.out.println("🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹");
        System.out.print("Masukkan No. Rekening\t:");
        noRekening = userInput.nextLine();
        System.out.print("Masukkan Nama\t\t\t: ");
        nama = userInput.nextLine();
        System.out.print("Masukkan Alamat\t\t\t: ");
        alamat = userInput.nextLine();
        System.out.println("🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹");
        Nasabah nb = new Nasabah(noRekening, nama, alamat);
        data.Enqueue(nb);
    }
}
