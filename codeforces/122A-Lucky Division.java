// Time in milliseconds: 374

import java.util.List;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        List<Integer> luckyNumbers = List.of(4, 7, 47, 74, 44, 444, 447, 474, 477, 777, 774, 744);
         boolean isLucky = false;
        for (int luckyNumber : luckyNumbers) {
            if (number % luckyNumber == 0) {
                isLucky = true;
                break;
            }
        }
         System.out.println(isLucky ? "YES" : "NO");
    }
}