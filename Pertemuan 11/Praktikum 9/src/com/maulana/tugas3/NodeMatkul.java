package com.maulana.tugas3;

public class NodeMatkul {
    NodeMatkul next = null;
    String data = null;

    public NodeMatkul(String mataKuliah) {
        data = mataKuliah;
        next = null;
    }
    public NodeMatkul(String mataKuliah, NodeMatkul node) {
        data = mataKuliah;
        next = node;
    }
}

