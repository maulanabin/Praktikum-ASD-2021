package com.maulana.tugas5;

public class Node {
    Node next;
    Nasabah data;

    public Node(Nasabah data, Node next) {
        this.data = data;
        this.next = next;
    }
}
