package com.maulana.asd.tugas3;

public class QueueDLLVaksin {
    AntrianVaksinasi head;
    int size;

    public QueueDLLVaksin() {
        head = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void print() {
        if (!isEmpty()) {
            AntrianVaksinasi tmp = head;
            System.out.println();
            System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 ");
            System.out.println("\t\tDaftar Pengantri Vaksin");
            System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 ");
            System.out.println("No \t| \tNama");
            while (tmp != null) {
                System.out.println(tmp.noAntrian + "  | " + tmp.nama);
                tmp = tmp.next;
            }
            System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 ");
            System.out.println("Sisa antrian: " + (size()));
        } else {
            System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 ");
            System.out.println("Daftar Antrean Kosong!");
        }
        System.out.println();
    }
    public void addFirst(String inputNo, String inputNama) {
        if (isEmpty()) {
            head = new AntrianVaksinasi(null, inputNo, inputNama, null);
        } else {
            AntrianVaksinasi newNode = new AntrianVaksinasi(null, inputNo, inputNama, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void Enqueue(String inputNo, String inputNama) {
        if (isEmpty()) {
            addFirst(inputNo, inputNama);
        } else {
            AntrianVaksinasi current = head;
            while (current.next != null) {
                current = current.next;
            }
            AntrianVaksinasi newNode = new AntrianVaksinasi(current, inputNo, inputNama, null);
            current.next = newNode;
            size++;
        }
    }
    public void Dequeue() throws Exception {
        System.out.print("\n");
        System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 ");
        System.out.println(head.nama + " telah selesai divaksinasi. 😊");
        System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 ");
        if (isEmpty()) {
            throw new Exception("Daftar vaksinasi masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast() throws Exception {
        if (isEmpty())  {
            throw new Exception("Daftar vaksinasi masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        AntrianVaksinasi current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public int size() {
        return size;
    }
}
