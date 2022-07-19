// Time in milliseconds: 202

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        LinkedList<Integer> bills = new LinkedList<>(Arrays.asList(100, 20, 10, 5, 1));
        int result = 0;
         for (int bill : bills) {
            result += money / bill;
            money %= bill;
        }
         System.out.println(result);
    }
}