package com.maulana.LigaInggris;
// TI 1H_Maulana Bintang Irfansyah_16_2041720132
public class PremierLeague {
    public String team;
    public int play, goal, points;

    PremierLeague(String t, int p, int g, int pt) {
        team = t;
        play = p;
        goal = g;
        points = pt;
    }
    public void tampil() {
        System.out.println("Club\t\t\t\t\t\tPertandingan\t\t\t\tGoalDifference\t\t\t\tPoints");
        System.out.printf("%s\t\t\t\t%d\t\t\t\t\t\t\t%d\t\t\t\t\t\t\t%d\n", team, play, goal, points);
    }
}
