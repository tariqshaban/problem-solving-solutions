// Time in milliseconds: 592

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int length = sc.nextInt();
            long maximum = 0;
            long current;
            long previous = 0;
             for (int j = 0; j < length; j++) {
                current = sc.nextInt();
                 long multiplication = current * previous;
                if (multiplication > maximum) {
                    maximum = multiplication;
                }
                previous = current;
            }
             System.out.println(maximum);
        }
    }
}