// Time in milliseconds: 264

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            sc.nextInt();
            boolean isFound = false;
             String digits = sc.next();
            for (int j = 0; j <= 4; j++) {
                String firstPartition = digits.substring(0, j);
                String secondPartition = digits.substring(digits.length() - 4 + j);
                if ((firstPartition + secondPartition).equals("2020")) {
                    isFound = true;
                    break;
                }
            }
             if (isFound) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}