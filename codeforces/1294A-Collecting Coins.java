// Time in milliseconds: 342

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            LinkedList<Integer> persons = new LinkedList<>();
            for (int j = 0; j < 3; j++) {
                persons.add(sc.nextInt());
            }
             int coinsToDistribute = sc.nextInt();
            int requiredCoins = 0;
             int maxPerson = Collections.max(persons);
            persons.remove(persons.indexOf(maxPerson));
             for (int person : persons) {
                requiredCoins += maxPerson - person;
            }
             int remainingCoins = coinsToDistribute - requiredCoins;
            if (remainingCoins >= 0 && remainingCoins % 3 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}