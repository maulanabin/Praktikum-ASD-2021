package com.maulana.tugas3;

public class SingleLinkedList {
    NodeMatkul head = null;
    NodeMatkul tail = null;

    public boolean isEmpty() {
        return  head == null;
    }
    public void print() {
        if (!isEmpty()) {
            NodeMatkul tmp = head;
            System.out.println("Isi Linked List:\t");
            while (tmp != null) {
                System.out.print(tmp.data);
                tmp = tmp.next;
                System.out.print((tmp == null) ? " #" : " > ");
            }
        } else {
            System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼");
            System.out.println("Linked List Kosong!");
        }
        System.out.print("\n");
    }
    public void addFirst(String input) {
        NodeMatkul ndInput  = new NodeMatkul(input);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    NodeMatkul removeFirst() { // remove head
        NodeMatkul nodeHasil = head;

        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        return nodeHasil;
    }
}

