package ASD.NilaiMahasiswa;
// Maulana Bintang Irfansyah_TI-1H_2041720132
import java.util.Scanner;

public class Mahasiswa {
    static Scanner userInput = new Scanner(System.in);
    public String namaMahasiswa, nim, jenisKelamin;
    public double ipkMahasiswa;

    public Mahasiswa(String namaMahasiswa, String nim, String jenisKelamin, double ipkMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipkMahasiswa = ipkMahasiswa;
    }
    public static void inputDataMahasiswa(Mahasiswa[] dataMahasiswa) {
        for (int i = 0; i < dataMahasiswa.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama\t\t\t: ");
            String namaMahasiswa = userInput.nextLine();
            System.out.print("Masukkan NIM\t\t\t: ");
            String nim = userInput.nextLine();
            System.out.print("Masukkan jenis kelamin\t: ");
            String jenisKelamin = userInput.nextLine();
            System.out.print("Masukkan IPK\t\t\t: ");
            double ipkMahasiswa = userInput.nextDouble();
            userInput.nextLine();
            System.out.println("--------------------------------");
            dataMahasiswa[i] = new Mahasiswa(namaMahasiswa, nim, jenisKelamin, ipkMahasiswa);
        }
        System.out.print("\n");
    }
    public static void tampilDataMahasiswa(Mahasiswa[] dataMahasiswa) {
        for (Mahasiswa data : dataMahasiswa) {
            System.out.println("Nama\t\t\t: " + data.namaMahasiswa);
            System.out.println("NIM\t\t\t\t: " + data.nim);
            System.out.println("Jenis Kelamin\t: " + data.jenisKelamin);
            System.out.println("IPK\t\t\t\t: " + data.ipkMahasiswa);
            System.out.println("--------------------------------");
        }
    }
    public static double hitungTotalNilai(Mahasiswa[] dataMahasiswa) {
        double total = 0.0;
        for (Mahasiswa mhs : dataMahasiswa) {
            total += mhs.ipkMahasiswa;
        }
        return total / dataMahasiswa.length;
    }
}
