// Time in milliseconds: 592

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfHouses = sc.nextInt();
        int numberOfTasks = sc.nextInt();
        int previousHousePosition = 1;
        long requiredTimeUnits = 0;
         for (int i = 0; i < numberOfTasks; i++) {
            int currentHousePosition = sc.nextInt();
             if (currentHousePosition >= previousHousePosition) {
                requiredTimeUnits += currentHousePosition - previousHousePosition;
            } else {
                requiredTimeUnits += numberOfHouses - (previousHousePosition - currentHousePosition);
            }
             previousHousePosition = currentHousePosition;
        }
         System.out.println(requiredTimeUnits);
    }
}