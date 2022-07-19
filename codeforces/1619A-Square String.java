// Time in milliseconds: 171

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            String word = sc.next();
            boolean isSquare = word.length() % 2 == 0;
             for (int j = 0; j < word.length() / 2; j++) {
                if (word.charAt(j) != word.charAt(j + word.length() / 2)) {
                    isSquare = false;
                    break;
                }
            }
             if (isSquare) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}