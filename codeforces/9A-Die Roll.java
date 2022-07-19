// Time in milliseconds: 404

import java.util.Scanner;
 import static java.lang.Math.max;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstRoll = sc.nextInt();
        int secondRoll = sc.nextInt();
         int minimumRollRequired = max(firstRoll, secondRoll);
         int numerator = 6 - (minimumRollRequired - 1);
        int denominator = 6;
         int commonDivider = 1;
        for (int i = 1; i <= 6; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                commonDivider = i;
            }
        }
         numerator /= commonDivider;
        denominator /= commonDivider;
         System.out.println(numerator + "/" + denominator);
    }
}