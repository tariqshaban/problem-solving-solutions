// Time in milliseconds: 186

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letters = sc.nextLine().replace(" ", "")
                .replace("{", "")
                .replace("}", "")
                .trim();
         HashSet<String> lettersSet = new HashSet<>(Arrays.asList(letters.split(",")));
         if (lettersSet.size() == 1 && lettersSet.contains("")) {
            System.out.println(0);
        } else {
            System.out.println(lettersSet.size());
        }
     }
}