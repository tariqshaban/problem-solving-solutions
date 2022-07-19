// Time in milliseconds: 202

import java.util.HashSet;
import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        sc.nextLine();
        String word = sc.nextLine().toLowerCase();
         HashSet<Character> uniqueCharacters = new HashSet<>();
         for (char character : word.toCharArray()) {
            uniqueCharacters.add(character);
        }
         if (uniqueCharacters.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}