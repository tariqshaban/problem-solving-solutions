// Time in milliseconds: 187

import java.util.Scanner;
 import static java.lang.Math.min;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfReds = sc.nextInt();
        int numberOfBlues = sc.nextInt();
         int common = min(numberOfReds, numberOfBlues);
         numberOfReds -= common;
        numberOfBlues -= common;
         System.out.print(common);
        System.out.print(" ");
        System.out.print(numberOfReds / 2 + numberOfBlues / 2);
    }
}