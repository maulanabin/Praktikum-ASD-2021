package com.maulana.LigaInggris;
// TI 1H_Maulana Bintang Irfansyah_16_2041720132
public class MainLeague {
    public static void main(String[] args) {
        PremierLeagueService dataList = new PremierLeagueService();

        PremierLeague pl1 = new PremierLeague("Manchester United", 28, 12, 42);
        PremierLeague pl2 = new PremierLeague("Tottenham Hotspur", 29, 7, 41);
        PremierLeague pl3 = new PremierLeague("Arsenal\t\t", 28, 4, 40);
        PremierLeague pl4 = new PremierLeague("Burnley\t\t", 29, -6, 39);
        PremierLeague pl5 = new PremierLeague("Crystal Palace\t", 29, -6, 39);
        PremierLeague pl6 = new PremierLeague("Everton\t\t", 29, -6, 37);
        PremierLeague pl7 = new PremierLeague("Liverpool\t", 29, 45, 82);
        PremierLeague pl8 = new PremierLeague("Manchester City\t", 27, 39, 57);
        PremierLeague pl9 = new PremierLeague("Leicester\t", 28, 26, 50);
        PremierLeague pl10 = new PremierLeague("Newcastle United", 29, -16, 35);
        PremierLeague pl11 = new PremierLeague("Southampton\t", 29, -17, 34);
        PremierLeague pl12 = new PremierLeague("Brighton & Hove Albion", 29, -8, 29);
        PremierLeague pl13 = new PremierLeague("Chelsea\t\t", 29, 9, 48);
        PremierLeague pl14 = new PremierLeague("Wolverhampton Wanderers", 29, 7, 43);
        PremierLeague pl15 = new PremierLeague("Sheffield United", 28, 5, 43);
        PremierLeague pl16 = new PremierLeague("West Ham United\t", 29, -15, 27);
        PremierLeague pl17 = new PremierLeague("Watford\t\t", 29, -17, 27);
        PremierLeague pl18 = new PremierLeague("AFC Bournemouth\t", 29, -18, 27);
        PremierLeague pl19 = new PremierLeague("Aston Villa\t", 27, -18, 25);
        PremierLeague pl20 = new PremierLeague("Norwich City\t", 29, -27, 21);

        dataList.tambah(pl1);
        dataList.tambah(pl2);
        dataList.tambah(pl3);
        dataList.tambah(pl4);
        dataList.tambah(pl5);
        dataList.tambah(pl6);
        dataList.tambah(pl7);
        dataList.tambah(pl8);
        dataList.tambah(pl9);
        dataList.tambah(pl10);
        dataList.tambah(pl11);
        dataList.tambah(pl12);
        dataList.tambah(pl13);
        dataList.tambah(pl14);
        dataList.tambah(pl15);
        dataList.tambah(pl16);
        dataList.tambah(pl17);
        dataList.tambah(pl18);
        dataList.tambah(pl19);
        dataList.tambah(pl20);

        System.out.println("❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤");
        System.out.println("\t\t\t\tDaftar Liga Inggris Sebelum Sorting ");
        System.out.println("❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤");
        dataList.tampil();
        System.out.print("\n");
        System.out.println("❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤");
        System.out.println("\t\t\t\tDaftar Liga Inggris Setelah Sorting Ascending ");
        System.out.println("❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤ ❤");
        dataList.insertionSortAsc();
        dataList.tampil();

    }
}
