package ASD.BangunRuang;
// Maulana Bintang Irfansyah_TI-1H_2041720132
import java.util.Scanner;

public class ArrayBangunRuang {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("😸 😸 😸 😸 😸 😸 😸 Luas & Volume Kubus 😸 😸 😸 😸 😸 😸 😸 ");
        System.out.print("Masukkan jumlah kubus: ");
        int banyakKubus = userInput.nextInt();
        Kubus[] arrKubus = new Kubus[banyakKubus];
        for (int i = 0; i < arrKubus.length; i++) {
            System.out.print("Masukkan sisi kubus ke-" + (i + 1) + " : ");
            arrKubus[i] = new Kubus(userInput.nextInt());
            System.out.println("-------------------------");
        }
        for (int j = 0; j < arrKubus.length; j++) {
            System.out.println("Kubus ke-" + (j + 1));
            System.out.println("Luas kubus ke-" + (j + 1) + " = " + arrKubus[j].hitungLuas());
            System.out.println("Volume kubus ke-" + (j + 1) + " = " + arrKubus[j].hitungVolume());
            System.out.println("-------------------------");
        }
        System.out.print("\n");
        System.out.println("😸 😸 😸 😸 😸 😸 😸 Luas & Volume Balok 😸 😸 😸 😸 😸 😸 😸 ");
        System.out.print("Masukkan jumlah balok: ");
        int banyakBalok = userInput.nextInt();
        Balok[] arrBalok = new Balok[banyakBalok];
        double panjangBalok, lebarBalok, tinggiBalok;
        for (int i = 0; i < arrBalok.length; i++) {
            System.out.print("Masukkan panjang balok ke-" + (i + 1) + ": ");
            panjangBalok = userInput.nextDouble();
            System.out.print("Masukkan lebar balok ke-" + (i + 1) + ": ");
            lebarBalok = userInput.nextDouble();
            System.out.print("Masukkan tinggi balok ke-" + (i + 1) + ": ");
            tinggiBalok = userInput.nextDouble();
            arrBalok[i] = new Balok(panjangBalok, lebarBalok, tinggiBalok);
            System.out.println("-------------------------");
        }
        for (int j = 0; j < arrBalok.length; j++) {
            System.out.println("Balok ke-" + (j + 1));
            System.out.println("Luas balok ke-" + (j + 1) + " = " + arrBalok[j].hitungLuas());
            System.out.println("Volume balok ke-" + (j + 1) + " = " + arrBalok[j].hitungVolume());
            System.out.println("-------------------------");
        }
        System.out.print("\n");
        System.out.println("😸 😸 😸 😸 😸 😸 😸 Luas & Volume Kerucut 😸 😸 😸 😸 😸 😸 😸 ");
        System.out.print("Masukkan jumlah kerucut: ");
        int banyakKerucut = userInput.nextInt();
        Kerucut[] arrKerucut = new Kerucut[banyakKerucut];
        double phiKerucut, rusuk, tinggiKerucut, sisiKerucut;
        for (int i = 0; i < arrKerucut.length; i++) {
            System.out.print("Masukkan phi (3.14) kerucut ke-" + (i + 1) + ": ");
            phiKerucut = userInput.nextDouble();
            System.out.print("Masukkan rusuk kerucut ke-" + (i + 1) + ": ");
            rusuk = userInput.nextDouble();
            System.out.print("Masukkan tinggi kerucut ke-: " + (i + 1) + ": ");
            tinggiKerucut = userInput.nextDouble();
            System.out.print("Masukkan sisi kerucut ke-: " + (i + 1) + ": ");
            sisiKerucut = userInput.nextDouble();
            arrKerucut[i] = new Kerucut(phiKerucut, rusuk, tinggiKerucut, sisiKerucut);
            System.out.println("-------------------------");
        }
        for (int j = 0; j < arrKerucut.length; j++) {
            System.out.println("Kerucut ke-" + (j + 1));
            System.out.println("Luas kerucut ke-" + (j + 1) + " = " + arrKerucut[j].hitungLuas());
            System.out.println("Volume kerucut ke-" + (j + 1) + " = " + arrKerucut[j].hitungVolume());
            System.out.println("-------------------------");
        }
        System.out.print("\n");
        System.out.println("😸 😸 😸 😸 😸 😸 😸 Luas & Volume Tabung 😸 😸 😸 😸 😸 😸 😸 ");
        System.out.print("Masukkan jumlah tabung: ");
        int banyakTabung = userInput.nextInt();
        Tabung[] arrTabung = new Tabung[banyakTabung];
        double phiTabung, jariJariTabung, tinggiTabung;
        for (int i = 0; i < arrTabung.length; i++) {
            System.out.print("Masukkan phi (3.14) tabung ke-" + (i + 1) + ": ");
            phiTabung = userInput.nextDouble();
            System.out.print("Masukkan jari - jari tabung ke-" + (i + 1) + ": ");
            jariJariTabung = userInput.nextDouble();
            System.out.print("Masukkan tinggi tabung ke-" + (i + 1) + ": ");
            tinggiTabung = userInput.nextDouble();
            arrTabung[i] = new Tabung(phiTabung, jariJariTabung, tinggiTabung);
            System.out.println("-------------------------");
        }
        for (int j = 0; j < arrTabung.length; j++) {
            System.out.println("Tabung ke-" + (j + 1));
            System.out.println("Luas tabung ke-" + (j + 1) + " = " + arrTabung[j].hitungLuas());
            System.out.println("Volume tabung ke-" + (j + 1) + " = " + arrTabung[j].hitungVolume());
            System.out.println("-------------------------");

        }
    }
}
