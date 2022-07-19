// Time in milliseconds: 233

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();
        int minimumParticipation = sc.nextInt();
        LinkedList<Integer> studentsParticipation = new LinkedList<>();
        LinkedList<Integer> studentsParticipationFiltered = new LinkedList<>();
         for (int i = 0; i < numberOfStudents; i++) {
            studentsParticipation.add(sc.nextInt());
        }
         for (int i = 0; i < numberOfStudents; i++) {
            studentsParticipation.set(i, studentsParticipation.get(i) + minimumParticipation);
        }
         for (int i = 0; i < numberOfStudents; i++) {
            if (studentsParticipation.get(i) <= 5)
                studentsParticipationFiltered.add(studentsParticipation.get(i));
        }
         System.out.println(studentsParticipationFiltered.size() / 3);
    }
}