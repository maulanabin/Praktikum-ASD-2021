package Latihan.Praktikum.NomorDua;
// Maulana Bintang Irfansyah_TI-1H_2041720132
import java.util.Scanner;

public class VideoGame {
    String namaMember, namaGame;
    int idGame, lamaPinjam, hargaSewa;

    VideoGame() {

    }
    VideoGame(String namaGame, int idGame, int hargaSewa) {
        this.namaGame = namaGame;
        this.idGame = idGame;
        this.hargaSewa = hargaSewa;
    }
    public void tampilDataPinjaman(VideoGame game, String namaMember,int lamaPinjam) {
        System.out.println(">>>Detail Peminjaman<<<");
        System.out.println("Nama Member\t\t\t: " + namaMember);
        System.out.println("Nama Game\t\t\t: " + game.namaGame);
        System.out.println("Nomor ID Game\t\t: " + game.idGame);
        System.out.println("Biaya /hari\t\t\t: " + game.hargaSewa);
        System.out.println("Lama Peminjaman\t\t: " + lamaPinjam + " hari");
        System.out.println("--------------------------");
        int biayaKeseluruhan = pembayaran(game.hargaSewa,lamaPinjam);
        System.out.println("Total yang harus dibayar: Rp " + biayaKeseluruhan);
        tampilHargaBayar(biayaKeseluruhan);

    }
    public void tampilHargaBayar(int biayaKeseluruhan) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Total bayar Rp ");
        int bayarMember = userInput.nextInt();

        if(bayarMember < biayaKeseluruhan) {
            System.out.println("Mohon maaf uang Anda tidak mencukupi" + (biayaKeseluruhan - bayarMember));
            tampilHargaBayar(biayaKeseluruhan);
        } else {
            System.out.println("Terima kasih sudah menyewa di Cimoy Game Store");
            System.out.println("Kembalian Anda: Rp " + (bayarMember - biayaKeseluruhan));
        }
    }
    public int pembayaran(int price, int lamaPinjam) {
        int biayaKeseluruhan = price * lamaPinjam;
        return biayaKeseluruhan;
    }
}
