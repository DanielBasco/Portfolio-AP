package searchandsort.util.assignments;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainForStudent {
    public static void main(String[] args) {
        Student S1 = new Student("Daniel", 1);
        Student S2 = new Student("Signe", 2);
        Student S3 = new Student("Asger", 3);
        Student S4 = new Student("Jesper", 4);
        Student S5 = new Student("Amanda", 5);
        Student S6 = new Student("Gustav", 6); //New object to add

        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(S1);
        hashSet.add(S2);
        hashSet.add(S3);
        hashSet.add(S4);
        hashSet.add(S5);

        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(S1);
        treeSet.add(S2);
        treeSet.add(S3);
        treeSet.add(S4);
        treeSet.add(S5);
        //--------- STARTS HERE---------//

        // HashSet
        System.out.println("HashSet");
        getFromSet(hashSet, S5);
        addInSet(hashSet, S6);
        removeInSet(hashSet, S3);

        System.out.println("TreeSet");
        getFromSet(treeSet, S5);
        addInSet(treeSet, S6);
        removeInSet(treeSet, S3);

        System.out.println("Konklusion: \n" +
                "Get, Add, Remove: HashSet skal finde hashcode og tjekker for element via. O(1), \n" +
                " som burde være hurtigere i dette tilfælde med få elementer, end \n" +
                "TreeSet der skal bruge compareTo metode og bruge log(n)");
    }

    private static boolean getFromSet(Set<Student> set,Student student){
        long start = System.currentTimeMillis();
        boolean res = set.contains(student);
        long stop = System.currentTimeMillis();
        System.out.println("Time for get: " + (stop - start) + " ms\n");
        return res;
    }

    private static void addInSet(Set<Student> set, Student student){
        long start = System.currentTimeMillis();
        set.add(student);
        long stop = System.currentTimeMillis();
        System.out.println("Time for add: " + (stop - start) + " ms\n");
    }

    private static void removeInSet(Set<Student> set, Student student){
        long start = System.currentTimeMillis();
        set.remove(student);
        long stop = System.currentTimeMillis();
        System.out.println("Time for remove: " + (stop - start) + " ms\n");
    }

}
