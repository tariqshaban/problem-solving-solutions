// Time in milliseconds: 404

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfDrinks = sc.nextInt();
        double result = 0;
         for (int i = 0; i < numberOfDrinks; i++) {
            int drinkPercentage = sc.nextInt();
             result += drinkPercentage;
        }
         System.out.println(result / numberOfDrinks);
    }
}