// Time in milliseconds: 358

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
         for (int i = 0; i < testCases; i++) {
            int numberOfCandies = sc.nextInt();
            int numberOfCandiesOneGram = 0;
            int numberOfCandiesTwoGrams = 0;
              for (int j = 0; j < numberOfCandies; j++) {
                int candy = sc.nextInt();
                 if (candy == 1) {
                    numberOfCandiesOneGram++;
                } else {
                    numberOfCandiesTwoGrams++;
                }
            }
             if (numberOfCandiesOneGram % 2 == 0 && (numberOfCandiesTwoGrams % 2 == 0 || numberOfCandiesOneGram != 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}