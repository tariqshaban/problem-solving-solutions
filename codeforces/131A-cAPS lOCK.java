// Time in milliseconds: 233

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder word = new StringBuilder();
        boolean doesRequireModification = true;
         word.append(sc.next());
         for (int i = 1; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i))) {
                doesRequireModification = false;
                break;
            }
        }
         String result = word.toString();
         if (doesRequireModification) {
            char firstLetter = Character.isUpperCase(word.charAt(0)) ? Character.toLowerCase(word.charAt(0)) : Character.toUpperCase(word.charAt(0));
             result = firstLetter + word.substring(1).toLowerCase();
        }
         System.out.println(result);
    }
}