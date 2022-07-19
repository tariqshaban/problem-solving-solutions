// Time in milliseconds: 217

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> calories = new LinkedList<>();
        int caloriesWasted = 0;
         for (int i = 0; i < 4; i++) {
            calories.add(sc.nextInt());
        }
         for (char action : sc.next().toCharArray()) {
            caloriesWasted += calories.get(Integer.parseInt(action + "") - 1);
        }
         System.out.println(caloriesWasted);
    }
}