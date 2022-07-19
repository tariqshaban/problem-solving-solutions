// Time in milliseconds: 202

import java.util.Scanner;
 import static java.lang.Math.ceil;
import static java.lang.Math.sqrt;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
          for (int i = 0; i < numberOfCases; i++) {
            long number = sc.nextInt();
             long nearestIndex = (long) ceil(sqrt(number));
            long nearestValue = (nearestIndex - 1L) * nearestIndex + 1L;
             long columnNumber;
            long rowNumber;
             if (number > nearestValue) {
                columnNumber = nearestIndex - (number - nearestValue);
                rowNumber = nearestIndex;
            } else if (number < nearestValue) {
                columnNumber = nearestIndex;
                rowNumber = nearestIndex - (nearestValue - number);
            } else {
                columnNumber = nearestIndex;
                rowNumber = nearestIndex;
            }
             System.out.println(rowNumber + " " + columnNumber);
        }
    }
}