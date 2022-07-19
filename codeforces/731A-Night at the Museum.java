// Time in milliseconds: 186

import java.util.Scanner;
 import static java.lang.Math.abs;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
         int lastCharacter = 'a';
        int counter = 0;
         for (int i = 0; i < text.length(); i++) {
            int difference = abs(text.charAt(i) - lastCharacter);
             if (difference > 13) {
                counter += 26 - difference;
            } else {
                counter += difference;
            }
             lastCharacter = text.charAt(i);
        }
         System.out.println(counter);
    }
}