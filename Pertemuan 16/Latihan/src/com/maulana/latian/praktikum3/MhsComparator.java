package com.maulana.latian.praktikum3;

import java.util.Comparator;

public class MhsComparator {
    public int compare(Mahasiswa mhs1, Mahasiswa mhs2) {

        if (mhs1.nim == mhs2.nim) {
            return 0;
        } else {
            return -1;
        }
    }

    public Comparator<Mahasiswa> reversed() {
        return Comparator.super.reversed();
    }

}