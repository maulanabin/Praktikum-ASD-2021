package minggu5;
import java.util.*;
public class MainSum {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷"); // O(1)
        System.out.println("Program Menghitung Total Keuntungan Perusahaan");
        System.out.print("Masukkan jumlah bulan: ");
        int elm = userInput.nextInt();

        Sum sm = new Sum(elm);
        System.out.println("🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷"); // O(1)
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukkan untung  bulan ke-" + (i + 1) + " = ");
            sm.keuntungan[i] = userInput.nextDouble();
        }
        System.out.println("🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷"); // O(1)
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalBF(sm.keuntungan));
        System.out.println("🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷"); // O(1)
        System.out.println("Algoritma Divide and Conquer");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
        System.out.println("🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷"); // O(1)
    }
}
