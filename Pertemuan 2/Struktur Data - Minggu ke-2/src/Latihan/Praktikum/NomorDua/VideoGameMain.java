package Latihan.Praktikum.NomorDua;
// Maulana Bintang Irfansyah_TI-1H_2041720132
import java.util.Scanner;

public class VideoGameMain {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        VideoGame member = new VideoGame();
        VideoGame lamaPeminjaman = new VideoGame();
        VideoGame nomorID = new VideoGame();
        VideoGame tampilData = new VideoGame();
        VideoGame game1 = new VideoGame("Harvest Moon", 11, 10000);
        VideoGame game2 = new VideoGame("Sally's Salon", 22, 15000);
        VideoGame game3 = new VideoGame("Cooking Mama", 33, 20000);
        VideoGame game4 = new VideoGame("Farm Frenzy 2", 44, 25000);

        System.out.print("Masukkan nama member: ");
        member.namaMember = userInput.nextLine();
        System.out.print("\n");
        System.out.println("🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 Cimoy Game Store 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹");
        System.out.println("+++++++++++++++++++++++++ Toko Persewaan Video Game +++++++++++++++++++++++++++");
        System.out.println("🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹  🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹");
        System.out.println("-------------------- Data Game 1 -------------------");
        System.out.println("Nama game\t\t\t\t: " + game1.namaGame);
        System.out.println("Nomor ID game\t\t\t: " + game1.idGame);
        System.out.println("Harga sewa per hari \t: " + game1.hargaSewa);
        System.out.println("-------------------- Data Game 2 -------------------");
        System.out.println("Nama game\t\t\t\t: " + game2.namaGame);
        System.out.println("Nomor ID game\t\t\t: " + game2.idGame);
        System.out.println("Harga sewa per hari \t: " + game2.hargaSewa);
        System.out.println("-------------------- Data Game 3 -------------------");
        System.out.println("Nama game\t\t\t\t: " + game3.namaGame);
        System.out.println("Nomor ID game\t\t\t: " + game3.idGame);
        System.out.println("Harga sewa per hari \t: " + game3.hargaSewa);
        System.out.println("-------------------- Data Game 4 -------------------");
        System.out.println("Nama game\t\t\t\t: " + game4.namaGame);
        System.out.println("Nomor ID game\t\t\t: " + game4.idGame);
        System.out.println("Harga sewa per hari \t: " + game4.hargaSewa);
        System.out.print("\n");
        System.out.print("Masukkan ID Game\t\t: ");
        nomorID.idGame = userInput.nextInt();
        System.out.print("Masukkan lama peminjaman: ");
        lamaPeminjaman.lamaPinjam = userInput.nextInt();

        VideoGame pilihanGame = new VideoGame();
        if (nomorID.idGame == game1.idGame) {
            pilihanGame = game1;
        } else if (nomorID.idGame == game2.idGame) {
            pilihanGame = game2;
        } else if (nomorID.idGame == game3.idGame) {
            pilihanGame = game3;
        } else if (nomorID.idGame == game4.idGame) {
            pilihanGame = game4;
        } else {
            System.out.println("ID Game yang dimasukkan salah!");
        }
        tampilData.tampilDataPinjaman(pilihanGame, member.namaMember, lamaPeminjaman.lamaPinjam);

    }
}

