// Time in milliseconds: 296

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int firstNumber = sc.nextInt();
            int secondNumber = sc.nextInt();
             if (firstNumber == secondNumber) {
                System.out.println(0);
            } else if ((secondNumber - firstNumber) % 2 != 0) {
                if (secondNumber - firstNumber > 0) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            } else {
                if (secondNumber - firstNumber > 0) {
                    System.out.println(2);
                } else {
                    System.out.println(1);
                }
            }
        }
    }
}