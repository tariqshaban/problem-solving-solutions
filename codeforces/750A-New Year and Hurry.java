// Time in milliseconds: 186

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfQuestions = sc.nextInt();
        int minutesRequired = sc.nextInt();
        int timeRemaining = 240;
        int result = 0;
         for (int i = 1; i <= numberOfQuestions; i++) {
            if (timeRemaining - minutesRequired - 5 * i < 0) {
                break;
            }
             timeRemaining -= 5 * i;
            result++;
        }
         System.out.println(result);
    }
}