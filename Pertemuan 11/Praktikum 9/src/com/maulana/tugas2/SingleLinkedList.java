package com.maulana.tugas2;

public class SingleLinkedList {
    NodeNilai head;
    NodeNilai tail;

    public boolean isEmpty() {
        return  head == null;
    }
    public void print() {
        if (!isEmpty()) {
            NodeNilai tmp = head;
            System.out.println("Isi Linked List:\t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼");
            System.out.println("Linked List Kosong!");
            System.out.print("\n");
        }
    }
    public void addFirst(int input) {
        NodeNilai ndInput  = new NodeNilai(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    public void addLast(int input) {
        NodeNilai ndInput = new NodeNilai(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void insertAfter(int key, int input) {
        NodeNilai ndInput = new NodeNilai(input, null);
        NodeNilai temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) tail = ndInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }
    public void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Indeks salah!");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeNilai temp = head;
            for (int i = 0; i < index -1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeNilai(input, temp.next);
            if (temp.next.next == null) tail = temp.next;
        }
    }
}
