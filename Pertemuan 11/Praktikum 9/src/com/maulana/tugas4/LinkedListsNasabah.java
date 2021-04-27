package com.maulana.tugas4;

public class LinkedListsNasabah {
    NodeNasabah head;
    int size;
    Nasabah nsbh;

    LinkedListsNasabah() {
        head = null;
        size = 0;
    }
    boolean isEmpty() {
        return head == null;
    }
    public void addFirst(String noRekening, String nama, String alamat) {
        nsbh = new Nasabah(noRekening, nama, alamat);
        head = new NodeNasabah(nsbh, head);
        size++;
    }
    public void add(String noRekening, String nama, String alamat, int index) throws Exception {
        nsbh = new Nasabah(noRekening, nama, alamat);
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        }
        if (isEmpty() || index == 0) {
            addFirst(noRekening, nama, alamat);
        } else {
            NodeNasabah tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            NodeNasabah next = (tmp == null) ? null : tmp.next;
            tmp.next = new NodeNasabah(nsbh, next);
            size++;
        }
    }
    public void addLast(String noRekening, String nama, String alamat) {
        nsbh = new Nasabah(noRekening, nama, alamat);
        if (isEmpty()) {
            addFirst(noRekening, nama, alamat);
        } else {
            NodeNasabah tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new NodeNasabah(nsbh, null);
            size++;
        }
    }
    public Nasabah getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        return head.data;
    }
    public Nasabah getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        NodeNasabah tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public Nasabah get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        NodeNasabah tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public void addKey(String noRekening) throws Exception {
        NodeNasabah tmp = head;
        String nama = "";
        String alamat = "";
        for (int i = 0; i < size; i++) {
            if (tmp.data.noRekening.equalsIgnoreCase(noRekening)) {
                nama = tmp.data.nama;
                nsbh = new Nasabah(noRekening, nama, alamat);
                add(noRekening, nama, alamat, i + 1);
                break;
            }
            tmp = tmp.next;
        }
    }
    public int getKey(String noRekening) throws Exception {
        NodeNasabah tmp = head;
        int simpan = -1;
        for (int i = 0; i < size; i++) {
            if (tmp.data.noRekening.equalsIgnoreCase(noRekening)) {
                simpan = i;
                break;
            }
            tmp = tmp.next;
        }
        return simpan;
    }
    public void removeKey(String noRekening) throws Exception {
        NodeNasabah tmp = head;
        for (int i = 0; i < size; i++) {
            if (tmp.data.noRekening.equalsIgnoreCase(noRekening)) {
                remove(i);
                break;
            }
            tmp = tmp.next;
        }
    }
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        if (isEmpty() || index == 0) {
            removeFirst();
        } else {
            NodeNasabah prev = head;
            NodeNasabah cur = head.next;
            for (int i = 1; i < index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
        }
    }
    public void removeFirst() throws Exception {
        Nasabah tmp = getFirst();
        head = head.next;
        size--;
    }
    public void clear() {
        head = null;
        size = 0;
    }
    public void print() {
        if (!isEmpty()) {
            NodeNasabah tmp = head;
            while (tmp != null) {
                System.out.println("No. Rekening\t: " + tmp.data.noRekening);
                System.out.println("Nama\t\t\t: " + tmp.data.nama);
                System.out.println("Alamat\t\t\t: " + tmp.data.alamat);
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("LinkedList kosong");
        }
    }
}