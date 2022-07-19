// Time in milliseconds: 372

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCoins = sc.nextInt();
        int totalCoins = 0;
        LinkedList<Integer> coins = new LinkedList<>();
         for (int i = 0; i < numberOfCoins; i++) {
            coins.add(sc.nextInt());
            totalCoins += coins.getLast();
        }
         Collections.sort(coins);
        Collections.reverse(coins);
         int currentSum = 0;
        for (int i = 0; i < numberOfCoins; i++) {
            currentSum += coins.get(i);
              if (currentSum > totalCoins / 2) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}