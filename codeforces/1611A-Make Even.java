// Time in milliseconds: 280

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Integer> numbers = new LinkedList<>();
         for (int i = 0; i < numberOfCases; i++) {
            String number = sc.next();
             for (char digit : number.toCharArray()) {
                numbers.add(Integer.parseInt(digit + ""));
            }
             int nearestEvenIndex = -1;
            for (int j = 0; j < numbers.size(); j++) {
                if (numbers.get(j) % 2 == 0) {
                    nearestEvenIndex = j;
                    break;
                }
            }
             int result;
            if (nearestEvenIndex == -1) {
                result = -1;
            } else if (numbers.getLast() % 2 == 0) {
                result = 0;
            } else if (numbers.getFirst() % 2 == 0) {
                result = 1;
            } else {
                result = 2;
            }
             System.out.println(result);
            numbers.clear();
        }
    }
}