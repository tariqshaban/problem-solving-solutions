// Time in milliseconds: 218

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
          for (int i = 0; i < numberOfCases; i++) {
            int length = sc.nextInt();
             for (int j = 0; j < length; j++) {
                System.out.print(1 + " ");
            }
             System.out.println();
        }
    }
}