/*
 * Brent Lee (blee96)
 * Kaitlin Bleich (kbleich)
 * 11/25/2018
 * Project 5
 */

import java.util.*;

public class DiGraph {

    private LinkedList<Integer>[] arr;

    /* DiGraph constructor initialized */
    public DiGraph(int N) {
        arr = (LinkedList<Integer>[])new LinkedList[N];
        for (int i = 0; i < N; i++) {
            arr[i] = new LinkedList<Integer>();
        }
    }

    /*
     * two parameters identify vertices representing the edge that needs
     * to be added to the graph
     * // "to" vertex is added as "from" vertex's neighbor
     */
    public void addEdge(int from, int to) {
        // the edge should NOT be added if it already exists (check before adding)
        // vertex-numbers are given in natural numbering (start with 1)
        //      so turn them into Java-indexing to reflect correct connection
        //      NO NEED FOR VALIDITY CHECK
    }

    /* 
     * two parameters identify vertices representing the edge that needs
     * to be deleted from the graph
     * // "to" vertex is removed as "from" vertex's neighbor
     */
    public void deleteEdge(int from, int to) {
        // nothing is done if such edge doesn't exist
        // NO ERROR MESSAGE OR EXCEPTION
    }

    /* computes and returns the number of edges in the graph */
    public int edgeCount() {
    }
    
    /* returns the number of vertices in the graph (the array's length) */
    public int vertexCount() {
        return arr.length;
    }

    /*
     * outputs the graph in the following format:
     * for each vertex i (from 0 to n-1) outputs a line:
     * i is connected to: x1,...,xk // how it should print
     * where x1,...,xk are vertices that are adjacent to i
     * // number of vertices should be natural indexing
     */
    public void print() {
    }
}
