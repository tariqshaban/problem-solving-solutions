// Time in milliseconds: 467

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int result = 0;
            LinkedList<Integer> remainders = new LinkedList<>();
            int number = sc.nextInt();
            int currentDigit = 1;
             while (number != 0) {
                if (number % 10 != 0) {
                    remainders.add(number % 10 * currentDigit);
                    result++;
                }
                number /= 10;
                currentDigit *= 10;
            }
             System.out.println(result);
             for (int remainder : remainders) {
                System.out.print(remainder + " ");
            }
            System.out.println();
        }
    }
}