// Time in milliseconds: 374

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] damage = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int numberOfDragons = sc.nextInt();
        int escaped = 0;
         for (int i = 1; i <= numberOfDragons; i++) {
            boolean isDamaged = false;
            for (int k : damage) {
                if (i % k == 0) {
                    isDamaged = true;
                    break;
                }
            }
            if (!isDamaged) {
                escaped++;
            }
        }
         System.out.println(numberOfDragons - escaped);
    }
}