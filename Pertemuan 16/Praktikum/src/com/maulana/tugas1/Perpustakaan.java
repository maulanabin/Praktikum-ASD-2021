package com.maulana.tugas1;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Stack;

public class Perpustakaan {
    public static void main(String[] args) {
        Stack<String> bukus = new Stack<>();
        Scanner userInput = new Scanner(System.in);
        int pilih = 0;
        String isbnBuku = null, judulBuku = null, tahunTerbitBuku = null, penerbitBuku = null;
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
                        isbnBuku = userInput.nextLine();
                        System.out.print("Judul\t\t: ");
                        judulBuku = userInput.nextLine();
                        System.out.print("Terbit\t\t: ");
                        tahunTerbitBuku = userInput.nextLine();
                        System.out.print("Penerbit\t: ");
                        penerbitBuku = userInput.nextLine();
                        bukus.push(isbnBuku);
                        bukus.push(judulBuku);
                        bukus.push(tahunTerbitBuku);
                        bukus.push(penerbitBuku);
                        break;
                    case 2:
                        bukus.pop();
                        System.out.println("Buku{" + "isbn = " + isbnBuku + ", judul = " + judulBuku + ", terbit = " + tahunTerbitBuku + ", penerbit = " + penerbitBuku + "}");
                        break;
                    case 3:
                        bukus.peek();
                        System.out.println("Buku{" + "isbn = " + isbnBuku + ", judul = " + judulBuku + ", terbit = " + tahunTerbitBuku + ", penerbit = " + penerbitBuku + "}");
                        break;
                    case 4:
                        for (Iterator<String> it = bukus.iterator(); it.hasNext();) {
                            isbnBuku = it.next();
                            judulBuku = it.next();
                            tahunTerbitBuku = it.next();
                            penerbitBuku = it.next();
                            System.out.println("Buku{" + "isbn = " + isbnBuku + ", judul = " + judulBuku + ", terbit = " + tahunTerbitBuku + ", penerbit = " + penerbitBuku + "}");
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
