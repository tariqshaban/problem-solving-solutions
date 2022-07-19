// Time in milliseconds: 233

import java.util.Scanner;
 import static java.lang.Math.*;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            long rightJumpDistance = sc.nextInt();
            long leftJumpDistance = sc.nextInt();
            long numberOfJumps = sc.nextInt();
             long rightDistance = rightJumpDistance * round(ceil(numberOfJumps * 1.0 / 2));
            long leftDistance = leftJumpDistance * round(floor(numberOfJumps * 1.0 / 2));
             System.out.println(rightDistance - leftDistance);
        }
    }
}