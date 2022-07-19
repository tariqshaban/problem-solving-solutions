// Time in milliseconds: 342

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstWord = sc.next();
        String secondWord = sc.next();
         for (int i = 0; i < firstWord.length(); i++) {
            if (firstWord.charAt(i) != secondWord.charAt(secondWord.length() - 1 - i)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}