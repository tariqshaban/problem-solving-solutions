// Time in milliseconds: 468

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int playersStrength = sc.nextInt();
        int numberOfDragons = sc.nextInt();
        LinkedList<Integer> dragonsStrength = new LinkedList<>();
        LinkedList<Integer> dragonsBonus = new LinkedList<>();
        boolean isLevelAchievable = true;
         for (int i = 0; i < numberOfDragons; i++) {
            dragonsStrength.add(sc.nextInt());
            dragonsBonus.add(sc.nextInt());
        }
         while (!dragonsStrength.isEmpty()) {
            int lowestDragonStrength = Collections.min(dragonsStrength);
            int lowestDragonStrengthIndex = dragonsStrength.indexOf(lowestDragonStrength);
             if (playersStrength <= lowestDragonStrength) {
                isLevelAchievable = false;
                break;
            } else {
                playersStrength+= dragonsBonus.get(lowestDragonStrengthIndex);
                dragonsStrength.remove(lowestDragonStrengthIndex);
                dragonsBonus.remove(lowestDragonStrengthIndex);
            }
        }
         System.out.println(isLevelAchievable ? "YES" : "NO");
    }
}