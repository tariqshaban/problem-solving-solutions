// Time in milliseconds: 374

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int substringLength = sc.nextInt();
            String binaryString = sc.next();
             for (int j = 0; j < 2 * substringLength - 1; j += 2) {
                System.out.print(binaryString.charAt(j));
            }
             System.out.println();
        }
    }
}