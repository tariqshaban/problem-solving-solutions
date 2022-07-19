// Time in milliseconds: 280

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int numberOfSides = sc.nextInt();
             if (numberOfSides % 4 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}