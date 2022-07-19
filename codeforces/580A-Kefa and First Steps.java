// Time in milliseconds: 311

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfDays = sc.nextInt();
        int maximumNonDecreasing = 0;
        int currentNonDecreasing = 0;
        int previousMoney = -1;
         for (int i = 0; i < numberOfDays; i++) {
            int money = sc.nextInt();
             if (money >= previousMoney) {
                currentNonDecreasing++;
            } else {
                currentNonDecreasing = 1;
            }
             if (currentNonDecreasing > maximumNonDecreasing) {
                maximumNonDecreasing = currentNonDecreasing;
            }
             previousMoney = money;
        }
         System.out.println(maximumNonDecreasing);
    }
}