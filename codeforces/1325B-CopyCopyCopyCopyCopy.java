// Time in milliseconds: 467

import java.util.HashSet;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        HashSet<Integer> numbers = new HashSet<>();
         for (int i = 0; i < numberOfCases; i++) {
            int length = sc.nextInt();
             for (int j = 0; j < length; j++) {
                numbers.add(sc.nextInt());
            }
             System.out.println(numbers.size());
            numbers.clear();
        }
    }
}