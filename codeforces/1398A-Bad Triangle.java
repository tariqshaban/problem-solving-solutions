// Time in milliseconds: 373

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
    static String getNonDegenerateTriangleExist(LinkedList<Long> numbers) {
        long firstNumber = numbers.get(0);
        long secondNumber = numbers.get(1);
         if (numbers.getLast() >= firstNumber + secondNumber) {
            return 1 + " " + 2 + " " + numbers.size();
        }
        return "-1";
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Long> numbers = new LinkedList<>();
         for (int i = 0; i < numberOfCases; i++) {
            int length = sc.nextInt();
            for (int j = 0; j < length; j++) {
                numbers.add(sc.nextLong());
            }
            System.out.println(getNonDegenerateTriangleExist(numbers));
            numbers.clear();
        }
    }
}