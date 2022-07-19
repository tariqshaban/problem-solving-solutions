// Time in milliseconds: 372

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTeams = sc.nextInt();
        LinkedList<Integer> homeNumbers = new LinkedList<>();
        LinkedList<Integer> guestNumbers = new LinkedList<>();
        int occurrences = 0;
         for (int i = 0; i < numberOfTeams; i++) {
            homeNumbers.add(sc.nextInt());
            guestNumbers.add(sc.nextInt());
        }
         for (int homeNumber : homeNumbers) {
            for (int guestNumber : guestNumbers) {
                if (homeNumber == guestNumber) {
                    occurrences++;
                }
            }
        }
         System.out.println(occurrences);
    }
}