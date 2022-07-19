// Time in milliseconds: 404

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        LinkedList<Integer> numbers = new LinkedList<>();
        int numberOfEvens = 0;
        int numberOfOdds = 0;
         for (int i = 0; i < length; i++) {
            int number = sc.nextInt();
            numbers.add(number);
             if (number % 2 == 0) {
                numberOfEvens++;
            } else {
                numberOfOdds++;
            }
        }
         for (int i = 0; i < length; i++) {
            if (numberOfEvens == 1 && numbers.get(i) % 2 == 0 ||
                    numberOfOdds == 1 && numbers.get(i) % 2 != 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}