package brute.force.dan.divide.conquer;
// TI 1H_Maulana Bintang Irfansyah_16_2041720132
import java.util.*;
public class MainKetuaBEM {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan banyak kandidat mahasiswa: ");
        int banyakKandidat = userInput.nextInt();

        PemilihanKetuaBEM[] kandidat = new PemilihanKetuaBEM[banyakKandidat];
        int jumlahSuara = 0;
        int nomorPilihMayoritas = -1;
        for (int i = 0; i < kandidat.length; i++) {
            System.out.println("Nomor Urut\t\t: " + (i + 1));
            System.out.print("Nama\t\t\t: ");
            String namaKandidat = userInput.next();
            userInput.nextLine();
            System.out.print("Program Studi\t: ");
            String programStudi = userInput.nextLine();
            System.out.println("🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹");
            kandidat[i] = new PemilihanKetuaBEM(namaKandidat, programStudi);
            System.out.print("\n");
        }
        while (true) {
            boolean isNomorPilihValid;
            int nomorPilih;

            System.out.print("Suara ke-" + (jumlahSuara + 1) + " memilih kandidat nomor: ");
            nomorPilih = userInput.nextInt();
            userInput.nextLine();
            if (nomorPilih == 0) {
                break;
            }
            System.out.println("🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹");
            isNomorPilihValid = (nomorPilih >= 1) && (nomorPilih <= kandidat.length);
            if (isNomorPilihValid) {
                jumlahSuara++;
                kandidat[nomorPilih - 1].jumlahPengikut++;
            } else {
                System.out.println("\n>>> Salah nomor pilih! <<<\n");
            }
        }
        System.out.println("\nTotal suara: " + jumlahSuara);
        System.out.print("\n");
        for (PemilihanKetuaBEM kandidatMahasiswa : kandidat) {
            System.out.println(kandidatMahasiswa.namaKandidat + "\t| " + kandidatMahasiswa.programStudi +
                    " (" + kandidatMahasiswa.jumlahPengikut + " suara)");
        }
        System.out.print("\n");
        for (int i = 0; i < kandidat.length; i++) {
            if (kandidat[i].jumlahPengikut > jumlahSuara / 2) {
                nomorPilihMayoritas = i;
                break;
            }
        }
        System.out.println("==================================================");
        System.out.println((nomorPilihMayoritas >= 0) ? "Mayoritas: " + kandidat[nomorPilihMayoritas].namaKandidat + " | "
                + kandidat[nomorPilihMayoritas].programStudi+ " (" + kandidat[nomorPilihMayoritas].jumlahPengikut + " suara)" : "No-mayoritas");

    }
}
