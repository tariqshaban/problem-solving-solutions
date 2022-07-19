// Time in milliseconds: 233

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            long sum = 0L;
             for (int j = 0; j < 3; j++) {
                sum += sc.nextLong();
            }
             System.out.println(sum / 2);
        }
    }
}