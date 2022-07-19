// Time in milliseconds: 342

import java.util.Scanner;
 import static java.lang.Math.*;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int aX = sc.nextInt();
            int aY = sc.nextInt();
             int bX = sc.nextInt();
            int bY = sc.nextInt();
             int fX = sc.nextInt();
            int fY = sc.nextInt();
             int distance = abs(bX - aX) + abs(bY - aY);
             boolean isFxInCenter = (min(aX, bX) < fX) && (fX < max(aX, bX));
            boolean isFyInCenter = (min(aY, bY) < fY) && (fY < max(aY, bY));
             if (fX == aX && fX == bX && isFyInCenter) {
                distance += 2;
            }
            if (fY == aY && fY == bY && isFxInCenter) {
                distance += 2;
            }
             System.out.println(distance);
        }
    }
}