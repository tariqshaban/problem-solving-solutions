// Time in milliseconds: 187

import java.util.Scanner;
 import static java.lang.Math.min;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int minimum = min(a, b);
        int answer = 1;
         for (int i = 1; i <= minimum; i++) {
            answer *= i;
        }
         System.out.println(answer);
    }
}