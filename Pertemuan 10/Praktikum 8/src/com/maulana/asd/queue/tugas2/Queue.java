package com.maulana.asd.queue.tugas2;
public class Queue {
    public int max, front, rear, size;
    Mahasiswa[] antrian;

    public Queue(int max) {
        this.max = max;
        create();
    }
    public void create() {
        antrian = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    public void Enqueue(Mahasiswa antrian) {
        if (isFull()) {
            System.out.println("Queue sudah penuh!");
        } else {
            if (isEmpty()) {
                front = rear = 0; // antrian yang diisi adalah antrian pertama
            } else {
                if (rear == max -1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            this.antrian[rear] = antrian; // proses memasukkan antrian
            size++;
        }
    }
    public Mahasiswa Dequeue() {
        Mahasiswa data = new Mahasiswa("", "", 0, 0);
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            data = antrian[front];
            size--;
            if (isEmpty()) {
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
    public void print() {
        if (!isEmpty()) {
            System.out.println("Queue masih kosong!");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print("Elemen terdepan: " + antrian[front].nim + " " + antrian[front].nama + " "
                        + antrian[front].absen + " " + antrian[front].ipk);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i] + " ");
            System.out.println("Jumlah elemen: " + size);
        }
    }
    public void peek() {
        if(!isEmpty()) {
            if (!isEmpty()) {
                System.out.print("Elemen terdepan: " + antrian[front].nim + " " + antrian[front].nama + " "
                        + antrian[front].absen + " " + antrian[front].ipk);
            } else {
                System.out.println("Queue masih kosong!");
            }
        }
    }
    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen terbelakang: " + antrian[rear]);
        } else {
            System.out.println("Antrian masih kosong!");
        }
    }
    public void peekPosition(String nim) {
        if (isEmpty()) {
            System.out.println("Antrian masih ksosong");
        } else {
            int i = front, posisi = -1;
            while (i != rear) {
                if (antrian[i].nim.equals((nim))) {
                    posisi = i;
                    break;
                }
                i = (i + 1) % max;
            }
            if (posisi != -1) {
                System.out.println("Posisi data " + nim + " berada pada antrian ke-" + (posisi + 1));
            } else {
                System.out.println("Data tidak ditemukan");
            }
        }
    }
    public void printMahasiswa(int position) {
        if (!isEmpty()) {
            if (position < 1 || position > max) {
                System.out.println("Posisi antrian yang anda masukkan tidak ada");
            } else {
                System.out.println("Elemen pada antrian ke " + position + " : ");
                System.out.println("------------------------");
                antrian[position - 1].print();
            }
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
}
