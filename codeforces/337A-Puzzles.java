// Time in milliseconds: 374

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();
        int numberOfPuzzles = sc.nextInt();
        LinkedList<Integer> puzzles = new LinkedList<>();
         for (int i = 0; i < numberOfPuzzles; i++) {
            puzzles.add(sc.nextInt());
        }
         Collections.sort(puzzles);
         int minimumDifference = Integer.MAX_VALUE;
        for (int i = 0; i <= puzzles.size() - numberOfStudents; i++) {
            int currentDifference = puzzles.get(i + numberOfStudents - 1) - puzzles.get(i);
            if (currentDifference < minimumDifference) {
                minimumDifference = currentDifference;
            }
        }
         System.out.println(minimumDifference);
    }
}