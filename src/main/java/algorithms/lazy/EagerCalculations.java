package algorithms.lazy;

import java.util.HashMap;
import java.util.Map;

public class EagerCalculations {

        static Map<Integer, Long> memo = new HashMap<>();

        static {
            memo.put(1,1L);
            //beregn fakultet for alle tal fx op til 100 og læg det i map
            for (int i = 2; i <= 50; i++){
                long result = i * memo.get(i-1);
                memo.put(i, result);
            }
        }
        public static long eagerFactorial(int n) {

                return memo.get(n); // allerede beregnet? returnér resultatet

        }

        public static void main(String[] args) {
            System.out.println(eagerFactorial(5));  // udregner og gemmer
            System.out.println(eagerFactorial(4));  // bliver hurtigt, fordi det allerede er gemt
            System.out.println(eagerFactorial(6));  // bruger gemt factorial(5)
        }
    }


