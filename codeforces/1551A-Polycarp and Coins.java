// Time in milliseconds: 343

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
         for (int i = 0; i < testCases; i++) {
             int requiredMoney = sc.nextInt();
             int coin1 = requiredMoney / 3;
            int coin2 = requiredMoney / 3;
             int calculatedRequiredMoney = (coin1 * 3 + coin2 * 3) / 2;
             if (calculatedRequiredMoney - requiredMoney == -1) {
                coin1++;
            } else if (calculatedRequiredMoney - requiredMoney == -2) {
                coin2++;
            }
             System.out.println(coin1+" "+coin2);
        }
    }
}