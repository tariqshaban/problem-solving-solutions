// Time in milliseconds: 436

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int firstNumber = sc.nextInt();
            int secondNumber = sc.nextInt();
             if (firstNumber > secondNumber) {
                int temp = firstNumber;
                firstNumber = secondNumber;
                secondNumber = temp;
            }
             int difference = secondNumber - firstNumber;
            int compensation = 0;
             if (difference % 10 != 0) {
                compensation = 1;
            }
             System.out.println(difference / 10 + compensation);
        }
    }
}