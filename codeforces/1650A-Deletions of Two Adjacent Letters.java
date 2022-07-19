// Time in milliseconds: 202

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     static LinkedList<Integer> getOccurrencesList(String word, String substring) {
        LinkedList<Integer> occurrences = new LinkedList<>();
        for (int i = 0; i <= word.length() - substring.length(); i++) {
            if (word.startsWith(substring, i)) {
                occurrences.add(i);
            }
        }
        return occurrences;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            String word = sc.next();
            String reducedWord = sc.next();
             if (word.contains(reducedWord)) {
                LinkedList<Integer> occurrences = getOccurrencesList(word, reducedWord);
                boolean doesExist = false;
                for (int occurrence : occurrences) {
                    if (occurrence % 2 == 0) {
                        doesExist = true;
                        break;
                    }
                }
                if (doesExist) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}