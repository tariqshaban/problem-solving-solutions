// Time in milliseconds: 280

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Character> characters = new LinkedList<>();
         for (int i = 0; i < numberOfCases; i++) {
            for (char character : sc.next().toCharArray()) {
                characters.add(character);
            }
             Collections.sort(characters);
             for(char character:characters){
                System.out.print(character);
            }
             System.out.println();
            characters.clear();
        }
    }
}