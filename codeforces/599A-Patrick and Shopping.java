// Time in milliseconds: 202

import java.util.Scanner;
 import static java.lang.Math.min;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long firstShopDistance = sc.nextLong();
        long secondShopDistance = sc.nextLong();
        long shopConnectingDistance = sc.nextLong();
         long firstPossibility = firstShopDistance + secondShopDistance + shopConnectingDistance;
        long secondPossibility = 2 * firstShopDistance + 2 * secondShopDistance;
        long thirdPossibility = 2 * firstShopDistance + 2 * shopConnectingDistance;
        long fourthPossibility = 2 * secondShopDistance + 2 * shopConnectingDistance;
         System.out.println(min(firstPossibility, min(secondPossibility, min(thirdPossibility, fourthPossibility))));
    }
}