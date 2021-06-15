package com.maulana.javacollection;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ContohList {
    public static void main(String[] args) {
        List<String> l = new ArrayList();

        l.add("Teknik Informatika");
        l.add("Sistem Informasi");
        l.add("Teknik Komputer");
        l.add("Teknologi Informasi");
        System .out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n", l.get(0), l.size(), l.get(l.size() - 1));

        l.add("Ilmu Komputer");
        l.remove(0);
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n", l.get(0), l.size(), l.get(l.size() - 1));
        System.out.print("\n");
        LinkedList<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("Akhleema");
        names.add("Shanum");
        names.add("Uwain");
        names.add("Al-Qarni");
        System .out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n", names.get(0), names.size(), names.get(names.size() - 1));
        names.set(0, "My kid");
        System .out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n", names.get(0), names.size(), names.get(names.size() - 1));
        System.out.println("Names: " + names.toString());
        System.out.print("\n");
        names.push("Mei-mei");
        System .out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n", names.get(0), names.size(), names.get(names.size() - 1));
        System.out.println("Names: " + names.toString());




    }
}
