// Time in milliseconds: 233

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCards = sc.nextInt();
        int firstPlayerScore = 0;
        int secondPlayerScore = 0;
        LinkedList<Integer> cards = new LinkedList<>();
         for (int j = 0; j < numberOfCards; j++) {
            cards.add(sc.nextInt());
        }
         boolean isFirstPlayerTurn = true;
        while (!cards.isEmpty()) {
            int score;
             if (cards.getFirst() > cards.getLast()) {
                score = cards.getFirst();
                cards.remove(0);
            } else {
                score = cards.getLast();
                cards.remove(cards.size() - 1);
            }
             if (isFirstPlayerTurn) {
                firstPlayerScore += score;
            } else {
                secondPlayerScore += score;
            }
             isFirstPlayerTurn = !isFirstPlayerTurn;
        }
         System.out.println(firstPlayerScore + " " + secondPlayerScore);
    }
}