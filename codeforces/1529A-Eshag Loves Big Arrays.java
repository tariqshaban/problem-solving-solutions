// Time in milliseconds: 202

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Integer> numbers = new LinkedList<>();
         for (int i = 0; i < numberOfCases; i++) {
            int length = sc.nextInt();
            int counter = 0;
             for (int j = 0; j < length; j++) {
                numbers.add(sc.nextInt());
            }
             int minimum = Collections.min(numbers);
            for (int number : numbers) {
                if (number > minimum) {
                    counter++;
                }
            }
             System.out.println(counter);
            numbers.clear();
        }
    }
}