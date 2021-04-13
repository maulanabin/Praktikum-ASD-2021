package com.maulana.tugas1;
import java.util.Scanner;
public class MainKalimatTerbalik {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        KalimatTerbalik stack = new KalimatTerbalik(25);
        System.out.print("Masukkan kalimat: ");
        String kalimat = userInput.nextLine();
        for (int i = 0; i < kalimat.length(); i++) {
            stack.push(kalimat.charAt(i));
        }
        stack.print();
    }
}