// Time in milliseconds: 327

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int width = sc.nextInt();
            int height = sc.nextInt();
            int threshold = sc.nextInt();
            int papersCount = 1;
             while (width % 2 == 0 || height % 2 == 0) {
                if (width % 2 == 0) {
                    width /= 2;
                } else {
                    height /= 2;
                }
                 papersCount *= 2;
            }
             if (papersCount >= threshold) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}