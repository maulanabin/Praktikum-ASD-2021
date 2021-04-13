package com.maulana.tugas1;

public class KalimatTerbalik {
    int size, top;
    char[] data;

    public KalimatTerbalik(int size) {
        this.size = size;
        data = new char[size];
        top = -1;
    }
    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }
    public void push(char dt) {
        if (!IsFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Isi stack penuh1");
        }
    }
    public void pop() {
        if (!IsEmpty()) {
            char x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x);
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    public void peek() {
        System.out.println("Elemen teratas: " + data[top]);
    }
    public void print() {
        System.out.println("Hasil: ");
        for(int i = top; i >= 0; i--) {
            System.out.print(data[i] + "");
        }
        System.out.println("");
    }
    public void clear() {
        if(!IsEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Gagal! Stack masih kosong");
        }
    }
}