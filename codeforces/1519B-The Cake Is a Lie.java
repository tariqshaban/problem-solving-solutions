// Time in milliseconds: 202

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int gridWidth = sc.nextInt();
            int gridHeight = sc.nextInt();
            int money = sc.nextInt();
             if (gridWidth * gridHeight - 1 == money) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}