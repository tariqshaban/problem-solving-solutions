// Time in milliseconds: 233

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int number = sc.nextInt();
             if (number % 2 == 0)
                System.out.println(number / 2 + " " + number / 2);
            else
                System.out.println(1 + " " + (number - 1));
        }
    }
}