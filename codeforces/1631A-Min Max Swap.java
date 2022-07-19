// Time in milliseconds: 234

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Integer> firstNumbers = new LinkedList<>();
        LinkedList<Integer> secondNumbers = new LinkedList<>();
         for (int i = 0; i < numberOfCases; i++) {
            int length = sc.nextInt();
            LinkedList<Integer> minNumbers = new LinkedList<>();
            LinkedList<Integer> maxNumbers = new LinkedList<>();
             for (int j = 0; j < length; j++) {
                firstNumbers.add(sc.nextInt());
            }
            for (int j = 0; j < length; j++) {
                secondNumbers.add(sc.nextInt());
            }
             for (int j = 0; j < length; j++) {
                if (firstNumbers.get(j) < secondNumbers.get(j)) {
                    minNumbers.add(firstNumbers.get(j));
                    maxNumbers.add(secondNumbers.get(j));
                } else {
                    minNumbers.add(secondNumbers.get(j));
                    maxNumbers.add(firstNumbers.get(j));
                }
            }
             System.out.println(Collections.max(minNumbers) * Collections.max(maxNumbers));
              firstNumbers.clear();
            secondNumbers.clear();
        }
    }
}