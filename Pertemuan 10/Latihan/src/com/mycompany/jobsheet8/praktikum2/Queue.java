package com.mycompany.jobsheet8.praktikum2;

public class Queue {
    public int front;
    public int rear;
    public int size;
    public int max;
    Penumpang[] Q;

    public Queue(int max) {
        this.max = max; // max referensi ke parameter dan this.max referensi ke atribut
        Create();
    }
    public void Create() {
        Q = new Penumpang[max];
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
                System.out.println("Elemen terdepan: " + Q[front].nama + " " + Q[front].kotaAsal + " "
                + Q[front].kotaTujuan + " " + Q[front].jumlahTiket + " " + Q[front].harga);
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
                System.out.print("Elemen terdepan: " + Q[front].nama + " " + Q[front].kotaAsal + " "
                        + Q[front].kotaTujuan + " " + Q[front].jumlahTiket + " " + Q[front].harga);
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
    public void Enqueue(Penumpang data) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh!");
        } else {
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
    public Penumpang Dequeue() {
        Penumpang data = new Penumpang("", "", "", 0, 0);
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
    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Elemen terbelakang: " + Q[rear]);
        } else {
            System.out.println("Antrian masih kosong!");
        }
    }
}

