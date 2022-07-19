// Time in milliseconds: 218

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        HashMap<Integer, Integer> numbersOccurrences = new HashMap<>();
         for (int i = 0; i < numberOfCases; i++) {
            int numberOfBalls = sc.nextInt();
             for (int j = 0; j < numberOfBalls; j++) {
                int ballNumber = sc.nextInt();
                 if (numbersOccurrences.containsKey(ballNumber)) {
                    numbersOccurrences.put(ballNumber, numbersOccurrences.get(ballNumber) + 1);
                } else {
                    numbersOccurrences.put(ballNumber, 1);
                }
            }
             System.out.println(Collections.max(numbersOccurrences.values()));
            numbersOccurrences.clear();
        }
    }
}