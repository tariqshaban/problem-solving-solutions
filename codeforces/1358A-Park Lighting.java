// Time in milliseconds: 327

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int rows = sc.nextInt();
            int columns = sc.nextInt();
             int result = rows * columns / 2;
             if ((rows * columns % 2 == 0)) {
                System.out.println(result);
            } else {
                System.out.println(result + 1);
            }
        }
    }
}