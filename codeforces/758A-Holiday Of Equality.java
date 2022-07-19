// Time in milliseconds: 202

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCitizens = sc.nextInt();
        LinkedList<Integer> citizensWelfare = new LinkedList<>();
        int maxWelfare;
        int result = 0;
         for (int i = 0; i < numberOfCitizens; i++) {
            citizensWelfare.add(sc.nextInt());
        }
         maxWelfare = Collections.max(citizensWelfare);
         for (int citizenWelfare : citizensWelfare) {
            result += maxWelfare - citizenWelfare;
        }
         System.out.println(result);
    }
}