// Time in milliseconds: 404

import java.util.LinkedHashSet;
import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
         LinkedHashSet<String> uniqueCharacters = new LinkedHashSet<>();
         for (int i = 0; i < name.length(); i++) {
            uniqueCharacters.add(Character.toString(name.charAt(i)));
        }
         if (uniqueCharacters.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}