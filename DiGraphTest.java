/*
 * Brent Lee (blee96)
 * Kaitlin Bleich (kbleich)
 * 11/25/2018
 * Project 5
 */

import java.util.*;

public class DiGraphTest {

    public static void main(String[] args) {
        int n; // number of vertices
        char choice; // choice for the menu options
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        n = scanner.nextInt();
        DiGraph graph = new DiGraph(n);
        System.out.println("- add edge (enter a)");
        System.out.println("- deleted edge (enter d)");
        System.out.println("- edge count (enter e)");
        System.out.println("- vertex count (enter v)");
        System.out.println("- print graph (enter p)");
        System.out.println("- Quit (enter q)");
        do {
            System.out.print("\nChoose one of the following operations: ");
            choice = scanner.next().charAt(0); // reads character
            switch (choice) {
                case 'a': // requires input
                    break;
                case 'd': // requires input
                    break;
                case 'e':
                    break;
                case 'v':
                    break;
                case 'p':
                    break;
                default:
                    break;
        } while (choice != 'q');
    }
}
