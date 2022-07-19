// Time in milliseconds: 187

import java.util.Scanner;
 import static java.lang.Math.min;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numberOf2s = sc.nextInt();
        long numberOf3s = sc.nextInt();
        long numberOf5s = sc.nextInt();
        long numberOf6s = sc.nextInt();
         long numberOfConstructed256 = min(min(numberOf2s, numberOf5s), numberOf6s);
         numberOf2s -= numberOfConstructed256;
         long numberOfConstructed32 = min(numberOf2s, numberOf3s);
         System.out.println(numberOfConstructed256 * 256 + numberOfConstructed32 * 32);
    }
}