// Time in milliseconds: 265

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            StringBuilder result = new StringBuilder();
            sc.nextInt();
             String upperDominoes = sc.next();
             for (char character : upperDominoes.toCharArray()) {
                if (character == 'U') {
                    result.append("D");
                } else if (character == 'D') {
                    result.append("U");
                } else {
                    result.append(character);
                }
            }
             System.out.println(result);
        }
    }
}