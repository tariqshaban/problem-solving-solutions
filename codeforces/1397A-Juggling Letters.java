// Time in milliseconds: 202

import java.util.*;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        HashMap<Character, Integer> characterCount = new HashMap<>();
         for (int i = 0; i < numberOfCases; i++) {
            int numberOfWords = sc.nextInt();
             for (int j = 0; j < numberOfWords; j++) {
                String word = sc.next();
                 for (Character character : word.toCharArray()) {
                    if (characterCount.containsKey(character)) {
                        characterCount.put(character, characterCount.get(character) + 1);
                    } else {
                        characterCount.put(character, 1);
                    }
                }
            }
             LinkedList<Integer> occurrences = new LinkedList<>(characterCount.values());
            Collections.sort(occurrences);
             boolean isEvenlyDistributed = true;
            for (int occurrence : occurrences) {
                if (occurrence % numberOfWords != 0) {
                    isEvenlyDistributed = false;
                    break;
                }
            }
             if (isEvenlyDistributed) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
             characterCount.clear();
        }
    }
}