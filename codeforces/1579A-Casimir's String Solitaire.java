// Time in milliseconds: 202

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            String text = sc.next();
            int letterA = 0;
            int letterB = 0;
            int letterC = 0;
             for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == 'A') {
                    letterA++;
                } else if (text.charAt(j) == 'B') {
                    letterB++;
                } else {
                    letterC++;
                }
            }
             letterB -= letterA + letterC;
             if (letterB == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}