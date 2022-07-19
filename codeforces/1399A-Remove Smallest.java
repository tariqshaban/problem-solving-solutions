// Time in milliseconds: 233

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int length = sc.nextInt();
             boolean doesSatisfyRequirements = true;
            LinkedList<Integer> elements = new LinkedList<>();
            for (int j = 0; j < length; j++) {
                elements.add(sc.nextInt());
            }
             Collections.sort(elements);
             for (int j = 1; j < elements.size(); j++) {
                if (elements.get(j) - elements.get(j - 1) > 1) {
                    doesSatisfyRequirements = false;
                    break;
                }
            }
             if (doesSatisfyRequirements) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}