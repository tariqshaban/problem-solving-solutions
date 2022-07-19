// Time in milliseconds: 404

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        String stonesOrder = sc.next();
        char previousStone = ' ';
        int result = 0;
         for (char stone : stonesOrder.toCharArray()) {
            if (stone == previousStone) {
                result++;
            }
            previousStone = stone;
        }
         System.out.println(result);
    }
}