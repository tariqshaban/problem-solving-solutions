// Time in milliseconds: 186

import java.util.LinkedList;
import java.util.Scanner;
 import static java.lang.Math.abs;
import static java.lang.Math.pow;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
         for (int i = 0; i < testCases; i++) {
            int numberOfCoins = sc.nextInt();
            LinkedList<Integer> coins = new LinkedList<>();
             int firstPile = 0;
            int secondPile = 0;
             for (int j = 1; j <= numberOfCoins; j++) {
                coins.add((int) pow(2, j));
            }
                        for (int j = 0; j < coins.size(); j++) {
                if (j < coins.size() / 2 - 1 || j == coins.size() - 1) {
                    firstPile += coins.get(j);
                } else {
                    secondPile += coins.get(j);
                }
            }
             System.out.println(abs(firstPile - secondPile));
        }
    }
}