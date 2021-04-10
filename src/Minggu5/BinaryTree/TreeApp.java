package Minggu5.BinaryTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Minggu5.BinaryTree.Tree;

public class TreeApp {
    public static void main(String[] args) throws IOException {
        int value;
        String data;

        Tree theTree = new Tree();
        theTree.insert(50, "Lukman");
        theTree.insert(25, "Betty");
        theTree.insert(75, "Lukie");
        theTree.insert(12, "Hakim");
        theTree.insert(37, "Bakhtiar");
        theTree.insert(43, "Silvi");
        theTree.insert(30, "Callista");
        theTree.insert(33, "Khanza");
        theTree.insert(87, "Salwa");
        theTree.insert(93, "Nabila");
        theTree.insert(97, "Mikayshowla");

        while (true) {
            System.out.print("Enter first letter of show. insert, find, delete, or traverser:  ");

            int choice = getChar();
            switch (choice) {
                case 's':
                    theTree.displayTree();
                    break;
                case 'i':
                    System.out.print("Enter the value and data to insert: ");
                    value  = getInt();
                    data = getString();
                    theTree.insert(value, data);
                    break;
                case 'f':
                    System.out.print("Enter value to find: ");
                    value = getInt();
                    Node found = theTree.find(value);
                    if (found != null) {
                        System.out.print("Found: ");
                        found.displayNode();
                        System.out.println();
                    } else {
                        System.out.print("Could not find: " + value);
                    }
                    break;
                case 'd':
                    System.out.print("Enter value to delete: ");
                    value = getInt();
                    boolean didDelete = theTree.delete(value);
                    if (didDelete) {
                        System.out.println("Deleted " + value);
                    } else {
                        System.out.println("Could not delete" + value);
                    }
                    break;
                case 't':
                    System.out.print("Enter type 1, 2, 3 : ");
                    value = getInt();
                    theTree.traverse(value);
                    break;
                default:
                    System.out.println("Invalid Entry");
            }


        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();

        return s;
    }

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }

}