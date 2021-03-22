package minggu5;

public class Pangkat {
    public int nilai, pangkat;


//    public Pangkat(int nilai, int pangkat) {
//        this.nilai = nilai;
//        this.pangkat = pangkat
//    }

    public int pangkatBF(int a, int n) {
        int hasil = 1; // O(1)
        for (int i = 0; i < n; i++) { // O(n)
            hasil = hasil * a; // O(1)
        }
        return hasil; // O(1)
    }
    public int pangkatDC(int a, int n) {
        if (n == 0) { // O(1)
            return 1; // O(1)
        } else {
            if (n % 2 == 1) { // bilangan ganjil
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a ); // O(2^k)
            } else { // bilangan genap
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2)); // O(2^k)
            }
        }
    }
}
