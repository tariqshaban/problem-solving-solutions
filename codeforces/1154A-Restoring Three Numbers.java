// Time in milliseconds: 202

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();
         for (int i = 0; i < 4; i++) {
            numbers.add(sc.nextInt());
        }
         int total = Collections.max(numbers);
        numbers.remove((Integer) total);
         for (int i = 0; i < 3; i++) {
            numbers.set(i, total - numbers.get(i));
            System.out.print(numbers.get(i) + " ");
        }
    }
}