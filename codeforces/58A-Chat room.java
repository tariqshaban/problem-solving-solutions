// Time in milliseconds: 171

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> letters = new LinkedList<>();
        boolean doesReconstructWord = true;
         for (char character : sc.next().toCharArray()) {
            letters.add(character);
        }
         char[] word = new char[]{'h', 'e', 'l', 'l', 'o'};
        for (char wordLetter : word) {
            int letterIndex = letters.indexOf(wordLetter);
            if (letterIndex == -1) {
                doesReconstructWord = false;
                break;
            }
             letters = letters.subList(letterIndex + 1, letters.size());
        }
         if (doesReconstructWord) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}