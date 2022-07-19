// Time in milliseconds: 390

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Integer> sequence = new LinkedList<>();
         for (int i = 0; i < numberOfCases; i++) {
            int listSize = sc.nextInt();
            boolean isLeftTurn = true;
             for (int j = 0; j < listSize; j++) {
                sequence.add(sc.nextInt());
            }
             while (!sequence.isEmpty()) {
                if (isLeftTurn) {
                    System.out.print(sequence.getFirst() + " ");
                    sequence.remove(0);
                } else {
                    System.out.print(sequence.getLast() + " ");
                    sequence.remove(sequence.size() - 1);
                }
                 isLeftTurn = !isLeftTurn;
            }
             System.out.println();
        }
    }
}