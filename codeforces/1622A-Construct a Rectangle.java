// Time in milliseconds: 342

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Integer> sticks = new LinkedList<>();
         for (int i = 0; i < numberOfCases; i++) {
            for (int j = 0; j < 3; j++) {
                sticks.add(sc.nextInt());
            }
             Collections.sort(sticks);
             if (sticks.getFirst().equals(sticks.get(1)) && sticks.getLast() % 2 == 0) {
                    System.out.println("YES");
            } else if (sticks.getLast().equals(sticks.get(1)) && sticks.getFirst() % 2 == 0) {
                    System.out.println("YES");
            } else if (sticks.getLast() == sticks.getFirst() + sticks.get(1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
             sticks.clear();
        }
    }
}