
import searchandsort.BigOExamples;
import searchandsort.SearchExamples;
import searchandsort.entities.Student;
import searchandsort.util.Factory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {


    }

    private static void testComplexity() {
        int n = 10000; // justér for at demonstrere tydeligt

        // O(1)
        long start = System.currentTimeMillis();
        BigOExamples.constantTime(n);
        long stop = System.currentTimeMillis();
        System.out.println("Time for O(1): " + (stop - start) + " ms\n");

        // O(log n)
        start = System.currentTimeMillis();
        BigOExamples.logTime(n);
        stop = System.currentTimeMillis();
        System.out.println("Time for O(log n): " + (stop - start) + " ms\n");

        // O(n)
        start = System.currentTimeMillis();
        BigOExamples.linearTime(n);
        stop = System.currentTimeMillis();
        System.out.println("Time for O(n): " + (stop - start) + " ms\n");

        // O(n²) - pas på med at vælge et for stort n!
        n = 2000; // mindre n for kvadratisk!
        start = System.currentTimeMillis();
        BigOExamples.quadraticTime(n);
        stop = System.currentTimeMillis();
        System.out.println("Time for O(n²): " + (stop - start) + " ms\n");
    }

    private static void testLinearAndBinarySearch() {
        List<Student> students = new ArrayList<>();
        Factory.fillWithStudents(students, 100000);

        // Sorter listen efter ID (nødvendigt for binær søgning)
        students.sort(Comparator.comparingInt(Student::getId));

        int targetId = 99999; // sidst i listen, så forskellen er tydelig!

        // Lineær søgning (langsom)
        long start = System.currentTimeMillis();
        Student studentLinear = SearchExamples.linearSearch(students, targetId);
        long stop = System.currentTimeMillis();
        System.out.println("Lineær søgning fandt: " + studentLinear);
        System.out.println("Tid: " + (stop - start) + " ms");

        // Binær søgning (hurtig)
        start = System.currentTimeMillis();
        Student studentBinary = SearchExamples.binarySearch(students, targetId);
        stop = System.currentTimeMillis();
        System.out.println("Binær søgning fandt: " + studentBinary);
        System.out.println("Tid: " + (stop - start) + " ms");
    }








}
