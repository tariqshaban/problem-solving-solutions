// Time in milliseconds: 295

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int counter = 0;
             long number = sc.nextInt();
            for (int j = 1; j <= 9; j++) {
                long ordinaryNumber = j;
                 while (ordinaryNumber <= number) {
                    ordinaryNumber = ordinaryNumber * 10 + j;
                    counter++;
                }
            }
             System.out.println(counter);
        }
    }
}