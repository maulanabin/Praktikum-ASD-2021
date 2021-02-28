package ASD.NilaiMahasiswa;
// Maulana Bintang Irfansyah_TI-1H_2041720132
import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼");
        System.out.println("\t Program Data Informasi Mahasiswa");
        System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼");
        System.out.print("Masukkan jumlah mahasiswa: ");
        int banyakMahasiswa = userInput.nextInt();
        System.out.print("\n");

        Mahasiswa[] dataMahasiswa = new Mahasiswa[banyakMahasiswa];
        Mahasiswa.inputDataMahasiswa(dataMahasiswa);
        Mahasiswa.tampilDataMahasiswa(dataMahasiswa);
        System.out.println("IPK rata-rata seluruh mahasiswa: " + Mahasiswa.hitungTotalNilai((dataMahasiswa)));


    }
}
