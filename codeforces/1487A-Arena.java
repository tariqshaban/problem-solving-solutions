// Time in milliseconds: 264

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Integer> heroesLevels = new LinkedList<>();
          for (int i = 0; i < numberOfCases; i++) {
            int numberOfHeroes = sc.nextInt();
             for (int j = 0; j < numberOfHeroes; j++) {
                heroesLevels.add(sc.nextInt());
            }
             Collections.sort(heroesLevels);
             int firstHerLevel = heroesLevels.getFirst();
             while (heroesLevels.contains(firstHerLevel)) {
                heroesLevels.remove(Integer.valueOf(firstHerLevel));
            }
             System.out.println(heroesLevels.size());
             heroesLevels.clear();
        }
    }
}