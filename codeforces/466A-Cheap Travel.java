// Time in milliseconds: 187

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ridesNeeded = sc.nextInt();
        int ridesCoveredByBundle = sc.nextInt();
        int ridePrice = sc.nextInt();
        int bundlePrice = sc.nextInt();
        int minimumRequired = 0;
         if (bundlePrice > ridePrice * ridesCoveredByBundle) {
            minimumRequired += ridesNeeded * ridePrice;
        } else {
            minimumRequired += (ridesNeeded / ridesCoveredByBundle) * bundlePrice;
            minimumRequired += Math.min(bundlePrice, (ridesNeeded % ridesCoveredByBundle) * ridePrice);
        }
         System.out.println(minimumRequired);
    }
}