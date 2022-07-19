// Time in milliseconds: 327

import java.util.Scanner;
 import static java.lang.Math.max;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int candidateA = sc.nextInt();
            int candidateB = sc.nextInt();
            int candidateC = sc.nextInt();
             int candidateARequirement = max(candidateB, candidateC) - candidateA + 1;
            int candidateBRequirement = max(candidateA, candidateC) - candidateB + 1;
            int candidateCRequirement = max(candidateA, candidateB) - candidateC + 1;
             if (candidateARequirement < 0) {
                candidateARequirement = 0;
            }
            if (candidateBRequirement < 0) {
                candidateBRequirement = 0;
            }
            if (candidateCRequirement < 0) {
                candidateCRequirement = 0;
            }
             System.out.println(candidateARequirement + " " + candidateBRequirement + " " + candidateCRequirement);
        }
    }
}