// Time in milliseconds: 343

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            long l = sc.nextInt();
            long r = sc.nextInt();
            long x = 0;
            long y = 0;
             if (l * 2 <= r) {
                x = l;
                y = l * 2;
            } else {
                x = -1;
                y = -1;
            }
             System.out.println(x + " " + y);
        }
    }
}