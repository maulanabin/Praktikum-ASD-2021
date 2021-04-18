package com.maulana.asd.queue.tugas1;

public class Queue {
    public int max;
    public int size;
    public int front;
    public int rear;
    public int[] Q;

    public Queue(int max) {
        this.max = max; // max referensi ke parameter dan this.max referensi ke atribut
        Create();
    }
    public void Create() {
        Q = new int[max];
        size = 0;
        front = rear = -1;
    }
    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    public void peek() {
        if(!IsEmpty()) {
            if (!IsEmpty()) {
                System.out.println("Elemen queue terdepan: " + Q[front]);
            } else {
                System.out.println("Queue masih kosong!");
            }
        }
    }
    public void print() {
        if (!IsEmpty()) {
            System.out.println("Queue masih kosong!");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(Q[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Jumlah elemen: " + size);
        }
    }
    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan! ");
        } else {
            System.out.println("Queue masih kosong!");
        }
    }
    public void Enqueue(int data) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh!");
        } else {
            if (IsEmpty()) {
                if (IsEmpty()) {
                    front = rear = 0; // data yang diisi adalah data pertama
                } else {
                    if (rear == max -1) {
                        rear = 0;
                    } else {
                        rear++;
                    }
                }
                Q[rear] = data; // proses memasukkan data
                size++;
            }
        }
    }
    public int Dequeue() {
        int data = 0;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            data = Q[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }
    public void peekPosition(int data) {
        if (IsEmpty()) {
            System.out.println("Antrian masih ksosong");
        } else {
            int i = front, posisi = -1;
            while (i != rear) {
                if (Q[i] == data) {
                    posisi = i;
                    break;
                }
                i = (i + 1) % max;
            }
            if (posisi != -1) {
                System.out.println("Posisi data " + data + " berada pada antrian ke-" + (posisi + 1));
            } else {
                System.out.println("Data tidak ditemukan");
            }
        }
    }
    public void peekAt(int position) {
        if (!IsEmpty()) {
            if (position < 1 || position > max) {
                System.out.println("Posisi antrian yang Anda masukkan tidak ada!");
            } else {
                System.out.println("Elemen pada antrian ke-" + position + " : " + Q[position-1]);
            }
        } else {
            System.out.println("Antrian masih kosong!");
        }
    }

}
