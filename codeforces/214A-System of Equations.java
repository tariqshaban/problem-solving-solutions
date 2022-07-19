// Time in milliseconds: 404

import java.util.Scanner;
 import static java.lang.Math.min;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int counter = 0;
         for (int i = 0; i <= min(firstNumber, secondNumber); i++) {
            for (int j = 0; ; j++) {
                if (i * i + j == firstNumber && i + j * j == secondNumber) {
                    counter++;
                }
                 if (i > min(firstNumber, secondNumber) || j > min(firstNumber, secondNumber)) {
                    break;
                }
            }
        }
         System.out.println(counter);
    }
}