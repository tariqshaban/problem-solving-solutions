// Time in milliseconds: 265

import java.util.LinkedList;
import java.util.Scanner;
 import static java.lang.Math.max;
import static java.lang.Math.min;
 public class Main {
     static int getDenseDifference(int a, int b) {
        int difference = 0;
         if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
         while (b > a * 2) {
            b -= b / 2;
             difference++;
        }
         return difference;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Integer> numbers = new LinkedList<>();
         for (int i = 0; i < numberOfCases; i++) {
            int length = sc.nextInt();
            int counter = 0;
             for (int j = 0; j < length; j++) {
                numbers.add(sc.nextInt());
            }
             for (int j = 1; j < length; j++) {
                int firstNumber = numbers.get(j - 1);
                int secondNumber = numbers.get(j);
                boolean isMaxGreaterThenDoubleMin = (max(firstNumber, secondNumber)) > (min(firstNumber, secondNumber) * 2);
                 if (isMaxGreaterThenDoubleMin) {
                    counter += getDenseDifference(firstNumber, secondNumber);
                }
            }
             System.out.println(counter);
            numbers.clear();
        }
    }
}