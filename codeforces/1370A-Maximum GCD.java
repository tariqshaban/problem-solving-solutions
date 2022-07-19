// Time in milliseconds: 186

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int number = sc.nextInt();
             System.out.println(number / 2);
        }
    }
}