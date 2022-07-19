// Time in milliseconds: 467

import java.util.HashMap;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            HashMap<Integer, Integer> occurrences = new HashMap<>();            
            int length = sc.nextInt();
            int foundNumber = -1;
             for (int j = 0; j < length; j++) {
                Integer currentNumber = Integer.parseInt(sc.next());
                if (occurrences.containsKey(currentNumber)) {
                    occurrences.put(currentNumber, occurrences.get(currentNumber) + 1);
                } else {
                    occurrences.put(currentNumber, 1);
                }
                 if (occurrences.get(currentNumber) >= 3) {
                    foundNumber = currentNumber;
                }
            }
             System.out.println(foundNumber);
            occurrences.clear();
        }
    }
}