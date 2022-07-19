// Time in milliseconds: 264

import java.util.Scanner;
 import static java.lang.Math.*;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int length = sc.nextInt();
             System.out.println(round(ceil(sqrt(length))));
        }
    }
}