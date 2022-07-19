// Time in milliseconds: 218

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 import static java.lang.Math.floor;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Character> wordList = new LinkedList<>();
         for (int i = 0; i < numberOfCases; i++) {
            int counter = 0;
             String word = sc.next();
             for (char character : word.toCharArray()) {
                wordList.add(character);
            }
             Collections.sort(wordList);
             char lastCharacter = wordList.get(0);
            int lastCharacterCount = 0;
            for (Character character : wordList) {
                if (character == lastCharacter) {
                    if (lastCharacterCount < 2) {
                        counter++;
                    }
                    lastCharacterCount++;
                } else {
                    lastCharacterCount = 1;
                    counter++;
                }
                 lastCharacter = character;
            }
             System.out.println((int) floor(counter / 2.0));
            wordList.clear();
        }
    }
}