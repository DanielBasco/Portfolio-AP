package algorithms.lazy;

import java.util.HashMap;
import java.util.Map;

public class LazyCalculations {
    static Map<Integer, Long> memo = new HashMap<>();
    static Map<Integer, Long> sumMemo = new HashMap<>();
    static int counter = 0;
    static int sumCounter = 0;
    public static long lazyFactorial(int n) {


        //memo hvis man allerede har gemt resultat
        if (memo.containsKey(n)) {
            return memo.get(n); // allerede beregnet? returnér resultatet
        }
        //Tæller hvis vi ikke har gemt n
        ++counter;
        System.out.println("Counter: "+counter);

        long result;
        if (n == 0 || n == 1) {
            result = 1;
        } else {
            result = n * lazyFactorial(n - 1);
        }

        memo.put(n, result); // gem til næste gang
        return result;
    }

    public static long lazySum(int n){


        if (sumMemo.containsKey(n)) {
            return sumMemo.get(n); // allerede beregnet? returnér resultatet
        }
        //Tæller hvis vi ikke allerede har gemt n i sumMemo
        sumCounter++;
        System.out.println("Sum Counter: "+sumCounter);
        long sumResult;
        if(n == 1 || n == 0){
            sumResult = n;
        } else {
            sumResult = n + lazySum(n-1);
        }
        sumMemo.put(n, sumResult);
        return sumResult;
    }

    public static void main(String[] args) {
        System.out.println(lazyFactorial(5));  // udregner og gemmer
        System.out.println(lazyFactorial(3));  // bliver hurtigt, fordi det allerede er gemt
        System.out.println(lazyFactorial(7));  // bruger gemt factorial(5)

        System.out.println("lazySum: ");
        System.out.println(lazySum(8));
        System.out.println(lazySum(3));
    }
}

