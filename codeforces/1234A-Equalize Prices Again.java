// Time in milliseconds: 217

import java.util.Scanner;
 import static java.lang.Math.ceil;
import static java.lang.Math.round;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            long sum = 0L;
            int length = sc.nextInt();
             for (int j = 0; j < length; j++) {
                sum += sc.nextLong();
            }
             System.out.println(round(ceil(1.0 * sum / length)));
        }
    }
}