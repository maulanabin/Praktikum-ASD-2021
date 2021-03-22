package minggu5;
import java.util.*;
public class MainPangkat {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷"); // O(1)
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen = userInput.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + " : ");
            png[i].nilai = userInput.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + " : ");
            png[i].pangkat = userInput.nextInt();
        }
        System.out.print("\n");
        System.out.println("PILIHAN METODE PERPANGKATAN");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide & Conquer");
        System.out.println("==============================");
        System.out.print("Masukkan pilihan: ");
        int pilihan = userInput.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷"); // O(1)
                System.out.println("Hasil Pangkat dengan Brute Force");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷"); // O(1)
                System.out.println("Hasil Pangkat dengan Divide Conquer");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                System.out.println("🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷"); // O(1
                break;
        }
        long start = System.nanoTime();
    }
}
