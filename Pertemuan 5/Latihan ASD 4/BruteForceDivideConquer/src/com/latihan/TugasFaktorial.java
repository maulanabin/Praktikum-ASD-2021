package com.latihan;

public class TugasFaktorial {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public int nilai;

    public int faktorialBF(int n) {
        int fakto = 1; // O(1) // variabel tempat menyimpan nilai faktorial, default 1
        for (int i = 1; i <= n; i++) { // O(n)
            fakto = fakto * i; // O(1)
        }
        return fakto; // O(1)
        // Notasi Big O Brute Force
        // O(1+n+1+1)
        // O(1+n+2)
        // O(3n)
        // O(n)

    }
    public int faktorialDC(int n) {
        if (n == 1) { // O(1)
            return 1; // O(1)
        } else {
            int fakto = n * faktorialDC(n - 1); // O(1)
            return fakto; // O(1)
        }
        // Notasi Big O Divide and Conquer
        // O(1+1+1+1)
        // O(4)
        // O(1)
    }

    public static void main(String[] args) {
        System.out.println("🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷"); // O(1)
        System.out.print("Masukkkan jumlah elemen yang ingin dihitung: "); // O(1)
        int elemen = sc.nextInt();  // O(1)

        TugasFaktorial[] fk = new TugasFaktorial[elemen];  // O(1)
        for (int i = 0; i < elemen; i++) {  // O(n)
            fk[i] = new TugasFaktorial();  // O(1)
            System.out.print("Masukkan nilai data ke-" + (i + 1) + " : "); // O(1)
            fk[i].nilai = sc.nextInt(); // O(1)
        }
        System.out.println("🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷"); // O(1)
        System.out.println("Hasil Faktorial dengan Brute Force"); // O(1)
        for (int i =0; i < elemen; i++) {  // O(n)
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBF(fk[i].nilai)); // O(1)
        }
        System.out.println("🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷"); // O(1)
        System.out.println("Hasil Faktorial dengan Divide and Conquer"); // O(1)
        for (int i =0; i < elemen; i++) { // O(n)
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialDC(fk[i].nilai)); // O(1)
        }
        System.out.println("🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷"); // O(1)
        double start = System.nanoTime();
        double end = System.nanoTime();
        double execution = end - start;
        System.out.println("Waktu eksekusi adalah: " + execution + " detik");
    }
}
