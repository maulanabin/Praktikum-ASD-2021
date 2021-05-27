package com.maulana.tugas5;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.println("🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹");
        System.out.print("Traverse InOrder: ");
        bta.traverseInOrder(0);
        System.out.println("");
        System.out.print("Traverse PreOrder: ");
        bta.traversePreOrder(0);
        System.out.println("");
        System.out.print("Traverse PostOrder: ");
        bta.traversePostOrder(0);
        System.out.println("");
        System.out.println("🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹");

    }
}
