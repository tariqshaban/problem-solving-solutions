// Time in milliseconds: 202

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int shovelPrice = sc.nextInt();
        int oneDigitCoin = sc.nextInt();
         int result = 1;
         while (result * shovelPrice % 10 != oneDigitCoin && result * shovelPrice % 10 != 0) {
            result++;
        }
         System.out.println(result);
    }
}