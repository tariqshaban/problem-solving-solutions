// Time in milliseconds: 498

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();
        LinkedList<String> students = new LinkedList<>();
        LinkedList<String> formedTeams = new LinkedList<>();
        int teams = 0;
         for (int i = 0; i < numberOfStudents; i++) {
            students.add(sc.next());
        }
         while (students.contains("1") && students.contains("2") && students.contains("3")) {
            int programmingIndex = students.indexOf("1");
            int mathsIndex = students.indexOf("2");
            int peIndex = students.indexOf("3");
             formedTeams.add((programmingIndex + 1) + " " + (mathsIndex + 1) + " " + (peIndex + 1));
            students.set(programmingIndex, "_");
            students.set(mathsIndex, "_");
            students.set(peIndex, "_");
            teams++;
        }
         System.out.println(teams);
        for (String team : formedTeams) {
            System.out.println(team);
        }
    }
}