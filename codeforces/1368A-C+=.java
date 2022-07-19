// Time in milliseconds: 202

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            long threshold = sc.nextInt();
            int numberOfOperations = 0;
             while (a <= threshold && b <= threshold) {
                if (a > b) {
                    b += a;
                    numberOfOperations++;
                } else {
                    a += b;
                    numberOfOperations++;
                }
            }
             System.out.println(numberOfOperations);
        }
    }
}