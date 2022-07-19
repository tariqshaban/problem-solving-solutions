// Time in milliseconds: 311

import java.util.Scanner;
 import static java.lang.Math.abs;
import static java.lang.Math.max;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
             int circleSize = abs(a - b) * 2;
             if (c > circleSize || max(a, b) > circleSize) {
                System.out.println(-1);
            } else if (c > circleSize / 2) {
                System.out.println(abs(circleSize / 2 - c));
            } else {
                System.out.println(circleSize / 2 + c);
            }
        }
    }
}