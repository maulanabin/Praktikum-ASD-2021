package com.maulana.asd.tugas1;

public class DoubleLinkedLists {
    Node head;
    int size;

    public DoubleLinkedLists() {
        head = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Isi Linked List:\t");
            while (tmp != null) {
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
        } else {
            System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼");
            System.out.println("Linked List Kosong!");
        }
        System.out.println();
    }
    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }
    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas!");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                newNode.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked Lists masih kosong, tidak dapat dihapus!");
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
            throw new Exception("Linked Lists masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas!");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    public void cari(int cari) throws Exception {
        Node current = head;
        int index = 0;
        boolean ditemukan = false;
        if (isEmpty()) {
            System.out.println("Linked Lists Kosong!");
        } else {
            while (current.next != null) {
                current = current.next;
                if (head.data == cari) {
                    ditemukan = true;
                    break;
                } else if (current.data == cari) {
                    ditemukan = true;
                    index++;
                    break;
                }
                index++;
            }
        }
        if (ditemukan) {
            System.out.println("Data: " + cari + " ditemukan pada node ke-" + index);
        } else {
            throw new Exception("Data tidak ditemukan!");
        }
    }
    public void selectionSort() throws Exception {
        int temp;
        if (isEmpty()) {
            throw new Exception("Linked Lists Kosong!");
        } else {
            for (Node current = head; current.next != null; current = current.next) {
                for (Node afterCurrent = current.next; afterCurrent != null; afterCurrent = afterCurrent.next) {
                    if (current.data < afterCurrent.data) {
                        temp = current.data;
                        current.data = afterCurrent.data;
                        afterCurrent.data = temp;
                    }
                }
            }
        }
    }
}
