// Time in milliseconds: 295

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 import static java.lang.Math.max;
import static java.lang.Math.min;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            LinkedList<Integer> participantsScores = new LinkedList<>();
            for (int j = 0; j < 4; j++) {
                participantsScores.add(sc.nextInt());
            }
             int highestSkill = Collections.max(participantsScores);
             int secondHighestSkill = -1;
            for (int participantScore : participantsScores) {
                if (participantScore > secondHighestSkill && participantScore != highestSkill) {
                    secondHighestSkill = participantScore;
                }
            }
             int highestSkillIndex = participantsScores.indexOf(highestSkill);
            int secondHighestSkillIndex = participantsScores.indexOf(secondHighestSkill);
             int firstIndex = min(highestSkillIndex, secondHighestSkillIndex);
            int secondIndex = max(highestSkillIndex, secondHighestSkillIndex);
             if (firstIndex <= 1 && secondIndex >= 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}