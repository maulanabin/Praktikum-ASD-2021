package com.maulana.graph.tugas1;

import java.util.Scanner;

public class Graph {
    int vertex;
    LinkedList list[];

    public Graph(int vertex) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList();
        }
    }
    public void addEdge(int source, int destination) {
        // add edge
        list[source].addFirst(destination);

        // add back edge (for undirected)
        list[destination].addFirst(source);
    }
    public void degree(int source) throws Exception {
        // degree undirected graph
        System.out.println("degree vertex " + source + " \t\t: " + list[source].size());

        // degree directed graph
        // inDegree
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == source) {
                    ++totalIn;
                }
            }
            // outDegree
            for (k = 0; k < list[source].size(); k++) {
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dari vertex " + source + "\t: " + totalIn);
        System.out.println("Outdegree dari vertex " + source + "\t: " + totalOut);
        System.out.println("degree vertex " + source + " \t\t: " + (totalIn + totalOut));
    }
    public void removeEdge(int source, int destiantion) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == destiantion) {
                list[source].remove(destiantion);
            }
        }
    }
    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }
    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + i + " terhubung dengan: ");
                for (int j = 0; j < list[i].size; j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        Graph graph = new Graph(6);
        System.out.print("Masukkan jumlah lintasan: ");
        int lintasan = userInput.nextInt();
        for (int i = 0; i < lintasan; i++) {
            System.out.println("\nLintasan ke-" + i);
            System.out.print("Masukkan source\t\t\t: ");
            int source = userInput.nextInt();
            System.out.print("Masukkan destination\t: ");
            int dest = userInput.nextInt();
            graph.addEdge(source, dest);
        }
        System.out.println("");
        graph.printGraph();
        graph.degree(2);
    }
}
