// Time in milliseconds: 372

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> letters = new LinkedList<>();
         for (char character : sc.next().toLowerCase().toCharArray()) {
            letters.add(character);
        }
         letters.removeAll(Arrays.asList('a', 'o', 'y', 'e', 'u', 'i'));
         for (char character : letters) {
            System.out.print("." + character);
        }
    }
}