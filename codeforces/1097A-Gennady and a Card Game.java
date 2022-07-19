// Time in milliseconds: 187

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cardOnTable = sc.next();
         for (int i = 0; i < 5; i++) {
            String cardOnHand = sc.next();
                        if(cardOnHand.charAt(0) == cardOnTable.charAt(0) || cardOnHand.charAt(1) == cardOnTable.charAt(1)){
                System.out.println("YES");
                return;
            }
        }
                System.out.println("NO");
    }
}