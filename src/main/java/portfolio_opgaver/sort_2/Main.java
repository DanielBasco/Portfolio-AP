package searchandsort.util.assignment2;

import searchandsort.SortExamples;
import searchandsort.entities.Student;
import searchandsort.util.Factory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //testSort();
        //int numbers[] = {20, 40, 25, 11, 9, 2, 33, 5005, 400};
        //SortExamples.customBubbleSort(numbers);
        Random random = new Random();
        int[] numbers = new int[100];
        int[] numbers2 = new int[100];
        for (int i = 0; i<100; i++) {
            numbers[i] = random.nextInt(1000);
            numbers2[i] = random.nextInt(1000);
        }
    /*
        SortExamples.customMergeSort(numbers2);
        for (int n : numbers2) {
            System.out.println(n);
        }
        */
        SortExamples.customQuickSort(numbers, 0, numbers.length-1);
        for (int n : numbers){
            System.out.println(n);
        }

    }

    private static void testSort() {
        List<Student> original = new ArrayList<>();
        Factory.fillWithStudents(original, 100000); // eller fx 10_000 til hurtigere test
        Collections.shuffle(original);
        long start = System.currentTimeMillis();
        long stop = System.currentTimeMillis();

        // Bubble Sort (langsom)
        /*
        List<Student> bubbleList = new ArrayList<>(original);
         start = System.currentTimeMillis();
        SortExamples.bubbleSort(bubbleList);
         stop = System.currentTimeMillis();
        System.out.println("Bubble Sort - tid: " + (stop - start) + " ms");
*/
        // Heap Sort
        List<Student> heapList = new ArrayList<>(original);
        start = System.currentTimeMillis();
        SortExamples.heapSort(heapList);
        stop = System.currentTimeMillis();
        System.out.println("Heap Sort - tid: " + (stop - start) + " ms");

        // Quick Sort
        List<Student> quickList = new ArrayList<>(original);
        start = System.currentTimeMillis();
        SortExamples.quickSort(quickList, 0, quickList.size() - 1);
        stop = System.currentTimeMillis();
        System.out.println("Quick Sort - tid: " + (stop - start) + " ms");

        // Merge Sort
        List<Student> mergeList = new ArrayList<>(original);
        start = System.currentTimeMillis();
        SortExamples.mergeSort(mergeList);
        stop = System.currentTimeMillis();
        System.out.println("Merge Sort - tid: " + (stop - start) + " ms");
    }
}
