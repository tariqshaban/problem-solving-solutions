// Time in milliseconds: 296

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            long firstNumber = sc.nextInt();
            long secondNumber = sc.nextInt();
             if (firstNumber > secondNumber / 2) {
                System.out.println(secondNumber % firstNumber);
            } else {
                if (secondNumber % 2 == 0) {
                    System.out.println((secondNumber / 2) - 1);
                } else {
                    System.out.println((secondNumber / 2));
                }
            }
        }
    }
}