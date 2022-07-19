// Time in milliseconds: 296

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int coin1 = sc.nextInt();
            int coin2 = sc.nextInt();
             if (coin1 == 0) {
                System.out.println(1);
            } else {
                System.out.println(coin1 + (2 * coin2) + 1);
            }
        }
    }
}