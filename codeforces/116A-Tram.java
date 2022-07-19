// Time in milliseconds: 466

import java.util.Scanner;
 import static java.lang.Math.max;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stops = sc.nextInt();
        int currentCapacity = 0;
        int maximumCapacity = 0;
         for (int i = 0; i < stops; i++) {
            int exit = sc.nextInt();
            int enter = sc.nextInt();
             currentCapacity += enter - exit;
            maximumCapacity = max(maximumCapacity, currentCapacity);
        }
         System.out.println(maximumCapacity);
    }
}