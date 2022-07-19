// Time in milliseconds: 374

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next().toLowerCase();
        String word2 = sc.next().toLowerCase();
         for (int i = 0; i < word1.length(); i++) {
            if(word1.charAt(i)>word2.charAt(i)){
                System.out.println("1");
                return;
            } else if(word1.charAt(i)<word2.charAt(i)){
                System.out.println("-1");
                return;
            }
        }
        System.out.println("0");
    }
}