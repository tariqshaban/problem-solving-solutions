// Time in milliseconds: 701

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
                for (int i = 0; i < numberOfCases; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = sc.nextInt();
            int modulo = n % x;
             if (modulo > y) {
                System.out.println(n - modulo + y);
            } else if (modulo == y) {
                System.out.println(n);
            } else if (modulo < y) {
                System.out.println(n - modulo - x + y);
            }
        }
    }
}