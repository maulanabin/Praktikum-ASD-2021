package com.maulana.tugas3;

public class StackString {
    SingleLinkedList sll = null;
    StackString() {
        sll = new SingleLinkedList();
    }
    public void push(String data) {
        sll.addFirst((data));
    }
    public String pop() {
        String strHasil;
        NodeMatkul tmp = sll.removeFirst();
        strHasil = (tmp == null) ? "(kosong)" : tmp.data;
        return  strHasil;
    }
    public void print() {
        sll.print();
    }
}
