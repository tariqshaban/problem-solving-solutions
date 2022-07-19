// Time in milliseconds: 404

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] word = sc.next().toCharArray();
         word[0] = Character.toString(word[0]).toUpperCase().toCharArray()[0];
         System.out.println(word);
    }
}