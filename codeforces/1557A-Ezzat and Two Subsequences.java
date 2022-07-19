// Time in milliseconds: 654

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
             for (int j = 0; j < length; j++) {
                numbers.add(sc.nextInt());
            }
             int maxNumber = Collections.max(numbers);
            numbers.remove(Integer.valueOf(maxNumber));
             double mean = 0;
            for (int number : numbers) {
                mean += number;
            }
            mean /= numbers.size();
             System.out.println(maxNumber + mean);
             numbers.clear();
        }
    }
}