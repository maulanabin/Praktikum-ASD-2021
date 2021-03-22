package minggu5;
import java.util.*;
public class MainFaktorial {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); // O(1)
        System.out.println("🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷"); // O(1)
        System.out.print("Masukkkan jumlah elemen yang ingin dihitung: "); // O(1)
        int elemen = userInput.nextInt();  // O(1)

        Faktorial[] fk = new Faktorial[elemen];  // O(1)
        for (int i = 0; i < elemen; i++) {  // O(n)
            fk[i] = new Faktorial();  // O(1)
            System.out.print("Masukkan nilai data ke-" + (i + 1) + " : "); // O(1)
            fk[i].nilai = userInput.nextInt(); // O(1)
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
        // Notasi Big O
        // O(1+1+1+1+1+n*1*1*1+1+1+n*1+1+1+n*1+1)
        // O(5+n+2+n+2+n+1)
        // O(10+n+n+n)
        // O(n)
        System.out.println("🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷 🌷"); // O(1)
        System.out.println("Hasil Faktorial dengan Brute Force"); // O(1)
        for (int i =0; i < elemen; i++) {  // O(n)
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialWhile(fk[i].nilai)); // O(1)
        }
    }
}
