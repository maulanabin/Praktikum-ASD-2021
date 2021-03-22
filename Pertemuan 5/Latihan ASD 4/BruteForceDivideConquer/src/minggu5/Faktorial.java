package minggu5;

public class Faktorial {
    public int nilai;

    public int faktorialBF(int n) {
        int fakto = 1; // O(1) // variabel tempat menyimpan nilai faktorial, default 1
        for (int i = 1; i <= n; i++) { // O(n)
            fakto = fakto * i; // O(1)
        }
        return fakto; // O(1)
        // Notasi Big O Brute Force
        // O(1+n+1+1)
        // O(1+n+2)
        // O(3n)
        // O(n)
    }
    public int faktorialWhile(int n) {
        int fakto = 1;
        int i = 1;
        while (i <= n) {
            fakto = fakto * i;
            i++;
        }
        return fakto;

    }
    public int faktorialDC(int n) {
        if (n == 1) { // O(1)
            return 1; // O(1)
        } else {
            int fakto = n * faktorialDC(n - 1); // O(1)
            return fakto; // O(1)
        }
        // Notasi Big O Divide and Conquer
        // O(1+1+1+1)
        // O(4)
        // O(1)
    }
}
