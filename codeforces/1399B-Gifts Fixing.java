// Time in milliseconds: 249

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 import static java.lang.Math.min;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Long> candies = new LinkedList<>();
        LinkedList<Long> oranges = new LinkedList<>();
         for (int i = 0; i < numberOfCases; i++) {
            int numberOfPresents = sc.nextInt();
             for (int j = 0; j < numberOfPresents; j++) {
                candies.add(sc.nextLong());
            }
            for (int j = 0; j < numberOfPresents; j++) {
                oranges.add(sc.nextLong());
            }
             long minCandy = Collections.min(candies);
            long minOrange = Collections.min(oranges);
             long moves = 0;
            for (int j = 0; j < numberOfPresents; j++) {
                long difference;
                if (candies.get(j) > minCandy && oranges.get(j) > minOrange) {
                    difference = min(candies.get(j) - minCandy, oranges.get(j) - minOrange);
                    candies.set(j, candies.get(j) - difference);
                    oranges.set(j, oranges.get(j) - difference);
                    moves += difference;
                }
                 if (candies.get(j) > minCandy) {
                    difference = candies.get(j) - minCandy;
                    moves += difference;
                }
                 if (oranges.get(j) > minOrange) {
                    difference = oranges.get(j) - minOrange;
                    moves += difference;
                }
            }
             System.out.println(moves);
            candies.clear();
            oranges.clear();
        }
    }
}