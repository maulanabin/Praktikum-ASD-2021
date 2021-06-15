package com.maulana.referenceprogram;
import java.util.Scanner;
import java.util.Stack;

public class Perpustakaan {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Stack<Buku> stack = new Stack<Buku>();
        String isbn;
        String judul;
        String terbit;
        String penerbit;
        Buku b1 = new Buku("202100001", "Sistem Jaringan Komputer", "2018","Andi Publisher");
        Buku b2 = new Buku("202100002", "Cloud Computing","2019", "Elex Media Komputindo");
        Buku b3 = new Buku("202100003", "Network Security", "2020", "Informatics Publisher");
        stack.push(b1);
        stack.push(b2);
        stack.push(b3);

        int pilih = 0;
        do {
            try {
                System.out.println();
                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                System.out.println("\t\t\t\tData Buku Perpustakaan");
                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                System.out.println("\t\t\t\t>> Pilihan Menu <<");
                System.out.println("1. Entry Judul Buku");
                System.out.println("2. Ambil Buku Teratas");
                System.out.println("3. Cek Judul Buku Teratas");
                System.out.println("4. Info Semua Judul Buku");
                System.out.println("5. Keluar");
                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                System.out.print("Pilihan Anda: ");
                pilih = Integer.parseInt(userInput.nextLine());
                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                switch (pilih) {
                    case 1:
                        System.out.print("ISBN\t\t: ");
                        isbn = userInput.nextLine();
                        System.out.print("Judul\t\t: ");
                        judul = userInput.nextLine();
                        System.out.print("Terbit\t\t: ");
                        terbit = userInput.nextLine();
                        System.out.print("Penerbit\t: ");
                        penerbit = userInput.nextLine();
                        Buku bukuPerpus = new Buku(isbn, judul, terbit, penerbit);
                        stack.push(bukuPerpus);
                        break;
                    case 2:
                        Buku bukuPop = stack.pop();
                        System.out.println("Buku{" + "isbn = " + bukuPop.isbn + ", judul = " + bukuPop.judul + ", terbit = " + bukuPop.terbit + ", penerbit = " + bukuPop.penerbit + "}");
                        break;
                    case 3:
                        Buku bukuPeek = stack.peek();
                        System.out.println("Buku{" + "isbn = " + bukuPeek.isbn + ", judul = " + bukuPeek.judul + ", terbit = " + bukuPeek.terbit + ", penerbit = " + bukuPeek.penerbit + "}");
                        break;
                    case 4:
                        for (Buku buku : stack) {
                            System.out.println("Buku{" + "isbn = " + buku.isbn + ", judul = " + buku.judul + ", terbit = " + buku.terbit + ", penerbit = " + buku.penerbit + "}");
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
