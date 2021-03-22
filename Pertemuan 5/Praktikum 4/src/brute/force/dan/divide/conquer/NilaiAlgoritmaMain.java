package brute.force.dan.divide.conquer;
// TI 1H_Maulana Bintang Irfansyah_16_2041720132
import java.util.Scanner;
public class NilaiAlgoritmaMain {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double rata2 = 0;
        System.out.println("🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹");
        System.out.println("\tProgram Menghitung Rata-rata Nilai Mahasiswa");
        System.out.println("🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹");
        System.out.print("Masukkan banyak mahasiswa: ");
        int banyakMahasiswa = userInput.nextInt(); userInput.nextLine();
        System.out.print("\n");
        System.out.println("🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹");
        NilaiAlgoritma[] nilaiMahasiswa = new NilaiAlgoritma[banyakMahasiswa];
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.println("\t\t\t\t>>Mahasiswa ke-" + (i + 1) + "<<");
            System.out.print("Masukkan nama\t\t\t: ");
            String namaMahasiswa = userInput.nextLine();
            System.out.print("Masukkan nilai tugas\t: ");
            int valueOfAssignment = userInput.nextInt();
            System.out.print("Masukkan nilai kuis\t\t: ");
            int valueOfQuiz = userInput.nextInt();
            System.out.print("Masukkan nilai UTS\t\t: ");
            int valueOfUTS = userInput.nextInt();
            System.out.print("Masukkan nilai UAS\t\t: ");
            int valueOfUAS = userInput.nextInt();
            userInput.nextLine();
            System.out.println("🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹");
            nilaiMahasiswa[i] = new NilaiAlgoritma(namaMahasiswa, valueOfAssignment, valueOfQuiz, valueOfUTS, valueOfUAS);
        }
        System.out.println("\t\t>>Nilai Total Mahasiswa<<");
        for (NilaiAlgoritma mahasiswa : nilaiMahasiswa) {
            System.out.println("Nama\t\t: " + mahasiswa.namaMahasiswa);
            System.out.println("Nilai total\t: " + mahasiswa.hitungTotalNilai());
            System.out.println("🔸 🔸 🔸 🔸 🔸 🔸 🔸 🔸 🔸 🔸 🔸 🔸 🔸 🔸 🔸 🔸 🔸 🔸");
            rata2 += mahasiswa.hitungTotalNilai();
        }
        System.out.printf("Rata-rata nilai seluruh mahasiswa\t: " + "%.2f", (rata2 / nilaiMahasiswa.length));
    }
}
