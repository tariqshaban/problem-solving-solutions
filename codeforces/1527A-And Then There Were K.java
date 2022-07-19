// Time in milliseconds: 452

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            long number = sc.nextLong();
            long result = 1;
             while (result <= number) {
                result *= 2;
            }
             System.out.println(result / 2 - 1);
        }
    }
}