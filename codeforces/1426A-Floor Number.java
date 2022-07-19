// Time in milliseconds: 217

import java.util.Scanner;
 import static java.lang.Math.ceil;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int apartmentNumber = sc.nextInt();
            int apartmentsPerFloor = sc.nextInt();
             double result = ceil((apartmentNumber - 2.0) / apartmentsPerFloor + 1);
             if (apartmentNumber <= 2) {
                result = 1;
            }
             System.out.println((int)result);
        }
    }
}