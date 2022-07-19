// Time in milliseconds: 202

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
            int evens = 0;
            int odds = 0;
              for (int j = 0; j < length; j++) {
                numbers.add(sc.nextInt());
            }
             for (int number : numbers) {
                sum += number;
                if (number % 2 == 0) {
                    evens++;
                } else {
                    odds++;
                }
            }
             if (sum % 2 != 0) {
                System.out.println("YES");
            } else {
                 if (evens != 0 && odds != 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
             numbers.clear();
        }
    }
}