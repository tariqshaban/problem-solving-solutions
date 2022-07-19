// Time in milliseconds: 218

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
         for (int i = 0; i < testCases; i++) {
            int stick = sc.nextInt();
             System.out.println(stick / 2 + stick % 2);
        }
    }
}