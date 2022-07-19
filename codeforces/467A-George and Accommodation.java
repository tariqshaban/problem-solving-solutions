// Time in milliseconds: 187

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfRooms = sc.nextInt();
        int result = 0;
         for (int i = 0; i < numberOfRooms; i++) {
            int accommodated = sc.nextInt();
            int capacity = sc.nextInt();
             if (accommodated + 2 <= capacity) {
                result++;
            }
        }
         System.out.println(result);
    }
}