// Time in milliseconds: 234

import java.util.Scanner;
 public class Main {
    static boolean isComposite(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
         for (int i = 4; i <= number / 2; i++) {
            if (isComposite(i) && isComposite(number - i)) {
                System.out.println((i) + " " + (number - i));
                break;
            }
        }
     }
}