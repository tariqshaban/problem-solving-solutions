// Time in milliseconds: 372

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
         int uppers = 0;
         for (char character : word.toCharArray()) {
            if (Character.isUpperCase(character)) {
                uppers++;
            }
        }
         if (uppers > word.length() / 2) {
            System.out.println(word.toUpperCase());
        } else {
            System.out.println(word.toLowerCase());
        }
    }
}