// Time in milliseconds: 327

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Integer> numbers = new LinkedList<>();
         for (int i = 0; i < numberOfCases; i++) {
            for (int j = 0; j < 7; j++) {
                numbers.add(sc.nextInt());
            }
             int a1 = numbers.get(0);
            int a2 = numbers.get(1);
            int a3 = numbers.getLast() - a1 - a2;
             System.out.println(a1 + " " + a2 + " " + a3);
             numbers.clear();
        }
    }
}