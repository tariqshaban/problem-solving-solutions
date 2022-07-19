// Time in milliseconds: 280

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int zeros = 0;
            int ones = 0;
             for (char character : sc.next().toCharArray()) {
                if (character == '0') {
                    zeros++;
                } else {
                    ones++;
                }
            }
             if (zeros > ones) {
                System.out.println(ones);
            } else if (ones > zeros) {
                System.out.println(zeros);
            } else {
                System.out.println(zeros - 1);
            }
        }
    }
}