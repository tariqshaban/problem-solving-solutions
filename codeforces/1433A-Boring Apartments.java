// Time in milliseconds: 171

import java.util.Scanner;
 public class Main {
    static int numberOfDigits(int number) {
        int digits = 0;
         while (number != 0) {
            number = number / 10;
            digits++;
        }
         return digits;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int reachedApartmentNumber = sc.nextInt();
             int previousNumbers = (reachedApartmentNumber % 10 - 1) * 10;
             int currentNumbers;
            if (numberOfDigits(reachedApartmentNumber) == 1) {
                currentNumbers = 1;
            } else if (numberOfDigits(reachedApartmentNumber) == 2) {
                currentNumbers = 3;
            } else if (numberOfDigits(reachedApartmentNumber) == 3) {
                currentNumbers = 6;
            } else  {
                currentNumbers = 10;
            }
             int numberOfApartments = previousNumbers + currentNumbers;
             System.out.println(numberOfApartments);
         }
    }
}