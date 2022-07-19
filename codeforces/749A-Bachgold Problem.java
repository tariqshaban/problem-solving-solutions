// Time in milliseconds: 561

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        LinkedList<Integer> result = new LinkedList<>();
         for (int i = 0; i < number / 2; i++) {
            result.add(2);
        }
         if (number % 2 != 0) {
            result.remove(0);
            result.add(3);
        }
         System.out.println(result.size());
        for (int prime : result) {
            System.out.println(prime + " ");
        }
    }
}