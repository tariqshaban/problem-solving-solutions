// Time in milliseconds: 202

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfLevels = sc.nextInt();
        List<Integer> firstPlayerLevels = new LinkedList<>();
        List<Integer> secondPlayerLevels = new LinkedList<>();
          int firstPlayerLevelsCount = sc.nextInt();
        for (int j = 0; j < firstPlayerLevelsCount; j++) {
            firstPlayerLevels.add(sc.nextInt());
        }
         int secondPlayerLevelsCount = sc.nextInt();
        for (int j = 0; j < secondPlayerLevelsCount; j++) {
            secondPlayerLevels.add(sc.nextInt());
        }
          for (int i = 1; i <= numberOfLevels; i++) {
            if (!firstPlayerLevels.contains(i) && !secondPlayerLevels.contains(i)) {
                System.out.println("Oh, my keyboard!");
                return;
            }
        }
         System.out.println("I become the guy.");
    }
}