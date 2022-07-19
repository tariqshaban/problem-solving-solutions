// Time in milliseconds: 202

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int result = 0;
         for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                for (int k = j + 1; k < word.length(); k++) {
                    if (word.charAt(i) == 'Q' && word.charAt(j) == 'A' && word.charAt(k) == 'Q') {
                        result++;
                    }
                }
            }
        }
         System.out.println(result);
    }
}