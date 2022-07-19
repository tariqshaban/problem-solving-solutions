// Time in milliseconds: 264

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Integer> numbers = new LinkedList<>();
          for (int i = 0; i < numberOfCases; i++) {
            int length = sc.nextInt();
            int sum = 0;
             for (int j = 0; j < length; j++) {
                numbers.add(sc.nextInt());
            }
             for (int number : numbers) {
                sum += number;
            }
             if (sum >= length) {
                System.out.println(sum - length);
            } else {
                System.out.println(1);
            }
             numbers.clear();
        }
    }
}