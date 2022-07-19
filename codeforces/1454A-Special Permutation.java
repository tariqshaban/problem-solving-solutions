// Time in milliseconds: 217

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Integer> numbers = new LinkedList<>();
         for (int i = 0; i < numberOfCases; i++) {
            int size = sc.nextInt();
             for (int j = 0; j < size; j++) {
                numbers.add(j + 1);
            }
             numbers.remove(0);
            numbers.add(1);
             for (int number : numbers) {
                System.out.print(number + " ");
            }
             System.out.println();
            numbers.clear();
        }
    }
}