// Time in milliseconds: 561

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int length = sc.nextInt();
            int counter = 0;
             for (int j = 0; j < length; j++) {
                int number = sc.nextInt();
                 if (number == 1 || number == 3){
                    counter++;
                }
            }
             System.out.println(counter);
        }
    }
}