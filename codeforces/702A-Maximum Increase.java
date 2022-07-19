// Time in milliseconds: 296

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int currentIncrease = 1;
        int highestIncrease = 1;
        int previousNumber = sc.nextInt();
          for (int i = 1; i < length; i++) {
            int currentNumber = sc.nextInt();
            if (previousNumber < currentNumber) {
                currentIncrease++;
            } else {
                currentIncrease = 1;
            }
             if (currentIncrease > highestIncrease) {
                highestIncrease = currentIncrease;
            }
             previousNumber = currentNumber;
        }
         System.out.println(highestIncrease);
    }
}