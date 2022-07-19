// Time in milliseconds: 187

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weightA = sc.nextInt();
        int weightB = sc.nextInt();
        int elapsedYears = 0;
         while (weightA <= weightB) {
            weightA *= 3;
            weightB *= 2;
            elapsedYears++;
        }
         System.out.println(elapsedYears);
    }
}