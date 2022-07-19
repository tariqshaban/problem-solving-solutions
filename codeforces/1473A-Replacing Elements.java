// Time in milliseconds: 421

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
            int threshold = sc.nextInt();
             sc.nextLine();
             for (int j = 0; j < length; j++) {
                numbers.add(sc.nextInt());
            }
             sc.nextLine();
             Collections.sort(numbers);
             if (numbers.getFirst() + numbers.get(1) <= threshold || numbers.getLast() <= threshold) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
             numbers.clear();
        }
    }
}