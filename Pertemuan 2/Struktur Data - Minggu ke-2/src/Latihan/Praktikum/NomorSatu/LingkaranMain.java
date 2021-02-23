package Latihan.Praktikum.NomorSatu;
// Maulana Bintang Irfansyah_TI-1H_2041720132

public class LingkaranMain {
    public static void main(String[] args) {
        Lingkaran circle = new Lingkaran(3.14, 7);
        double luas = circle.hitungLuas();
        double keliling = circle.hitungKeliling();
        System.out.println("+++ Program Menghitung Luas dan Keliling Lingkaran +++");
        System.out.println("Luas lingkaran adalah\t\t: " + luas);
        System.out.println("Keliling lingkaran adalah\t: " + keliling);

    }
}
