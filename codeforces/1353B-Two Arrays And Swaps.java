// Time in milliseconds: 202

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Integer> firstList = new LinkedList<>();
        LinkedList<Integer> secondList = new LinkedList<>();
         for (int i = 0; i < numberOfCases; i++) {
            int arrayLength = sc.nextInt();
            int maximumOperations = sc.nextInt();
             for (int j = 0; j < arrayLength; j++) {
                firstList.add(sc.nextInt());
            }
            for (int j = 0; j < arrayLength; j++) {
                secondList.add(sc.nextInt());
            }
             for (int j = 0; j < maximumOperations; j++) {
                int minFirst = Collections.min(firstList);
                int maxSecond = Collections.max(secondList);
                int lowestFirstIndex = firstList.indexOf(minFirst);
                int highestSecondIndex = secondList.indexOf(maxSecond);
                 if (minFirst < maxSecond) {
                    int temp = firstList.get(lowestFirstIndex);
                    firstList.set(lowestFirstIndex, secondList.get(highestSecondIndex));
                    secondList.set(highestSecondIndex, temp);
                }
            }
             int result = 0;
            for (int number : firstList) {
                result += number;
            }
            System.out.println(result);
             firstList.clear();
            secondList.clear();
        }
    }
}