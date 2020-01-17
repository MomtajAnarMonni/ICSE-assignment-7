package de.ovgu.icse.assignment07;
/**
 * Main class of the Java program. 
 * 
 */

public class Main {

    public static void main(String[] args) {

        int[] vertex = {1, 2, 3, 4, 5, 6};
        int[][] edges = {{1,1},{1,2},{1,4},{2,3},{2,4},{2,5},{3,6},{4,1},{5,6},{6,4}};
        int[][] new_matrix = new int[][]{{1,1,0,1,0,0}, {0,0,1,1,1,0}, {0,0,0,0,0,1}, {1,0,0,0,0,0}, {0,0,0,0,0,1}, {0,0,0,1,0,0}};
        int[][] matrix = new int[][]{{1,1,0,1,0,0}, {0,0,1,1,1,0}, {0,0,0,0,0,1}, {1,0,0,0,0,0}, {0,0,0,0,0,1}, {0,0,0,1,0,0}};

        MatrixGraph graph = new MatrixGraph();

        System.out.println(graph.inDegree(0, new_matrix));
        System.out.println(graph.outDegree(3, new_matrix));
        System.out.println(graph.adjacent(5, new_matrix).size());
    }

}


