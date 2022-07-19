// Time in milliseconds: 202

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();
        LinkedList<Integer> results = new LinkedList<>();
         results.add(firstNumber+secondNumber+thirdNumber);
        results.add((firstNumber+secondNumber)*thirdNumber);
        results.add(firstNumber*(secondNumber+thirdNumber));
        results.add(firstNumber*secondNumber*thirdNumber);
         System.out.println(Collections.max(results));
    }
}