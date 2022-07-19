// Time in milliseconds: 280

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int arrayLength = sc.nextInt();
            int sum = sc.nextInt();
             if (arrayLength == 1) {
                System.out.println(0);
            } else if (arrayLength == 2) {
                System.out.println(sum);
            } else {
                System.out.println(sum * 2);
            }
        }
    }
}