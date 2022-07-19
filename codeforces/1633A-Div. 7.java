// Time in milliseconds: 202

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int number = sc.nextInt();
             if (number % 7 == 0) {
                System.out.println(number);
                continue;
            }
             int numberWithoutFirstDigit = number / 10 * 10;
            for (int j = 1; j < 10; j++) {
                int testNumber = numberWithoutFirstDigit + j;
                if (testNumber % 7 == 0) {
                    System.out.println(testNumber);
                    break;
                }
            }
        }
    }
}