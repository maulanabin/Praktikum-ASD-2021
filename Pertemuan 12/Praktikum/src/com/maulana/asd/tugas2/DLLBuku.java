package com.maulana.asd.tugas2;

public class DLLBuku {
    Buku head;
    int size;

    public DLLBuku() {
        head = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void print() {
        if (!isEmpty()) {
            Buku tmp = head;
            System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼");
            System.out.println("Daftar Seluruh Judul Buku");
            System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼");
            while (tmp != null) {
                System.out.println(tmp.judulBuku);
                tmp = tmp.next;
            }
        } else {
            System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼");
            System.out.println("Daftar Buku Kosong!");
        }
        System.out.println();
    }
    public void push(String input) {
        if (isEmpty()) {
            head = new Buku(null, input, null);
        } else {
            Buku newNode = new Buku(null, input, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Daftar buku masih kosong, tidak dapat diambil!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Daftar buku masih kosong, tidak dapat diambil!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Buku current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void peek() {
        Buku tmp = head;
        System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼");
        System.out.println("\tCek Buku Teratas");
        System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼");
        System.out.println(tmp.judulBuku);
    }
}
