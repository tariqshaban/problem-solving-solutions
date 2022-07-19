// Time in milliseconds: 592

import java.util.Collections;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            LinkedList<Integer> numbers = new LinkedList<>();
             for (int j = 0; j < 3; j++) {
                numbers.add(sc.nextInt());
            }
             Collections.sort(numbers);
             if (!Objects.equals(numbers.get(1), numbers.get(2))) {
                System.out.println("NO");
                continue;
            }
             System.out.println("YES");
            System.out.println(numbers.get(0) + " " + numbers.get(0) + " " + numbers.get(1));
             numbers.clear();
        }
    }
}