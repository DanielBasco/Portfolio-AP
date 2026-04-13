package searchandsort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class BigOExamples {
    public static void main(String[] args) {
        int n = 10; // Juster n for at se effekten
        System.out.println("O(1) - Konstant tid:");
        constantTime(n);

        System.out.println("\nO(log n) - Logaritmisk tid:");
        logTime(n);

        System.out.println("\nO(n) - Lineær tid:");
        linearTime(n);

        System.out.println("\nO(n^2) - Kvadratisk tid:");
        quadraticTime(n);
    }

    // O(1) - Konstant tid
    public static void constantTime(int n) {
        //  System.out.println("Jeg printer altid én gang, uanset n.");
    }

    // O(log n) - Logaritmisk tid (Binær nedtælling)
    public static void logTime(int n) {
        for (int i = n; i > 1; i /= 2) {
            //  System.out.println("Jeg kører log n gange, n er nu: " + i);
        }
    }

    // O(n) - Lineær tid
    public static void linearTime(int n) {
        for (int i = 0; i < n; i++) {
            //  System.out.println("Itererer: " + i);
        }
    }

    // O(n^2) - Kvadratisk tid
    public static void quadraticTime(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //   System.out.println("Kvadratisk iteration: " + i + "," + j);
            }
        }

    }

    //  O(1)
    public static void customConstant(LinkedList<Integer> number, int n) {
        number.add(n);
        System.out.println(number);
        System.out.println("LinkedList add method is O(1)");
    }

    // O(log n)
    public static void customAddTreeSet(int n) {
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(15);
        tree.add(32);
        tree.add(40);
        if (tree.contains(n)){
            System.out.println("Already has " + n);
    } else

    {
        tree.add(n);
        System.out.println(n+" added!");
    }
}


    // og O(n).
    public static void CustomRemoveArrayList(int n){
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i<10; i++){
            numbers.add(i);
        }
        if (numbers.contains(n)){
            numbers.remove(n);
            System.out.println("Removed "+n+" from the list");
        } else {
            System.out.println("List contains 1-10 so "+n+" is invalid");
        }
        System.out.println("ArrayList remove method is O(n)");
    }

}

