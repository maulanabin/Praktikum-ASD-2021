package Latihan.Praktikum.NomorEmpat;
// Maulana Bintang Irfansyah_TI-1H_2041720132

public class PacMan {
    // Di bawah ini merupakan kelas untuk membuat PacMan
    int x, y, width, height;
    // constructor
    PacMan(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    // bergerak ke atas
    public void moveUp() {
        y -= 1;
        // Bertujuan jika si pacman sampai di pinggir, tidak mengakibatkan keluar arena
        if (y == -1) {
            y = 0;
        }
        tampilArena(x, y, width, height);
    }
    // bergerak ke bawah
    public void moveDown() {
        y += 1;
        tampilArena(x, y, width, height);
    }
    // bergerak ke kiri
    public void moveLeft() {
        x -= 1;
        // Bertujuan jika si pacman sampai di pinggir, tidak mengakibatkan keluar arena
        if ( x == -1) {
            x = 0;
        }
        tampilArena(x, y, width, height);
    }
    // bergerak ke kanan
    public void moveRight() {
        x += 1;
        tampilArena(x, y, width, height);
    }
    // Menampilkan arena dan posisi permainan
    static void tampilArena(int x, int y, int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (x == j && y == i) {
                    System.out.println("😸 ");
                } else {
                    System.out.print(" .");
                }
            }
            System.out.print("\n");
        }
    }
}
