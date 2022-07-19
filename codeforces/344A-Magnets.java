// Time in milliseconds: 528

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfMagnets = sc.nextInt();
        int numberOfGroups = 0;
         int previousMagnet = 0;
         for (int i = 0; i < numberOfMagnets; i++) {
            int magnet = sc.nextInt();
            if (magnet != previousMagnet) {
                numberOfGroups++;
            }
            previousMagnet = magnet;
         }
         System.out.println(numberOfGroups);
    }
}