// Time in milliseconds: 342

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Integer> permutation = new LinkedList<>();
         for (int i = 0; i < numberOfCases; i++) {
            int length = sc.nextInt() * 2;
             for (int j = 0; j < length; j++) {
                int number = sc.nextInt();
                if (!permutation.contains(number)) {
                    permutation.add(number);
                }
            }
             for (int number : permutation) {
                System.out.println(number);
            }
             permutation.clear();
        }
    }
}