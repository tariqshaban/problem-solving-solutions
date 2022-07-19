// Time in milliseconds: 374

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfContests = sc.nextInt();
         int best = sc.nextInt();
        int worst = best;
         int result = 0;
         for (int i = 1; i < numberOfContests; i++) {
            int currentContest = sc.nextInt();
             if (currentContest > best) {
                result++;
                best = currentContest;
            } else if (currentContest < worst) {
                result++;
                worst = currentContest;
            }
        }
         System.out.println(result);
    }
}