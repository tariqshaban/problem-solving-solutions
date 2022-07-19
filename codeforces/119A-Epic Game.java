// Time in milliseconds: 374

import java.util.Scanner;
 import static java.lang.Math.min;
 public class Main {
     static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
         for (int i = min(a, b); i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
         return 1;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int heap = sc.nextInt();
        int turn = 0;
         while (true) {
            if (turn == 0) {
                heap -= findGCD(firstNumber, heap);
            } else {
                heap -= findGCD(secondNumber, heap);
            }
             turn = (turn == 0) ? 1 : 0;
             if (heap < 0) {
                System.out.println(turn);
                break;
            }
         }
    }
}