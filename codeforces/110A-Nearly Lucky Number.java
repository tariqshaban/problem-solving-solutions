// Time in milliseconds: 404

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        int luckyCount = 0;
         for (char character : number.toCharArray()) {
            if (character == '4' || character == '7') {
                luckyCount++;
            }
        }
         if (luckyCount == 4 || luckyCount == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}