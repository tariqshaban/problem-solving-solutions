// Time in milliseconds: 217

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Integer> firstNumbers = new LinkedList<>();
        LinkedList<Integer> secondNumbers = new LinkedList<>();
         for (int i = 0; i < numberOfCases; i++) {
            int firstLength = sc.nextInt();
            int secondLength = sc.nextInt();
            boolean isFound = false;
             for (int j = 0; j < firstLength; j++) {
                firstNumbers.add(sc.nextInt());
            }
            for (int j = 0; j < secondLength; j++) {
                secondNumbers.add(sc.nextInt());
            }
             for (int j = 0; j < firstLength; j++) {
                int value = firstNumbers.get(j);
                if (secondNumbers.contains(value)) {
                    isFound = true;
                    System.out.println("YES");
                    System.out.println("1 " + value);
                    break;
                }
            }
             if (!isFound) {
                System.out.println("NO");
            }
             firstNumbers.clear();
            secondNumbers.clear();
        }
    }
}