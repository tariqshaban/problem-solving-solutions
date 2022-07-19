// Time in milliseconds: 374

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<LinkedList<Integer>> forces = new LinkedList<>();
        LinkedList<Integer> equilibrium = new LinkedList<>();
        int numberOfForces = sc.nextInt();
        final int NUMBER_OF_DIMENSIONS = 3;
         for (int i = 0; i < numberOfForces; i++) {
            forces.add(new LinkedList<>());
             for (int j = 0; j < NUMBER_OF_DIMENSIONS; j++) {
                forces.getLast().add(sc.nextInt());
            }
        }
         for (int i = 0; i < NUMBER_OF_DIMENSIONS; i++) {
            equilibrium.add(0);
        }
         for (LinkedList<Integer> force : forces) {
            for (int j = 0; j < NUMBER_OF_DIMENSIONS; j++) {
                equilibrium.set(j, equilibrium.get(j) + force.get(j));
            }
        }
         boolean isEquilibriumAchieved = true;
        for (int dimensionForce : equilibrium) {
            if (dimensionForce != 0) {
                isEquilibriumAchieved = false;
                break;
            }
        }
         if (isEquilibriumAchieved) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}