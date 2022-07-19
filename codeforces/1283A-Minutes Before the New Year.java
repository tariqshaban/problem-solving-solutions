// Time in milliseconds: 202

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int hours = sc.nextInt();
            int minutes = sc.nextInt();
             System.out.println(((23 - hours) * 60) + (60 - minutes));
        }
    }
}