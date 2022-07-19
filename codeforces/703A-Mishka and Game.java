// Time in milliseconds: 218

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfRound = sc.nextInt();
        int firstPlayerWins = 0;
        int secondPlayerWins = 0;
         for (int i = 0; i < numberOfRound; i++) {
            int firstPlayerScore = sc.nextInt();
            int secondPlayerScore = sc.nextInt();
             if (firstPlayerScore > secondPlayerScore) {
                firstPlayerWins++;
            } else if (firstPlayerScore < secondPlayerScore) {
                secondPlayerWins++;
            }
        }
         if (firstPlayerWins > secondPlayerWins) {
            System.out.println("Mishka");
        } else if (firstPlayerWins < secondPlayerWins) {
            System.out.println("Chris");
        } else {
            System.out.println("Friendship is magic!^^");
        }
    }
}