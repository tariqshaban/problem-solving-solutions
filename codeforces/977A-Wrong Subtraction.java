// Time in milliseconds: 187

import java.util.Scanner;
 import static java.lang.Math.min;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
         while (secondNumber != 0) {
            if (firstNumber % 10 != 0) {
                int subtraction = min(secondNumber, firstNumber % 10);
                 firstNumber -= subtraction;
                secondNumber -= subtraction;
            } else {
                firstNumber /= 10;
                secondNumber--;
            }
        }
         System.out.println(firstNumber);
    }
}