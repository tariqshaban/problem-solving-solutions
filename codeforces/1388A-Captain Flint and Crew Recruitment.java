// Time in milliseconds: 311

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
          for (int i = 0; i < numberOfCases; i++) {
            int number = sc.nextInt();
             if (number < 31) {
                System.out.println("NO");
            } else {
                int remainingNumber = number - 30;
                 System.out.println("YES");
                if (remainingNumber != 14 && remainingNumber != 10 && remainingNumber != 6) {
                    System.out.println("14 10 6 " + remainingNumber);
                } else {
                    System.out.println("6 10 15 " + (number - 31));
                }
            }
        }
    }
}