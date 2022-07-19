// Time in milliseconds: 404

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
         if (length % 2 != 0) {
            System.out.println(-1);
            return;
        }
         for (int i = 1; i <= length; i++) {
            if (i % 2 == 0) {
                System.out.print(i - 1 + " ");
            } else {
                System.out.print(i + 1 + " ");
            }
        }
    }
}