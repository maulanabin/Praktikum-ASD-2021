package com.maulana.TiketPesawat;
// TI 1H_Maulana Bintang Irfansyah_16_2041720132
public class TiketService {
    Tiket[] tickets;
    int index;
    TiketService() {

    }
    public void TiketService(int array) {
        tickets = new Tiket[array];
    }
    public void tambah(Tiket t) {
        if (index < tickets.length) {
            tickets[index] = t;
            index++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }
    public void tampilAll() {
        for (Tiket t : tickets) {
            System.out.println("🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫");
            t.tampilTiket();
            System.out.println("🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫 🎫");
        }
    }
    public void bubbleSortAsc() {
        for (int x = 0; x < tickets.length - 1; x++) {
            for (int y = 1; y < tickets.length - x; y++) {
                if (tickets[y].harga < tickets[y - 1].harga) {
                    Tiket tmp = tickets[y];
                    tickets[y] = tickets[y - 1];
                    tickets[y - 1] = tmp;
                }
            }
        }
    }
    public void bubbleSortDesc() {
        for (int x = 0; x < tickets.length - 1; x++) {
            for (int y = 1; y < tickets.length - x; y++) {
                if (tickets[y].harga > tickets[y - 1].harga) {
                    Tiket temp = tickets[y];
                    tickets[y] = tickets[y - 1];
                    tickets[y - 1] = temp;
                }
            }
        }
    }
    public void selectionSortAsc() {
        for (int x = 0; x < tickets.length - 1; x++) {
            int indexMin = x;
            for (int y = x + 1; y < tickets.length; y++) {
                if (tickets[y].harga < tickets[indexMin].harga) {
                    indexMin = y;
                }
            }
            Tiket temp = tickets[indexMin];
            tickets[indexMin] = tickets[x];
            tickets[x] = temp;
        }
    }
    public void selectionSortDesc() {
        for (int x = 0; x < tickets.length - 1; x++) {
            int indexMin = x;
            for (int y = x + 1; y < tickets.length; y++) {
                if (tickets[y].harga > tickets[indexMin].harga) {
                    indexMin = y;
                }
            }
            Tiket temp = tickets[indexMin];
            tickets[indexMin] = tickets[x];
            tickets[x] = temp;
        }
    }
}
