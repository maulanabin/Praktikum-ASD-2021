package com.maulana.tugas2;

public class Stack {
    int size;
    int top = -1;
    Object[] data;

    public Stack(int size) {
        this.size = size;
        data = new Object[size];
    }
    public boolean IsFull() {
        return top == size - 1;
    }
    public boolean IsEmpty() {
        return top == -1;
    }
    public void push(Object data) {
        if (!IsFull()) {
            top++;
            this.data[top] = data;
        } else {
            System.out.println("Stack sudah terisi penuh!");
        }
    }
    public void pop() {
        if (!IsEmpty()) {
            System.out.println(data[top].toString());
            top--;
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    public void peek() {
       if (!IsEmpty()) {
           System.out.println("Elemen teratas " + data[top].toString());
       } else {
           System.out.println("Stack kosong!");
       }
    }
    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].toString());
        }
    }
    public void clear() {
        if (!IsEmpty()) {
            top = -1;
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Gagal! Stack masih kosong");
        }
    }
}