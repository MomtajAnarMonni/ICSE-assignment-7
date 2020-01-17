package de.ovgu.icse.assignment07;

import java.util.LinkedList;
import java.util.List;

public class MatrixGraph {
    public int inDegree(int vertex, int[][] edge) {
        int numInDeg = 0;
        for (int i = 0; i < edge.length; i++)
            if (edge[i][vertex] == 1) {
                numInDeg++;
            }
        return numInDeg;
    }

    public int outDegree(int vertex, int[][] edge) {
        int numOutDeg = 0;
        for (int i = 0; i < edge.length; i++) {
            if (edge[vertex][i] == 1) {
                numOutDeg++;
            }
        }
        return numOutDeg;
    }

    public List<Integer> adjacent(int vertex, int[][] edge) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < edge.length; i++) {
            if (edge[vertex][i] >= 1) {
                list.add(edge[vertex][i]);
            }
        }
        return list;
    }
}