// Time in milliseconds: 590

import java.util.HashMap;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfGroups = sc.nextInt();
        HashMap<Integer, Integer> groups = new HashMap<>();
        int numberOfTaxis = 0;
         groups.put(1, 0);
        groups.put(2, 0);
        groups.put(3, 0);
        groups.put(4, 0);
         for (int i = 0; i < numberOfGroups; i++) {
            int groupNumbers = sc.nextInt();
            groups.put(groupNumbers, groups.get(groupNumbers) + 1);
        }
         numberOfTaxis = groups.get(4) + groups.get(3) + groups.get(2) / 2;
        groups.put(1, groups.get(1) - groups.get(3));
        if (groups.get(2) % 2 == 1) {
            numberOfTaxis++;
            groups.put(1, groups.get(1) - 2);
        }
        if (groups.get(1) > 0) {
            numberOfTaxis += (groups.get(1) + 3) / 4;
        }
         System.out.println(numberOfTaxis);
    }
}