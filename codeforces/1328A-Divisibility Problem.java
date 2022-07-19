// Time in milliseconds: 280

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
         for (int i = 0; i < testCases; i++) {
            int firstNumber = sc.nextInt();
            int secondNumber = sc.nextInt();
             int moves;
             if (firstNumber < secondNumber) {
                moves = secondNumber - firstNumber;
                System.out.println(moves);
                continue;
            }
             if (firstNumber % secondNumber == 0) {
                moves = firstNumber % secondNumber;
            } else {
                moves = secondNumber - firstNumber % secondNumber;
            }
            System.out.println(moves);
        }
    }
}