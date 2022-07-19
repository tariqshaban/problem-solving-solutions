// Time in milliseconds: 218

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int evens = 0;
            int numberOfPairs = sc.nextInt();
             for (int j = 0; j < numberOfPairs * 2; j++) {
                if (sc.nextInt() % 2 == 0) {
                    evens++;
                }
            }
             if (evens == numberOfPairs) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}