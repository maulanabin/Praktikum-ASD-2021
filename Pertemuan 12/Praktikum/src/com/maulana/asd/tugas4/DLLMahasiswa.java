package com.maulana.asd.tugas4;

public class DLLMahasiswa {
    Mahasiswa head;
    int size;

    public DLLMahasiswa() {
        head = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void print() {
        if (!isEmpty()) {
            Mahasiswa tmp = head;
            System.out.println();
            System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 ");
            System.out.println("\tDaftar Nilai IPK Mahasiswa");
            System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 ");
            System.out.println("NIM \t| \tNAMA \t\t| \tIPK");
            while (tmp != null) {
                System.out.println(tmp.nim + "\t\t| " + "\t" + tmp.nama + "\t\t| " + "\t" + tmp.ipk);
                tmp = tmp.next;
            }
            System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 ");
        } else {
            System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 ");
            System.out.println("Daftar Nilai Kosong!");
        }
        System.out.println();
    }
    public void addFirst(int nim, String nama, double ipk) {
        if (isEmpty()) {
            head = new Mahasiswa(null, nim, nama, ipk, null);
        } else {
            Mahasiswa newNode = new Mahasiswa(null, nim, nama, ipk, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(int nim, String nama, double ipk) {
        if (isEmpty()) {
            addFirst(nim, nama, ipk);
        } else {
            Mahasiswa current = head;
            while (current.next != null) {
                current = current.next;
            }
            Mahasiswa newNode = new Mahasiswa(current, nim, nama, ipk, null);
            current.next = newNode;
            size++;
        }
    }
    public void add(int nim, String nama, double ipk, int index) throws Exception {
        if (isEmpty()) {
            addFirst(nim, nama, ipk);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas!");
        } else {
            Mahasiswa current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Mahasiswa newNode = new Mahasiswa(null, nim, nama, ipk, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Mahasiswa newNode = new Mahasiswa(current.prev, nim, nama, ipk, current);
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
        Mahasiswa current = head;
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
            Mahasiswa current = head;
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
        Mahasiswa current = head;
        int index = 0, nim = 0;
        String nama = "";
        double ipk = 0;
        boolean ditemukan = false;
        if (isEmpty()) {
            System.out.println("Linked Lists Kosong!");
        } else {
            while (current.next != null) {
                current = current.next;
                if (cari == head.nim) {
                    ditemukan = true;
                    nim = head.nim;
                    nama = head.nama;
                    ipk = head.ipk;
                    break;
                } else if (current.nim == cari) {
                    ditemukan = true;
                    nim = current.nim;
                    nama = current.nama;
                    ipk = current.ipk;
                    index++;
                    break;
                }
                index++;
            }
        }
        if (ditemukan) {
            System.out.println("Data: " + cari + " ditemukan pada node ke-" + index);
            System.out.println("IDENTITAS:");
            System.out.println("NIM\t\t: " + nim);
            System.out.println("Nama\t: " + nama);
            System.out.println("IPK\t\t: " + ipk);
        } else {
            throw new Exception("Data tidak ditemukan!");
        }
    }
    public void selectionSort() throws Exception {
        double temp;
        if (isEmpty()) {
            throw new Exception("Linked Lists Kosong!");
        } else {
            for (Mahasiswa current = head; current.next != null; current = current.next) {
                for (Mahasiswa afterCurrent = current.next; afterCurrent != null; afterCurrent = afterCurrent.next) {
                    if (current.ipk < afterCurrent.ipk) {
                        temp = current.ipk;
                        current.ipk = afterCurrent.ipk;
                        afterCurrent.ipk = temp;
                    }
                }
            }
        }
    }
}
