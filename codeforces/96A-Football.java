// Time in milliseconds: 372

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxConsecutive = 0;
        int currentConsecutive = 0;
        char previousTeam = '-';
         for (char playerTeam : sc.next().toCharArray()) {
            if (playerTeam == previousTeam) {
                currentConsecutive++;
            } else {
                currentConsecutive = 1;
            }
             if (currentConsecutive > maxConsecutive) {
                maxConsecutive = currentConsecutive;
            }
             previousTeam = playerTeam;
        }
         if (maxConsecutive >= 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}