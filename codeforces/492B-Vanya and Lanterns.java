// Time in milliseconds: 218

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfLanterns = sc.nextInt();
        int streetLength = sc.nextInt();
        LinkedList<Integer> lanternPositions = new LinkedList<>();
         for (int i = 0; i < numberOfLanterns; i++) {
            lanternPositions.add(sc.nextInt());
        }
         lanternPositions.add(-Collections.min(lanternPositions));
        lanternPositions.add(2 * streetLength - Collections.max(lanternPositions));
        Collections.sort(lanternPositions);
         int previousLanternPosition = lanternPositions.getFirst();
        int maximumDifference = 0;
        for (int lanternPosition : lanternPositions) {
            int difference = lanternPosition - previousLanternPosition;
             if (difference > maximumDifference) {
                maximumDifference = difference;
            }
             previousLanternPosition = lanternPosition;
        }
         System.out.println(maximumDifference / 2.0);
    }
}