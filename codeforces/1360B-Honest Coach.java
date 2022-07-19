// Time in milliseconds: 264

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Integer> athletes = new LinkedList<>();
        int strengthDifference;
         for (int i = 0; i < numberOfCases; i++) {
            int numberOfAthletes = sc.nextInt();
             for (int j = 0; j < numberOfAthletes; j++) {
                athletes.add(sc.nextInt());
            }
             Collections.sort(athletes);
             strengthDifference = athletes.get(1) - athletes.get(0);
            for (int j = 1; j < athletes.size(); j++) {
                if (strengthDifference > athletes.get(j) - athletes.get(j - 1)) {
                    strengthDifference = athletes.get(j) - athletes.get(j - 1);
                }
             }
             System.out.println(strengthDifference);
             athletes.clear();
        }
    }
}