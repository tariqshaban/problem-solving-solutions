// Time in milliseconds: 186

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstNumber = sc.next();
        String secondNumber = sc.next();
        StringBuilder result = new StringBuilder();
         for (int i = 0; i < firstNumber.length(); i++) {
            if(firstNumber.charAt(i) == secondNumber.charAt(i)){
                result.append("0");
            }else {
                result.append("1");
            }
        }
         System.out.println(result);
    }
}