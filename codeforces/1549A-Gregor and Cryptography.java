// Time in milliseconds: 218

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            long primeNumber = sc.nextInt();
             System.out.println(2 + " " + (primeNumber - 1));
        }
    }
}