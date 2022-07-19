// Time in milliseconds: 311

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Character> letters = new LinkedList<>();
         for (int i = 0; i < numberOfCases; i++) {
            boolean isAliceTurn = true;
             for (char character : sc.next().toCharArray()) {
                letters.add(character);
            }
             for (int j = 0; j < letters.size(); j++) {
                if (isAliceTurn) {
                    if (letters.get(j) != 'a') {
                        letters.set(j, 'a');
                    } else {
                        letters.set(j, 'b');
                    }
                } else {
                    if (letters.get(j) != 'z') {
                        letters.set(j, 'z');
                    } else {
                        letters.set(j, 'y');
                    }
                }
                 isAliceTurn = !isAliceTurn;
            }
             for (char letter : letters) {
                System.out.print(letter);
            }
            System.out.println();
             letters.clear();
        }
    }
}