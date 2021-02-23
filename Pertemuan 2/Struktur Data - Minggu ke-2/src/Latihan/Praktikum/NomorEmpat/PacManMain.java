package Latihan.Praktikum.NomorEmpat;
// Maulana Bintang Irfansyah_TI-1H_2041720132

import java.util.Scanner;
public class PacManMain {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Emoticon > [😸] sebagai Pac-Man");
        System.out.println("Cara bermain adalah menggunakan huruf (w, a, s, d) di keyboard");
        System.out.println("w = Atas | s = Bawah | a = Kiri | d = Kanan");
        System.out.println("Tekan huruf (q) untuk keluar dari permainan (quit)");

        PacMan game = new PacMan(0, 0, 10, 10);
        System.out.println("Lebar arena permainan: " + game.width);
        // Menampilkan arena permainan Pac Man
        PacMan.tampilArena(game.x, game.y, game.width, game.height);
        // Di bawah ini merupakan bagian controlling
        char arah = 'c';
        while (arah != 'q') {
            System.out.print("Masukkan huruf agar Pac-Man bergerak: ");
            arah = userInput.next().charAt(0);
            switch (arah) {
                case 'w':
                    game.moveUp();
                    break;
                case 's':
                    game.moveDown();
                    break;
                case 'a':
                    game.moveLeft();
                    break;
                case 'd':
                    game.moveRight();
                    break;
                default:
                    System.out.print("\n");
            }
        }
    }
}
