// Time in milliseconds: 218

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int number = sc.nextInt();
             int answer = number / 10;
             if (number % 10 == 9) {
                answer++;
            }
             System.out.println(answer);
        }
    }
}