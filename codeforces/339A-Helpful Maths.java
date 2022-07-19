// Time in milliseconds: 404

import java.util.Arrays;
import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] equation = sc.next().split("\\+");
        StringBuilder result = new StringBuilder();
         Arrays.sort(equation);
         for (String number : equation) {
            result.append(number).append("+");
        }
         result.deleteCharAt(result.length() - 1);
         System.out.println(result);
    }
}