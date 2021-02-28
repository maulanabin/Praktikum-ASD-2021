package ASD.ProgramTanah;
// Maulana Bintang Irfansyah_TI-1H_2041720132
import java.util.Scanner;

public class TanahMain {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘");
        System.out.println("\tProgram Menghitung Luas Tanah");
        System.out.println("☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘ ☘");
        System.out.print("Masukkan jumlah tanah: ");
        int banyakTanah = userInput.nextInt();
        Tanah[] arrTanah = new Tanah[banyakTanah];

        for (int x = 0; x < arrTanah.length; x++) {
            System.out.println("Tanah\t: " + (x + 1));
            System.out.print("Panjang\t: ");
            double panjangTanah = userInput.nextDouble();
            System.out.print("Lebar\t: ");
            double lebarTanah = userInput.nextDouble();
            arrTanah[x] = new Tanah(panjangTanah, lebarTanah);
            System.out.println("------------------------");
        }
        System.out.print("\n");
        for (int y = 0; y < arrTanah.length; y++) {
            System.out.println("Luas tanah ke-" + (y + 1) + "\t= " + arrTanah[y].hitungLuasTanah() + " m2");
        }
    }
}
