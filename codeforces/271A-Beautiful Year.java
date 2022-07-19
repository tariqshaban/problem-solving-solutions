// Time in milliseconds: 374

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean conditionSatisfied;
         while (true) {
            conditionSatisfied = true;
            year++;
             String yearsString = Integer.toString(year);
            for (int i = 0; i < yearsString.length(); i++) {
                for (int j = 0; j < yearsString.length(); j++) {
                    if (yearsString.charAt(i) == yearsString.charAt(j) && i != j) {
                        conditionSatisfied = false;
                        break;
                    }
                }
            }
            if (conditionSatisfied) {
                System.out.println(year);
                break;
            }
        }
    }
}