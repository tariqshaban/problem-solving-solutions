// Time in milliseconds: 187

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            char[] numbers = sc.next().toCharArray();
            int firstHalfSum = 0;
            int secondHalfSum = 0;
             for (int j = 0; j < numbers.length / 2; j++) {
                firstHalfSum += Integer.parseInt(String.valueOf(numbers[j]));
            }
            for (int j = numbers.length / 2; j < numbers.length; j++) {
                secondHalfSum += Integer.parseInt(String.valueOf(numbers[j]));
            }
             System.out.println((firstHalfSum==secondHalfSum)?"YES":"NO");
        }
    }
}