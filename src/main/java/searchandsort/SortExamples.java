package searchandsort;

import searchandsort.entities.Student;

import java.lang.reflect.Array;
import java.util.*;

public class SortExamples {

    public static void bubbleSort(List<Student> students) {
        int n = students.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students.get(j).getId() > students.get(j + 1).getId()) {
                    Collections.swap(students, j, j + 1);
                }
            }
        }
    }

    public static void heapSort(List<Student> students) {
        PriorityQueue<Student> heap = new PriorityQueue<>(Comparator.comparingInt(Student::getId));
        heap.addAll(students);

        students.clear();
        while (!heap.isEmpty()) {
            students.add(heap.poll());
        }
    }

    // rekursiv metode
    public static void quickSort(List<Student> students, int low, int high) {
        // base case - vi hopper ud af rekursion hvis low er >=  high
        if (low < high) {
            int pivot = partition(students, low, high);
            quickSort(students, low, pivot - 1);
            quickSort(students, pivot + 1, high);
        }
    }

    private static int partition(List<Student> students, int low, int high) {
        int pivotValue = students.get(high).getId();
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (students.get(j).getId() <= pivotValue) {
                i++;
                Collections.swap(students, i, j);
            }
        }
        Collections.swap(students, i + 1, high);
        return i + 1;
    }

    public static void mergeSort(List<Student> students) {
        if (students.size() > 1) {
            int mid = students.size() / 2;
            List<Student> left = new ArrayList<>(students.subList(0, mid));
            List<Student> right = new ArrayList<>(students.subList(mid, students.size()));

            mergeSort(left);
            mergeSort(right);

            merge(students, left, right);
        }
    }

    private static void merge(List<Student> students, List<Student> left, List<Student> right) {
        int i = 0, j = 0, k = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i).getId() <= right.get(j).getId()) {
                students.set(k++, left.get(i++));
            } else {
                students.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            students.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            students.set(k++, right.get(j++));
        }
    }

    public static void customBubbleSort(int[] numbers) {
        boolean doSorting = true; // Laver en boolean der sige hvis den er true så bliv ved

        while (doSorting) {
            doSorting = false; //Sætter den til false så loopet ikke kører uendeligt men while kun kører hvis if() statement er true
            for (int i = 0; i < numbers.length - 1; i++) { // -1 fordi sidste element ikke skal tjekke sig selv eller en værdi der ikke findes
                if (numbers[i] > numbers[i + 1]) { // F.eks hvis [index 0]'s værdi er større end [index 1]'s værdi
                    int temp = numbers[i]; //temp variabel til at huske [index 0]'s værdi
                    numbers[i] = numbers[i + 1]; // værdi fra index 1 kommer til index 0
                    numbers[i + 1] = temp; // værdi fra index 0 bliver til index 1
                    doSorting = true; // true så den skal kører igen fordi der skete ændringer
                }
            }

        }
        // print array ud
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void customMergeSort(int[] numbers) {
        // Split array op i 2 arrays fra 0 til mid og mid til array.length()
        // Stop når den ikke kan splittes mere op
        if (numbers.length > 1) {
            // Finder midten
            int mid = numbers.length / 2;

            //To subarrays
            int[] leftNumbers = new int[mid];
            int[] rightNumbers = new int[numbers.length - mid];

            //Kopiere indholdet fra numbers ind i både venstre og højre
            for (int i = 0; i < mid; i++) {
                leftNumbers[i] = numbers[i];
            }

            for (int i = mid; i < numbers.length; i++) {
                rightNumbers[i - mid] = numbers[i];
            }
            //Rekursivt kald indtil vi rammer 1 (Først for venstre og efter højre)
            customMergeSort(leftNumbers);
            customMergeSort(rightNumbers);
            // Sorter efter vi har ramt 1 i opdeling
            customMerge(numbers, leftNumbers, rightNumbers);


        }
    }

    private static void customMerge(int[] numbers, int[] left, int[] right) {
        // i er til venstre, j er til højre og k er det samlede antal
        int i = 0, j = 0, k = 0;

        //Mens venstre tæller er mindre end venstre maks index og højre tæller er mindre end højre maks index
        while (i < left.length && j < right.length) {
            // Betingelse hvis venstre værdi er mindre end højre værdi
            if (left[i] <= right[j]) {
                // K er samlet liste tæller, hvis værdi bliver til venstre værdi
                numbers[k] = left[i];
                // Begge værdiers index bliver forhøjet med 1
                i++;
                k++;
            } else {
                // Hvis betingelse ikke er opfyldt så gør det med højre i stedet
                numbers[k] = right[j];
                j++;
                k++;
            }
        }
        // Hvis øvre while ikke længere bliver opfyldt, sæt sidste værdier fra venstre på
        while (i < left.length) {
            numbers[k] = left[i];
            k++;
            i++;
        }
        // Det samme med højre
        while (j < right.length) {
            numbers[k] = right[j];
            k++;
            j++;
        }


    }

    public static void customQuickSort(int[] numbers, int low, int high) {
            // base case - vi hopper ud af rekursion hvis low er >=  high
        if (low < high) {
            // find pivot-indeks og placer pivot på korrekt plads i arrayet
            int pivot = customPartition(numbers, low, high);
            // sorter elementerne til venstre for pivot rekursivt
            customQuickSort(numbers, low, pivot - 1);
            // sorter elementerne til højre for pivot rekursivt
            customQuickSort(numbers, pivot + 1, high);
        }
    }


    private static int customPartition(int[] numbers, int low, int high) {
        // vælg det sidste element som pivot
        int pivotValue = numbers[high];
        // i holder styr på grænsen mellem elementer mindre end og større end pivot
        int i = low - 1;

        for(int j = low; j < high; j++) {
            // hvis elementet er mindre end eller lig med pivot, skal det til venstre
            if (numbers[j] <= pivotValue) {
                i++;
                // byt numbers[i] og numbers[j] så det lille element havner til venstre
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }
        // placer pivot på sin korrekte plads mellem de to grupper
        int temp = numbers[i+1];
        numbers[i+1] = numbers[high];
        numbers[high] = temp;

        // returner pivot-indekset
        return i+1;
    }
}

