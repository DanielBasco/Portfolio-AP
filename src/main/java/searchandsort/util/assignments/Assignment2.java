package searchandsort.util.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Assignment2 {
    //### ArrayList vs LinkedList
    public static void main(String[] args) {

        ArrayList<Integer> arrayListLarge = new ArrayList<>();
        LinkedList<Integer> linkedListLarge = new LinkedList<>();
        HashSet<Integer> hashSetLarge = new HashSet<>();
        for (int i = 0; i<=500000; i++){
            arrayListLarge.add(i);
            linkedListLarge.add(i);
            hashSetLarge.add(i);
        }

        // ArrayList
        System.out.println("ArrayList:");
        getFromList(arrayListLarge, 250000);
        addMidInList(arrayListLarge, 99);
        removeMidInList(arrayListLarge);
        System.out.println(" Get burde være konstant tid O(1) da vi leder på et specifikt index som ligger i hukommelsen \n" +
                " Add og Remove burde være O(n) da elementers index rykker plads \n");
        System.out.println("LinkedList");
        getFromList(linkedListLarge, 250000);
        addMidInList(linkedListLarge, 99);
        removeMidInList(linkedListLarge);
        System.out.println("Get burde være O(n) da LinkedList ikke har index hukommelse men kun kender forrige værdi \n" +
                "Add og Remove i dette tilfælde burde være O(n) også da den først skal finde placeringen nr. 250.000 \n");

        //### Søgning: List vs HashSet
        System.out.println("--------- contains method --- ArrayList vs HashSet \n");
        System.out.println("ArrayList");

        long start = System.currentTimeMillis();
        boolean test = arrayListLarge.contains(250000);
        long stop = System.currentTimeMillis();
        System.out.println(test+" Time for ArrayList contains element exist: " + (stop - start) + " ms");
        start = System.currentTimeMillis();
        test = arrayListLarge.contains(1000000);
        stop = System.currentTimeMillis();
        System.out.println(test+" Time for ArrayList contains element doesn't exist: " + (stop - start) + " ms\n");

        System.out.println("HashSet");
        start = System.currentTimeMillis();
        test = hashSetLarge.contains(250000);
        stop = System.currentTimeMillis();
        System.out.println(test+" Time for HashSet contains element exist: " + (stop - start) + " ms");
        start = System.currentTimeMillis();
        test = hashSetLarge.contains(1000000);
        stop = System.currentTimeMillis();
        System.out.println(test+" Time for HashSet contains element doesn't exist: " + (stop - start) + " ms\n");
        //Forklar forskellen. Hvad er kompleksiteten for hvert kald, og hvorfor?
        System.out.println("Tiden for ArrayList burde være lineær fordi contains() i en ArrayList er O(n)");
        System.out.println("Tiden for HashSet burde være konstant fordi contains() i et HashSet er O(1)");
    }



    public static int getFromList(List<Integer> list, int number){
        long start = System.currentTimeMillis();
        int res = list.get(number);
        long stop = System.currentTimeMillis();
        System.out.println("Time for get: " + (stop - start) + " ms\n");
        return res;
    }

    public static void addMidInList(List<Integer> list, int number){
        long start = System.currentTimeMillis();
        list.add(250000, number);
        long stop = System.currentTimeMillis();
        System.out.println("Time for add: " + (stop - start) + " ms\n");
    }

    public static void removeMidInList(List<Integer> list){
        long start = System.currentTimeMillis();
        list.remove(250000);
        long stop = System.currentTimeMillis();
        System.out.println("Time for remove: " + (stop - start) + " ms\n");
    }




}
