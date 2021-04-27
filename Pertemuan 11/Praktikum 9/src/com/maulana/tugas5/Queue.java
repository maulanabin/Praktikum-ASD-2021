package com.maulana.tugas5;

public class Queue {
    Node front, rear;

    public boolean isEmpty(){
        return front == null;
    }
    public void peek(){
        if (!isEmpty()) {
            Node tmp = front;
            System.out.println("Elemen Queue Terdepan");
            System.out.println("No. Rekening | \t\t Nama \t\t| \t Alamat");
            System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
            System.out.println(tmp.data.noRekening + "\t\t\t " + tmp.data.nama + "\t\t" + tmp.data.alamat);
        } else {
            System.out.println("Queue Masih Kosong");
        }
    }
    public void peekRear(){
        if (!isEmpty()) {
            Node tmp = rear;
            System.out.println("Elemen Queue Terbelakang");
            System.out.println("No. Rekening | \t\t Nama \t\t| \t Alamat");
            System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
            System.out.println(tmp.data.noRekening + "\t\t\t " + tmp.data.nama + "\t\t" + tmp.data.alamat);
        } else {
            System.out.println("Queue Masih Kosong");
        }
    }
    public void peekPosition(String key){
        if (!isEmpty()) {
            Node tmp = front;
            System.out.println("No. Rekening | \t\t Nama \t\t| \t Alamat");
            System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
            while (tmp != null) {
                if(tmp.data.noRekening.equals(key)){
                    System.out.println(tmp.data.noRekening + "\t\t\t " + tmp.data.nama + "\t\t" + tmp.data.alamat);
                    tmp = tmp.next;
                }
                break;
            }
            System.out.println("");
        } else {
            System.out.println("Queue Masih Kosong");
        }
    }
    public void print(){
        if (!isEmpty()) {
            Node tmp = front;
            System.out.println("Isi Queue");
            System.out.println("No. Rekening | \t\t Nama \t\t| \t Alamat");
            System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
            while (tmp != null) {
                System.out.println(tmp.data.noRekening + "\t\t\t " + tmp.data.nama + "\t\t" + tmp.data.alamat);
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Queue Masih Kosong");
        }
    }
    public void Enqueue(Nasabah input){
        Node ndInput = new Node(input, null);
        if(front != null){
            if (isEmpty()) {
                front = ndInput;
                rear = ndInput;
            } else {
                front.next = ndInput;
                rear = ndInput;
            }
        }else{
            if (isEmpty()) {
                front = ndInput;
                rear = ndInput;
            } else {
                ndInput.next = front;
                front = ndInput;
            }
        }
    }
    public void addFirst(Nasabah input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            front = ndInput;
            rear = ndInput;
        } else {
            ndInput.next = front;
            rear = ndInput;
        }
    }
    public void Dequeue() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong tidak dapat dihapus");
        } else if (front == rear ) {
            front = rear = null;
        } else {
            front = front.next;
        }
    }
}