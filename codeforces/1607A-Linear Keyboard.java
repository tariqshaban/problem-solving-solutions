// Time in milliseconds: 202

import java.util.LinkedList;
import java.util.Scanner;
 import static java.lang.Math.abs;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            char[] keyboardLayout = sc.next().toCharArray();
            char[] specifiedWord = sc.next().toCharArray();
            int distance = 0;
             LinkedList<Character> keyboardLayoutList = new LinkedList<>();
            LinkedList<Character> specifiedWordList = new LinkedList<>();
             for (char c : keyboardLayout) {
                keyboardLayoutList.add(c);
            }
             for (char c : specifiedWord) {
                specifiedWordList.add(c);
            }
             for (int j = 1; j < specifiedWordList.size(); j++) {
                char previousWord = specifiedWordList.get(j - 1);
                char currentWord = specifiedWordList.get(j);
                distance += abs(keyboardLayoutList.indexOf(currentWord) - keyboardLayoutList.indexOf(previousWord));
            }
             System.out.println(distance);
        }
    }
}