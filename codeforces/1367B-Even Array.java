// Time in milliseconds: 249

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        int evenOddBalance = 0;
        int swapsRequired = 0;
         for (int i = 0; i < numberOfCases; i++) {
            int arrayLength = sc.nextInt();
             for (int j = 0; j < arrayLength; j++) {
                int number = sc.nextInt();
                 if (number % 2 == 0) {
                    if (j % 2 != 0) {
                        swapsRequired++;
                    }
                    evenOddBalance++;
                } else {
                    if (j % 2 == 0) {
                        swapsRequired++;
                    }
                    evenOddBalance--;
                }
            }
             if (evenOddBalance == 0 || evenOddBalance == 1) {
                System.out.println(swapsRequired / 2);
            } else {
                System.out.println(-1);
            }
             evenOddBalance = 0;
            swapsRequired = 0;
        }
    }
}