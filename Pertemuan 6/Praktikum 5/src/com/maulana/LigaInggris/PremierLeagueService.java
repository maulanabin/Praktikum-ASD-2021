package com.maulana.LigaInggris;
// TI 1H_Maulana Bintang Irfansyah_16_2041720132
public class PremierLeagueService {
    PremierLeague[] leagues = new PremierLeague[20];
    int index;
    public void tambah(PremierLeague l) {
        if (index < leagues.length) {
            leagues[index] = l;
            index++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }
    public void tampil() {
        for (PremierLeague l : leagues) {
            l.tampil();
            System.out.println("⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ⚽ ");
        }
    }
    public void insertionSortAsc() {
        int i, j;
        for (i = 1; i < leagues.length; i++) {
            PremierLeague temporary =leagues[i];
            j = i;
            while ((j > 0) && (leagues[j - 1].points > temporary.points)) {
                leagues[j] = leagues[j - 1];
                j--;
            }
            leagues[j] = temporary;
        }

    }
}
