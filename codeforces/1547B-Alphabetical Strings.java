// Time in milliseconds: 311

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Character> alphabets = new LinkedList<>();
         for (int i = 0; i < numberOfCases; i++) {
            for (char character : sc.next().toCharArray()) {
                alphabets.add(character);
            }
             int startingIndex = alphabets.indexOf('a');
            char currentChar = 'a';
             while (startingIndex != -1 &&
                    ((startingIndex != 0 && alphabets.get(startingIndex - 1) - alphabets.get(startingIndex) == 1) ||
                            (startingIndex != alphabets.size() - 1 && alphabets.get(startingIndex + 1) - alphabets.get(startingIndex) == 1) ||
                            (alphabets.size() == 1))) {
                alphabets.remove(startingIndex);
                currentChar = (char) (currentChar + 1);
                startingIndex = alphabets.indexOf(currentChar);
            }
             if (alphabets.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
             alphabets.clear();
        }
    }
}