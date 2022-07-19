// Time in milliseconds: 390

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Integer> numbers = new LinkedList<>();
         for (int i = 0; i < numberOfCases; i++) {
            int length = sc.nextInt();
            int count = 0;
             for (int j = 0; j < length; j++) {
                numbers.add(sc.nextInt());
            }
             int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
             if (sum * 1.0 % length != 0) {
                System.out.println(-1);
                numbers.clear();
                continue;
            }
             int avg = sum / length;
            for (int number : numbers) {
                if (number > avg) {
                    count++;
                }
            }
             System.out.println(count);
             numbers.clear();
        }
    }
}