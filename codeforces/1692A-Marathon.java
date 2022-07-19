// Time in milliseconds: 326

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int timurDistance = sc.nextInt();
            int counter = 0;
             for (int j = 0; j < 3; j++) {
                int participantDistance = sc.nextInt();
                if (timurDistance < participantDistance) {
                    counter++;
                }
            }
             System.out.println(counter);
        }
    }
}