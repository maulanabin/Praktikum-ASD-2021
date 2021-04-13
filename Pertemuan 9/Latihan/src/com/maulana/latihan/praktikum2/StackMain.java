package com.maulana.latihan.praktikum2;
import java.util.Scanner;
public class StackMain {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Stack st = new Stack(8);

        char pilih;
        do {
            System.out.print("Judul\t\t\t: ");
            String judul = userInput.nextLine();
            System.out.print("Nama Pengarang\t: ");
            String nama = userInput.nextLine();
            System.out.print("Tahun Terbit\t: ");
            int tahun = userInput.nextInt();
            System.out.print("Jumlah Halaman\t: ");
            int jml = userInput.nextInt();
            System.out.print("Harga\t\t\t: ");
            int hrg = userInput.nextInt();

            Buku bk = new Buku(judul, nama, tahun, jml, hrg);
            System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
            pilih = userInput.next().charAt(0);
            userInput.nextLine();
            st.push(bk);
        } while (pilih == 'y');
        st.print();
        st.pop();
        st.peek();
        st.print();

    }
}
