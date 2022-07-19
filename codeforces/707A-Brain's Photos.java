// Time in milliseconds: 202

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfPixels = sc.nextInt() * sc.nextInt();
         for (int i = 0; i < numberOfPixels; i++) {
            char pixel = sc.next().charAt(0);
             if (pixel == 'C' || pixel == 'M' || pixel == 'Y') {
                System.out.println("#Color");
                return;
            }
        }
         System.out.println("#Black&White");
    }
}