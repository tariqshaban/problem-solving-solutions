// Time in milliseconds: 233

import java.util.Objects;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        long onHandIceCream = sc.nextLong();
        int distressedKids = 0;
         for (int i = 0; i < length; i++) {
            boolean isDeduct = Objects.equals(sc.next(), "-");
            long amount = sc.nextLong();
             if (isDeduct) {
                if (amount > onHandIceCream) {
                    distressedKids++;
                } else {
                    onHandIceCream -= amount;
                }
            } else {
                onHandIceCream += amount;
            }
        }
         System.out.println(onHandIceCream + " " + distressedKids);
    }
}