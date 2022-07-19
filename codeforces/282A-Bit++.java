// Time in milliseconds: 187

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
         int numberOfStatements = sc.nextInt();
         for (int i = 0; i < numberOfStatements; i++) {
            String statement = sc.next();
             if (statement.contains("+")) {
                result++;
            } else {
                result--;
            }
        }
         System.out.printf(Integer.toString(result));
    }
}