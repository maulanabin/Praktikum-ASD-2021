package com.maulana.java.algoritmastrukturdata;
import java.util.Scanner;

public class LatihanKeempat {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan jumlah deret fibonacci: ");
        int deretFibonacci = userInput.nextInt();
        int[] fibonacci = new int[deretFibonacci];
        fungsiDeretFibonacci(deretFibonacci, fibonacci);
        //System.out.println("-------------------------------------");
        int i, j = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah deret bilangan fibonacci: ");
        int n = scan.nextInt();
        System.out.println("Hasil bilangan fibonacci: ");
        for (i = 0; i < n; i++){
            System.out.print(fibo(j)+", ");
            j++;
        }
        System.out.println();


    }
    static void fungsiDeretFibonacci(int deretFibonacci, int[] fibonacci) {
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < deretFibonacci; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        for (int i = 0; i < deretFibonacci; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
    static int fibo(int n){
        if(n == 0 || n == 1){
            return n;
        } else {
            return (fibo(n-1) + fibo(n-2));
        }
    }
}
