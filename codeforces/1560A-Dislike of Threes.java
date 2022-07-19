// Time in milliseconds: 218

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int currentNumber = 0;
            int currentElementCount = 0;
            int requiredElementCount = sc.nextInt();
             while (currentElementCount != requiredElementCount) {
                if (currentNumber % 10 != 3 && currentNumber % 3 != 0) {
                    currentElementCount++;
                }
                 currentNumber++;
            }
             System.out.println(--currentNumber);
        }
    }
}