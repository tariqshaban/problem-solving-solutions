// Time in milliseconds: 404

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stones = sc.next();
        String instructions = sc.next();
        int moves = 0;
         for (int i = 0; i < instructions.length(); i++) {
            if (instructions.charAt(i) == stones.charAt(moves)) {
                moves++;
            }
        }
         System.out.println(moves + 1);
    }
}